package com.liyibo1110.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AbstractFactoryTest {

  private final App app = new App();

  @Test
  void verifyKingCreation() {
    app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
    final var kingdom = app.getKingdom();

    final var elfKing = kingdom.getKing();
    assertTrue(elfKing instanceof ElfKing);
    Assertions.assertEquals(ElfKing.DESCRIPTION, elfKing.getDescription());

    app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
    final var orcKing = kingdom.getKing();
    assertTrue(orcKing instanceof OrcKing);
    Assertions.assertEquals(OrcKing.DESCRIPTION, orcKing.getDescription());
  }

  @Test
  void verifyCastleCreation() {
    app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
    final var kingdom = app.getKingdom();

    final var elfCastle = kingdom.getCastle();
    assertTrue(elfCastle instanceof ElfCastle);
    Assertions.assertEquals(ElfCastle.DESCRIPTION, elfCastle.getDescription());

    app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
    final var orcCastle = kingdom.getCastle();
    assertTrue(orcCastle instanceof OrcCastle);
    Assertions.assertEquals(OrcCastle.DESCRIPTION, orcCastle.getDescription());
  }

  @Test
  void verifyArmyCreation() {
    app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
    final var kingdom = app.getKingdom();

    final var elfArmy = kingdom.getArmy();
    assertTrue(elfArmy instanceof ElfArmy);
    Assertions.assertEquals(ElfArmy.DESCRIPTION, elfArmy.getDescription());

    app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
    final var orcArmy = kingdom.getArmy();
    assertTrue(orcArmy instanceof OrcArmy);
    Assertions.assertEquals(OrcArmy.DESCRIPTION, orcArmy.getDescription());
  }

  @Test
  void verifyElfKingdomCreation() {
    app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
    final var kingdom = app.getKingdom();

    final var king = kingdom.getKing();
    final var castle = kingdom.getCastle();
    final var army = kingdom.getArmy();
    assertTrue(king instanceof ElfKing);
    Assertions.assertEquals(ElfKing.DESCRIPTION, king.getDescription());
    assertTrue(castle instanceof ElfCastle);
    Assertions.assertEquals(ElfCastle.DESCRIPTION, castle.getDescription());
    assertTrue(army instanceof ElfArmy);
    Assertions.assertEquals(ElfArmy.DESCRIPTION, army.getDescription());
  }

  @Test
  void verifyOrcKingdomCreation() {
    app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
    final var kingdom = app.getKingdom();

    final var king = kingdom.getKing();
    final var castle = kingdom.getCastle();
    final var army = kingdom.getArmy();
    assertTrue(king instanceof OrcKing);
    Assertions.assertEquals(OrcKing.DESCRIPTION, king.getDescription());
    assertTrue(castle instanceof OrcCastle);
    Assertions.assertEquals(OrcCastle.DESCRIPTION, castle.getDescription());
    assertTrue(army instanceof OrcArmy);
    Assertions.assertEquals(OrcArmy.DESCRIPTION, army.getDescription());
  }
}
