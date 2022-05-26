package com.isep.rpg.enemy;

import com.isep.rpg.hero.Hero;

public class Boss extends Enemy
{
    // Construct
    public Boss()
    {
        this.setHp(200000);
        this.setWeaponDamage(15000);
    }
}
