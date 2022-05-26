package com.isep.rpg.enemy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.isep.rpg.hero.*;

class BossTest {

    void attack(Hero hero) {
        hero.setHp(10000);
        Boss basicEnemy = new Boss();
        int HPBeforeTurn = 10000;
        basicEnemy.attack(hero);
        assertEquals(HPBeforeTurn - basicEnemy.getWeaponDamage(), hero.getHp());
    }
}