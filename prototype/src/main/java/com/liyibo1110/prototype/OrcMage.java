package com.liyibo1110.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author liyibo
 * @date 2024-05-29 10:49
 */
@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor
public class OrcMage extends Mage {

    private final String weapon;

    public OrcMage(OrcMage orcMage) {
        super(orcMage);
        this.weapon = orcMage.weapon;
    }

    @Override
    public String toString() {
        return "Orcish mage attacks with " + weapon;
    }
}
