package com.isep.rpg.enemy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.isep.rpg.hero.*;

class BasicEnemyTest {

    @Test
    void attack(Hero hero) {
        BasicEnemy basicEnemy = new BasicEnemy();
        int HPBeforeTurn = hero.lifePoints;
        basicEnemy.attack(hero);
        assertEquals(HPBeforeTurn - basicEnemy.damage, hero.lifePoints);
    }
}