package com.liyibo1110.template.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTest {

  @Test
  void shouldExecuteWithoutException() {
    assertDoesNotThrow(() -> App.main(new String[]{}));
  }
}
