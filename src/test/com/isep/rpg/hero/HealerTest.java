package com.isep.rpg.hero;

import com.isep.rpg.enemy.Enemy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.isep.rpg.hero.Hero;

class HealerTest {

    void attack(Enemy enemy) {
        enemy.setHp(100000);
        Healer healer = new Healer();
        int manaBeforeTurn = healer.getManaPoints();
        int HPBeforeTurn = 100000;
        healer.attack(enemy);
        assertEquals(manaBeforeTurn - healer.getSpellCost(), healer.getManaPoints());
        assertEquals(HPBeforeTurn - healer.getWeaponDamage(), enemy.getHp());
    }
}