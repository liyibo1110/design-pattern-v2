package com.liyibo1110.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author liyibo
 * @date 2024-05-29 10:49
 */
@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor
public class OrcWarlord extends Warlord {

    private final String weapon;

    public OrcWarlord(OrcWarlord orcWarlord) {
        super(orcWarlord);
        this.weapon = orcWarlord.weapon;
    }

    @Override
    public String toString() {
        return "Orcish warlord attacks with " + weapon;
    }
}
