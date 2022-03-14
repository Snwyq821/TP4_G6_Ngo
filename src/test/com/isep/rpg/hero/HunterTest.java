package com.isep.rpg.hero;

import com.isep.rpg.enemy.Boss;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HunterTest {

    @Test
    void attack() {
        Hunter hunter = new Hunter();
        Boss boss =  new Boss();
        int arrowsBeforeTurn = hunter.arrows;
        hunter.attack(boss);
        assertEquals(hunter.arrows - 1, hunter.arrows);
    }
}