package com.isep.rpg.hero;

import com.isep.rpg.enemy.Enemy;

public class Mage extends SpellCaster
{
    @Override
    public void attack(Enemy enemy) //Fire IV
    {
        enemy.lifePoints -= weaponDamage;
        manaPoints -= spellCost;
    }

    @Override
    public void defend()
    {

    }

    @Override
    public void useConsumable(String consumable)
    {

    }
}
