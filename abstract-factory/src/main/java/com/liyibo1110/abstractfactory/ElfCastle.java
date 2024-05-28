package com.liyibo1110.abstractfactory;

public class ElfCastle implements Castle {

    static final String DESCRIPTION = "This is the elven castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
