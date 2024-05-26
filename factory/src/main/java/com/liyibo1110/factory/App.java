package com.liyibo1110.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        LOGGER.info("The alchemist begins his work.");
        Coin goldCoin = CoinFactory.getCoin(CoinType.GOLD);
        Coin copperCoin = CoinFactory.getCoin(CoinType.COPPER);
        LOGGER.info(goldCoin.getDesc());
        LOGGER.info(copperCoin.getDesc());
    }
}
