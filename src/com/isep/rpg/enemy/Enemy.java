package com.isep.rpg.enemy;

import com.isep.rpg.hero.Hero;

import java.util.List;

public abstract class Enemy
{
    public int lifePoints;
    public int damage;

    public void attack(Hero hero, List<String> party)
    {
        hero.lifePoints -= damage;
        if (hero.lifePoints <= 0)
        {
            party.remove(hero);
        }
    }

}
