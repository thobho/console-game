package com.thobho.hero;

import com.thobho.RandomUtils;
import com.thobho.hero.Hero;

import java.util.Random;

public class HeroFactory {

    private final static String[] BAD_CHARACTER_NAMES = {"Ochyd", "Golum", "Zgred"};

    public static Hero createRandomHero(){
        String randomName = RandomUtils.getRandomFromArray(BAD_CHARACTER_NAMES);
        Race randomRace = RandomUtils.getRandomFromArray(Race.values());
        return createHero(randomName, randomRace);
    }

    static Hero createHero(String name, Race race) {
        switch (race) {
            case DWARF:
                return new Dwarf(name);
            case ELF:
                return new Elf(name);
            case HUMAN:
                return new Elf(name);//todo powinno być human
            default:
                throw new IllegalArgumentException("Nie rozpoznano rasy");
        }

    }

}
