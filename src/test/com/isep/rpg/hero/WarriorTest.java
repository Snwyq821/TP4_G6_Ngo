package com.isep.rpg.hero;

import com.isep.rpg.enemy.Enemy;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    void attack(Enemy enemy) {
        Warrior warrior = new Warrior();
        int HPBeforeTurn = enemy.lifePoints;
        warrior.attack(enemy);
        assertEquals(HPBeforeTurn - warrior.weaponDamage, enemy.lifePoints);
    }

}