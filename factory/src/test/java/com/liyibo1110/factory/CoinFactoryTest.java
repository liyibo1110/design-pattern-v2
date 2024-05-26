package com.liyibo1110.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoinFactoryTest {
    @Test
    void shouldReturnGoldCoinInstance() {
        Coin goldCoin = CoinFactory.getCoin(CoinType.GOLD);
        Assertions.assertTrue(goldCoin instanceof GoldCoin);
    }
}
