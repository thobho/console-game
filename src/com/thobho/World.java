package com.thobho;

import com.thobho.hero.Hero;
import com.thobho.land.Forest;
import com.thobho.land.Land;

import java.util.List;

public final class World { // <- Klasa world jest finalna, nie może więc być nadpisana. Stanowi też typwy przykład kompozycji

    private Land actualLand;

    private List<Land> nextPossibleLand;

    private Hero mainHero;

    public World() {
        this.actualLand = Land.getRandomLand();
        this.setRandomLands();
    }

    public void showNextPossiblePathsToLands() {
        System.out.println("Wybierz swoją dalszą ścieżkę podróży:");
        for (int i = 0; i < nextPossibleLand.size(); i++) {
            Land land = nextPossibleLand.get(i);
            System.out.println(i + ": " + land.getDescription());
        }
    }

    public int getNextPossibleLandsCount(){
        return this.nextPossibleLand.size();
    }

    public void goToNextLand(int landIndex){
        this.actualLand = nextPossibleLand.get(landIndex);
        this.setRandomLands();
    }

    private void setRandomLands(){
        this.nextPossibleLand = List.of(
                Land.getRandomLand(),
                Land.getRandomLand()
        );
    }

    public void setMainHero(Hero mainHero) {
        this.mainHero = mainHero;
    }

    public void runActualAdventureInLand() {
        this.actualLand.exploreLand(this.mainHero);
    }

    public void showMainHeroState(){
        System.out.println(ConsoleColor.red(this.mainHero.shortInfo()));
    }


}
