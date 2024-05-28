package com.liyibo1110.template.method;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class HalflingThiefTest {

  @Test
  void testSteal() {
    final var method = Mockito.spy(StealingMethod.class);
    final var thief = new HalflingThief(method);

    thief.steal();
    Mockito.verify(method).steal();
    String target = Mockito.verify(method).pickTarget();
    Mockito.verify(method).confuseTarget(target);
    Mockito.verify(method).stealTheItem(target);

    Mockito.verifyNoMoreInteractions(method);
  }

  @Test
  void testChangeMethod() {
    final var initialMethod = Mockito.spy(StealingMethod.class);
    final var thief = new HalflingThief(initialMethod);

    thief.steal();
    Mockito.verify(initialMethod).steal();
    String target = Mockito.verify(initialMethod).pickTarget();
    Mockito.verify(initialMethod).confuseTarget(target);
    Mockito.verify(initialMethod).stealTheItem(target);

    final var newMethod = Mockito.spy(StealingMethod.class);
    thief.changeMethod(newMethod);

    thief.steal();
    Mockito.verify(newMethod).steal();
    String newTarget = Mockito.verify(newMethod).pickTarget();
    Mockito.verify(newMethod).confuseTarget(newTarget);
    Mockito.verify(newMethod).stealTheItem(newTarget);
    Mockito.verifyNoMoreInteractions(initialMethod, newMethod);
  }
}