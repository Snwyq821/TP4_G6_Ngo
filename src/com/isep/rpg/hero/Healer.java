package com.isep.rpg.hero;

import com.isep.rpg.enemy.Enemy;

public class Healer extends SpellCaster
{
    // Construct
    public Healer()
    {
        this.setHp(50000);
        this.setArmor(8000);
        this.setWeaponDamage(4500);
        this.setManaPoints(10000);
        this.setSpellCost(300);
    }
}
