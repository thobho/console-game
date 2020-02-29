package com.thobho.land;

import com.thobho.RandomUtils;
import com.thobho.hero.Hero;

public interface Land { // <-interfejs definiuje tylko zachowania, inaczej mówiąć wiemy, że na obiekcie typu Land
    // można wywołać następujące metody

    void exploreLand(Hero hero); // metoda ta bierze w parametrze bohatera i modyfikuje go w jakiś sposób

    String getDescription();

    static Land getRandomLand() {
        if (RandomUtils.randomBool()) {
            return new City();
        }
        return new Forest();
    }

}
