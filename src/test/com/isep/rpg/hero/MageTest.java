package com.isep.rpg.hero;

import com.isep.rpg.enemy.Boss;
import com.isep.rpg.enemy.Enemy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    void attack(Enemy enemy) {
        Mage mage = new Mage();
        int manaBeforeTurn = mage.manaPoints;
        int HPBeforeTurn = enemy.lifePoints;
        mage.attack(enemy);
        assertEquals(manaBeforeTurn - mage.spellCost, mage.manaPoints);
        assertEquals(HPBeforeTurn - mage.weaponDamage, enemy.lifePoints);
    }
}