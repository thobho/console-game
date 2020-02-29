package com.thobho;

import com.thobho.hero.Elf;
import com.thobho.hero.Hero;

import java.util.Scanner;

public class Game {

    private World world = new World();

    public World getWorld() {
        return world;
    }

    public static void main(String[] args) {

        Game game = new Game();

        //następne 2 linijmi można zastąpić metodą, która  pozwoli użytkowniki "stworzyć" swojego bohatera, przez pobranie
        //imienia z konsoli
        Hero tomek = new Elf("Tomek");
        game.getWorld().setMainHero(tomek);


        showMainHeroState(game);
        System.out.println("\nMOŻLIWE DROGI:");
        game.getWorld().showNextPossiblePathsToLands();
        game.getWorld().goToNextLand(UserInput.getInt(0, game.getWorld().getNextPossibleLandsCount()));

        while (true){
            showMainHeroState(game);
            System.out.println("\nAKCJA:");
            game.getWorld().runActualAdventureInLand();
            System.out.println("\nMOŻLIWE DROGI:");
            game.getWorld().showNextPossiblePathsToLands();
            game.getWorld().goToNextLand(UserInput.getInt(0, game.getWorld().getNextPossibleLandsCount()));
        }
    }

    private static void showMainHeroState(Game game) {
        System.out.println("||||||||||||||||||");
        game.getWorld().showMainHeroState();
        System.out.println("||||||||||||||||||");
    }


}
