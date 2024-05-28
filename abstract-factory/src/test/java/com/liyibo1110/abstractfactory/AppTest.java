package com.liyibo1110.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTest {
    
  @Test
  void shouldExecuteApplicationWithoutException() {

	  assertDoesNotThrow(() -> App.main(new String[]{}));
  }
}
