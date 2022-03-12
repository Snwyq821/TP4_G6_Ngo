package com.isep.rpg.hero;

import com.isep.rpg.enemy.Enemy;

public class Hunter extends Hero
{
    int arrows;

    @Override
    public void attack(Enemy enemy)
    {
        enemy.lifePoints -= weaponDamage;
        arrows -= 1;
    }


    @Override
    public void defend() {

    }

    @Override
    public void useConsumable(String consumable) {

    }
}
