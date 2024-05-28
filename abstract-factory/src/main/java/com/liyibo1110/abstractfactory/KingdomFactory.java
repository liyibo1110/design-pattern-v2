package com.liyibo1110.abstractfactory;

/**
 * @author liyibo
 * @date 2024-05-27 17:57
 */
public interface KingdomFactory {

    Castle createCastle();

    King createKing();

    Army createArmy();
}
