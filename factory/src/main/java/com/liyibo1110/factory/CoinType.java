package com.liyibo1110.factory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum CoinType {

    GOLD(GoldCoin::new),
    COPPER(CopperCoin::new);

    private final Supplier<Coin> constructor;
}
