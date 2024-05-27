package com.liyibo1110.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author liyibo
 * @date 2024-05-27 16:28
 */
public class AppTest {

    @Test
    void shouldExecuteApplicationWithoutException() {
        Assertions.assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
