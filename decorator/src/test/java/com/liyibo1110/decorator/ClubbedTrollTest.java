package com.liyibo1110.decorator;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 * @author liyibo
 * @date 2024-05-31 17:56
 */
class ClubbedTrollTest {

    @Test
    void testClubbedTroll() {
        final var simpleTroll = Mockito.spy(new SimpleTroll());

        final var clubbed = new ClubbedTroll(simpleTroll);
        assertEquals(20, clubbed.getAttackPower());
        verify(simpleTroll, times(1)).getAttackPower();

        clubbed.attack();
        verify(simpleTroll, times(1)).attack();

        clubbed.fleeBattle();
        verify(simpleTroll, times(1)).fleeBattle();
        verifyNoMoreInteractions(simpleTroll);
    }
}
