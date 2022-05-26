package com.isep.rpg.hero;

import com.isep.rpg.enemy.Enemy;

public class Mage extends SpellCaster
{

    // Construct
    public Mage()
    {
        this.setHp(50000);
        this.setArmor(500);
        this.setWeaponDamage(10000);
        this.setManaPoints(10000);
        this.setSpellCost(500);
    }


}
