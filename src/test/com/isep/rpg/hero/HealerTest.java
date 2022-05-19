package com.isep.rpg.hero;

import com.isep.rpg.enemy.Enemy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.isep.rpg.hero.Hero;

class HealerTest {

    @Test
    void heal(Hero hero) {
        Healer healer = new Healer();
        int manaBeforeTurn = healer.manaPoints;
        int HPBeforeTurn = hero.lifePoints;
        healer.heal(hero);
        assertEquals(healer.manaPoints - healer.spellCost, healer.manaPoints);
        assertEquals(HPBeforeTurn + healer.weaponDamage, hero.lifePoints);
    }

    void attack(Enemy enemy) {
        Healer healer = new Healer();
        int manaBeforeTurn = healer.manaPoints;
        int HPBeforeTurn = enemy.lifePoints;
        healer.attack(enemy);
        assertEquals(manaBeforeTurn - healer.spellCost, healer.manaPoints);
        assertEquals(HPBeforeTurn - healer.weaponDamage, enemy.lifePoints);
    }
}