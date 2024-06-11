package com.liyibo1110.poison.pill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author liyibo
 * @date 2024-06-11 15:29
 */
class PoisonMessageTest {

    @Test
    void testAddHeader() {
        assertThrows(UnsupportedOperationException.class, () -> Message.POISON_PILL.addHeader(Message.Headers.SENDER, "sender"));
    }

    @Test
    void testGetHeader() {
        assertThrows(UnsupportedOperationException.class, () -> Message.POISON_PILL.getHeader(Message.Headers.SENDER));
    }

    @Test
    void testGetHeaders() {
        assertThrows(UnsupportedOperationException.class, Message.POISON_PILL::getHeaders);
    }

    @Test
    void testSetBody() {
        assertThrows(UnsupportedOperationException.class, () -> Message.POISON_PILL.setBody("test message"));
    }

    @Test
    void testGetBody() {
        assertThrows(UnsupportedOperationException.class, Message.POISON_PILL::getBody);
    }
}
