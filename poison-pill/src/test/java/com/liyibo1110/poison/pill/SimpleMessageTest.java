package com.liyibo1110.poison.pill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author liyibo
 * @date 2024-06-11 15:16
 */
class SimpleMessageTest {

    @Test
    void testGetHeaders() {
        final var message = new SimpleMessage();
        assertNotNull(message.getHeaders());
        assertTrue(message.getHeaders().isEmpty());

        final var senderName = "test";
        message.addHeader(Message.Headers.SENDER, senderName);
        assertNotNull(message.getHeaders());
        assertFalse(message.getHeaders().isEmpty());
        assertEquals(senderName, message.getHeaders().get(Message.Headers.SENDER));
    }

    void testUnModifiableHeaders() {
        final var message = new SimpleMessage();
        final var headers = message.getHeaders();
        assertThrows(UnsupportedOperationException.class, () -> headers.put(Message.Headers.SENDER, "test"));
    }
}
