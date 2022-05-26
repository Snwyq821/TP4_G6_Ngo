package com.isep.rpg.hero;

import com.isep.rpg.enemy.Enemy;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    void attack(Enemy enemy) {
        enemy.setHp(100000);
        Warrior healer = new Warrior();
        int HPBeforeTurn = 100000;
        healer.attack(enemy);
        assertEquals(HPBeforeTurn - healer.getWeaponDamage(), enemy.getHp());
    }

}