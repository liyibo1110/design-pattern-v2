package com.liyibo1110.abstractfactory;

import lombok.Getter;
import lombok.Setter;

/**
 * @author liyibo
 * @date 2024-05-27 18:00
 */
@Getter
@Setter
public class Kingdom {

    private King king;
    private Castle castle;
    private Army army;

    public static class FactoryMaker {
        public enum KingdomType {
            ELF, ORC
        }

        public static KingdomFactory makeFactory(KingdomType type) {
            return switch(type) {
                case ELF -> new ElfKingdomFactory();
                case ORC -> new OrcKingdomFactory();
            };
        }
    }
}
