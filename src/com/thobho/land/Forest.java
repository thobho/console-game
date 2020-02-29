package com.thobho.land;

import com.thobho.UserInput;
import com.thobho.hero.Hero;
import com.thobho.hero.HeroFactory;

public class Forest implements Land {

    public static final int FIGHT_USER_CHOOSE = 1;

    @Override
    public void exploreLand(Hero hero) { // W Lesie modyfikujemy bohatera w ten sposób, że w trakcie walki zmienia się
        //jego życie/poziom
        Hero randomEnemy = HeroFactory.createRandomHero();

        System.out.println("Jesteś w lesie. Spotkałeś przeciwnika " + randomEnemy.shortInfo());
        System.out.println("Czy chcesz z nim walczyć?\n0-NIE\n1-TAK");

        int userInput = UserInput.getInt(0, 1);

        if (userInput == FIGHT_USER_CHOOSE) {
            hero.fight(randomEnemy);
        } else {
            hero.punishForDesertion();

        }

    }

    @Override
    public String getDescription() {
        return "LAS: Możesz tu spotkać przeciwnika";
    }


}
