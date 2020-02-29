package com.thobho.hero;

import java.util.List;

public class Dwarf extends Hero {
    public Dwarf(String name) {
        super(name, Race.DWARF);
    }

    @Override
    int calculateTotalStrength() {
        return getHealth() + getLevel() + getSummaryOfArmourStrength();
    }

    @Override
    public void fight(Hero enemy) {

        saySomething(enemy.getName() + " Podejdź tu, a toporem Cię zdzielę!");

        if (this.calculateTotalStrength() < enemy.calculateTotalStrength()) {
            saySomething("Agh... aleś cios mi zadał..");
            takeHurtFromEnemy(enemy.getDamage());
        } else {
            saySomething("A masz, psubracie!");
        }


    }

}
