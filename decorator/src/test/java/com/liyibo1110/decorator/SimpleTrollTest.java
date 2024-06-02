package com.liyibo1110.decorator;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author liyibo
 * @date 2024-05-31 17:54
 */
class SimpleTrollTest {

    private InMemoryAppender appender;

    @BeforeEach
    void setUp() {
        appender = new InMemoryAppender(SimpleTroll.class);
    }

    @AfterEach
    void tearDown() {
        appender.stop();
    }

    @Test
    void testTrollActions() {
        final var troll = new SimpleTroll();
        Assertions.assertEquals(10, troll.getAttackPower());

        troll.attack();
        assertEquals("The troll tries to grab you!", appender.getLastMessage());

        troll.fleeBattle();
        assertEquals("The troll shrieks in horror and runs away!", appender.getLastMessage());

        assertEquals(2, appender.getLogSize());
    }

    private static class InMemoryAppender extends AppenderBase<ILoggingEvent> {

        private final List<ILoggingEvent> log = new LinkedList();

        InMemoryAppender(Class clazz) {
            ((Logger) LoggerFactory.getLogger(clazz)).addAppender(this);
            start();
        }

        @Override
        protected void append(ILoggingEvent eventObject) {
            log.add(eventObject);
        }

        String getLastMessage() {
            return log.get(log.size() - 1).getMessage();
        }

        int getLogSize() {
            return log.size();
        }
    }
}
