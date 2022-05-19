package com.isep.rpg.hero;

import com.isep.rpg.Game;
import com.isep.rpg.enemy.Enemy;

import java.util.List;

public class Hunter extends Hero
{
    int arrows;

    @Override
    public void attack(Enemy enemy)
    {
        arrows -= 1;
        enemy.lifePoints -= weaponDamage;
        if (enemy.lifePoints <= 0)
        {

        }
    }


    @Override
    public void defend() {

    }

    @Override
    public void useConsumable(String consumable) {

    }
}
