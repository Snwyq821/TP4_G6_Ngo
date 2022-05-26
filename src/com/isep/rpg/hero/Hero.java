package com.isep.rpg.hero;

import com.isep.rpg.Entity;
import com.isep.rpg.enemy.Enemy;
import com.isep.rpg.hero.consumable.Consumable;

import java.util.List;

public abstract class Hero extends Entity
{
    private int armor;
    private boolean inDefense = false;

    List<String> potions;
    List<String> lembas;

    public int getArmor() { return this.armor; }
    public void setArmor(int armorValue) { this.armor = armorValue; }

    public void setDefense(boolean action) { this.inDefense = action; }
    public boolean isInDefense() { return this.inDefense; }

    public void substractHp(int damage) { this.setHp(this.getHp() - damage); }

    public void attack(Enemy enemy) { enemy.substractHp(this.getWeaponDamage()); }

    public void defend() { this.inDefense = true; }

    public void getConsumable(Consumable consumable){};
    public void useConsumable(String consumable){}
}
