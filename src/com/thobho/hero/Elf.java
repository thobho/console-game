package com.thobho.hero;

import java.util.List;
import java.util.Random;

public class Elf extends Hero {


    public Elf(String name) {
        super(name, Race.ELF);
    }

    @Override
    int calculateTotalStrength() {
        int weaponDamage = armour.isEmpty() ? 0 : armour.get(0).getDamage();
        return this.getHealth() / 2 + new Random().nextInt(100) + weaponDamage;
    }

    @Override
    public void fight(Hero enemy) {
        saySomething("Pamiętaj, nieznany! Chroni mnie magia Randoma");

        if(this.calculateTotalStrength() < enemy.calculateTotalStrength()){
            saySomething("Cios ten był bolesny! Ale jeszcze nie odchodzę do krainy przodków!");
            takeHurtFromEnemy(enemy.getDamage());
        }
        else {
            saySomething("Sprawiedliwość elficka!");
        }

    }
}
