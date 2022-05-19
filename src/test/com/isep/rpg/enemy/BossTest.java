package com.isep.rpg.enemy;

import com.isep.rpg.hero.Hero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test
    void attack(Hero hero) {
        BasicEnemy basicEnemy = new BasicEnemy();
        int HPBeforeTurn = hero.lifePoints;
        basicEnemy.attack(hero);
        assertEquals(HPBeforeTurn - basicEnemy.damage, hero.lifePoints);
    }
}