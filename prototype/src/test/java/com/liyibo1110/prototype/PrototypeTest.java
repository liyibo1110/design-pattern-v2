package com.liyibo1110.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

/**
 * @author liyibo
 * @date 2024-05-29 11:10
 */
class PrototypeTest<P extends Prototype<P>> {

    static Collection<Object[]> dataProvider() {
        return List.of(
            new Object[]{new OrcBeast("axe"), "Orcish wolf attacks with axe"},
            new Object[]{new OrcMage("sword"), "Orcish mage attacks with sword"},
            new Object[]{new OrcWarlord("laser"), "Orcish warlord attacks with laser"},
            new Object[]{new ElfBeast("cooking"), "Elven eagle helps in cooking"},
            new Object[]{new ElfMage("cleaning"), "Elven mage helps in cleaning"},
            new Object[]{new ElfWarlord("protecting"), "Elven warlord helps in protecting"}
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testPrototype(P testedPrototype, String expectedToString) {
        Assertions.assertEquals(expectedToString, testedPrototype.toString());

        var clone = testedPrototype.copy();
        Assertions.assertNotNull(clone);
        Assertions.assertNotSame(clone, testedPrototype);
        Assertions.assertSame(testedPrototype.getClass(), clone.getClass());
        Assertions.assertEquals(clone, testedPrototype);
    }
}
