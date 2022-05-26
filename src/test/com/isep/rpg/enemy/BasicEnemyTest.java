package com.isep.rpg.enemy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.isep.rpg.hero.*;

class BasicEnemyTest {

    void attack(Hero hero) {
        hero.setHp(10000);
        BasicEnemy basicEnemy = new BasicEnemy();
        int HPBeforeTurn = 10000;
        basicEnemy.attack(hero);
        assertEquals(HPBeforeTurn - basicEnemy.getWeaponDamage(), hero.getHp());
    }
}