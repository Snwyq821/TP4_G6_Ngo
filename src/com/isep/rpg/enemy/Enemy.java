package com.isep.rpg.enemy;

import com.isep.rpg.hero.Hero;

public abstract class Enemy
{
    public int lifePoints;
    public int damage;

    public void attack(Hero hero)
    {
        hero.lifePoints -= damage;
    }

}
