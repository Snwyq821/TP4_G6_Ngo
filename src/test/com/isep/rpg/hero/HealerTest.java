package com.isep.rpg.hero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.isep.rpg.hero.Hero;

class HealerTest {

    @Test
    void attack(Hero hero) {
        Healer healer = new Healer();
        int manaBeforeTurn = healer.manaPoints;
        int HPBeforeTurn = hero.lifePoints;
        healer.attack(hero);
        assertEquals(healer.manaPoints - healer.spellCost, healer.manaPoints);
        assertEquals(HPBeforeTurn + healer.weaponDamage, hero.lifePoints);
    }
}