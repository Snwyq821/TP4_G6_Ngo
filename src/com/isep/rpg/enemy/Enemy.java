package com.isep.rpg.enemy;

import com.isep.rpg.hero.Hero;

public abstract class Enemy
{
    public int lifePoints;

    public abstract void attack(Hero hero);

}
