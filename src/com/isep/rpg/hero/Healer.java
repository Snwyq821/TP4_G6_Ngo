package com.isep.rpg.hero;

import com.isep.rpg.enemy.Enemy;

public class Healer extends SpellCaster
{
    public void heal(Hero hero) {
        if (manaPoints > spellCost)
        {
            hero.lifePoints += weaponDamage;
            manaPoints -= spellCost;
        }
        else
        {
            System.out.println("Points de mana insuffisants");
        }
    }

    @Override
    public void attack(Enemy enemy) {

    }

    @Override
    public void defend() {

    }

    @Override
    public void useConsumable(String consumable) {

    }

}
