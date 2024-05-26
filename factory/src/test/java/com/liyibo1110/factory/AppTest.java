package com.liyibo1110.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void shouldExecuteWithoutExceptions() {
        Assertions.assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
