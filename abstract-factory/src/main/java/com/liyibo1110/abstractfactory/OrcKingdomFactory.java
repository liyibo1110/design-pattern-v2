package com.liyibo1110.abstractfactory;

/**
 * @author liyibo
 * @date 2024-05-27 17:58
 */
public class OrcKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
