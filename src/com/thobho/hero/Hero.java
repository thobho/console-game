package com.thobho.hero;

import com.thobho.wapon.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.stream.Collectors;

public abstract class Hero { // <- Klasa abstrakcyna posiada wspólny stan dla każedego bohatera, nie można stworzyć Hero samego w sobie

    private static final int MAX_HERO_HEALTH = 100;
    private static final int DEFAULT_DAMAGE = 10;
    private static final int MAX_ARMOUR_WEIGHT = 50;

    private String name;
    private Race race;
    private int level;
    private int health;
    private int damage;
    protected List<Weapon> armour; // <- To jest przykład kompzycji. Hero "posiada" kilka broni.

    public Hero(String name, Race race) {
        this.name = name;
        this.race = race;
        this.level = 0;
        this.health = MAX_HERO_HEALTH;
        this.damage = DEFAULT_DAMAGE;
        this.armour = new ArrayList<>();
    }

    abstract int calculateTotalStrength(); //<- metoda abstrakcyja

    public abstract void fight(Hero enemy);

    void saySomething(String message) {
        System.out.printf("%s: %s\n", this.name, message);
    }

    void takeHurtFromEnemy(int damage) {
        this.health -= damage;
    }

    public void punishForDesertion(){
        System.out.println("Stchórzyłeś! Tracisz poziom");
        this.level -= 1;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public int getDamage() {
        return damage;
    }

    public String shortInfo(){
        return String.format("%s (Health: %d, damage %d)\n%s", getName(), getHealth(), getDamage(), this.armour.stream().map(Weapon::toString).collect(Collectors.joining()));
    }

    public boolean canAddArmour(Weapon weapon){
        return getSummaryOfArmourWeight() + weapon.getWeight() > MAX_ARMOUR_WEIGHT;
    }

    public void addWeaponToArmour(Weapon weapon){
            this.armour.add(weapon);
    }

    public void leaveWeapon(int weaponIndex){
        this.armour.remove(weaponIndex);
    }

    private int getSummaryOfArmourWeight(){
        int summedWeight = 0;
        for (Weapon weapon : armour) {
            summedWeight += weapon.getDefence();
        }
        return summedWeight;
    }

    protected int getSummaryOfArmourStrength(){
        return this.armour.stream().mapToInt(Weapon::getDamage).sum();
    }
}
