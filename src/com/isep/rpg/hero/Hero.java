package com.isep.rpg.hero;

import com.isep.rpg.enemy.Enemy;

import java.util.List;

public abstract class Hero
{
    public int lifePoints;
    public int armor;
    public int weaponDamage;

    List<String> potions;
    List<String> lembas;

    public abstract void attack(Enemy enemy);
    public abstract void defend();
    public abstract void useConsumable(String consumable);
}
