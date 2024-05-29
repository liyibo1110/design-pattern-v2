package com.liyibo1110.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author liyibo
 * @date 2024-05-29 10:49
 */
@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor
public class OrcBeast extends Beast {

    private final String weapon;

    public OrcBeast(OrcBeast orcBeast) {
        super(orcBeast);
        this.weapon = orcBeast.weapon;
    }

    @Override
    public String toString() {
        return "Orcish wolf attacks with " + weapon;
    }
}
