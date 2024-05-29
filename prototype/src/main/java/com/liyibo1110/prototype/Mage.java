package com.liyibo1110.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author liyibo
 * @date 2024-05-29 10:44
 */
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public abstract class Mage extends Prototype<Mage> {

    public Mage(Mage source) {

    }
}
