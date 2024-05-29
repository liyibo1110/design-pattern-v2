package com.liyibo1110.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author liyibo
 * @date 2024-05-29 10:49
 */
@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor
public class ElfBeast extends Beast {

    private final String helpType;

    public ElfBeast(ElfBeast elfBeast) {
        super(elfBeast);
        this.helpType = elfBeast.helpType;
    }

    @Override
    public String toString() {
        return "Elven eagle helps in " + helpType;
    }
}
