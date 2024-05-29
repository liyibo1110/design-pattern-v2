package com.liyibo1110.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author liyibo
 * @date 2024-05-29 10:49
 */
@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor
public class ElfMage extends Mage {

    private final String helpType;

    public ElfMage(ElfMage elfMage) {
        super(elfMage);
        this.helpType = elfMage.helpType;
    }

    @Override
    public String toString() {
        return "Elven mage helps in " + helpType;
    }
}
