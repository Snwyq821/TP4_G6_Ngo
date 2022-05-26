package com.isep.rpg;

public abstract class Entity
{
    private int lifePoints;
    private int weaponDamage;

    // Init

    public int getHp() { return this.lifePoints; }
    public void setHp(int hp) { this.lifePoints = hp; }
    public void substractHp(int damage) { this.lifePoints -= damage; }

    public int getWeaponDamage() { return this.weaponDamage; }
    public void setWeaponDamage(int weaponDamage) { this.weaponDamage = weaponDamage; }

}
