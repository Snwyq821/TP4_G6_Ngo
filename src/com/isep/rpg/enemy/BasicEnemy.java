package com.isep.rpg.enemy;

import com.isep.rpg.Entity;
import com.isep.rpg.hero.Hero;

public class BasicEnemy extends Enemy
{
    // Construct
    public BasicEnemy()
    {
        this.setHp(30000);
        this.setWeaponDamage(10000);
    }
}
