package com.isep.rpg.hero;

import com.isep.rpg.enemy.Enemy;

public class Mage extends SpellCaster
{
    @Override
    public void attack(Enemy enemy) //Fire IV
    {
        if (manaPoints > spellCost)
        {
            enemy.lifePoints -= weaponDamage;
            manaPoints -= spellCost;
        }
        else
        {
            System.out.println("Points de mana insuffisants");
        }
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
