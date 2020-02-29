package com.thobho.wapon;

import com.thobho.RandomUtils;

public class Weapon {

    private static final int DEFAULT_WEAPON_DAMAGE = 20;
    private static final int DEFAULT_WEAPON_DEFENCE = 20;
    private static final int DEFAULT_WEAPON_WEIGHT = 10;
    private static String[] DEFAULT_WEAPON_NAMES = {"Sword", "Axe", "Bow"};

    private String name;
    private int damage;
    private int defence;
    private int weight;


    public Weapon(String name) {
        this.name = name;
        this.damage = DEFAULT_WEAPON_DAMAGE;
        this.defence = DEFAULT_WEAPON_DEFENCE;
        this.weight = DEFAULT_WEAPON_WEIGHT;
    }

    public static Weapon crateRandomWeapon() {
        return new Weapon(RandomUtils.getRandomFromArray(DEFAULT_WEAPON_NAMES));
    }

    public void upgradeDamage(int additionalDamage) {
        this.damage += additionalDamage;
    }

    public void updateDefence(int updateDefence) {
        this.defence += updateDefence;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefence() {
        return defence;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Weapon: %s (damage: %d, defense: %d)", this.name, this.damage, this.defence);
    }
}
