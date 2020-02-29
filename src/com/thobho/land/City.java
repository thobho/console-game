package com.thobho.land;

import com.thobho.UserInput;
import com.thobho.hero.Hero;
import com.thobho.wapon.Weapon;

public class City implements Land {
    @Override
    public void exploreLand(Hero hero) { // w mieście gracz modyfikujemy gracza tak, że może dostać coś więcej do listy swoich broni

        Weapon weapon = Weapon.crateRandomWeapon();
        System.out.println("Znalazłeś broń!" + weapon.toString());
        System.out.println("Czy chcesz ją dołożyć do ekwipunku?\n0-TAK\n1-NIE");

        if (UserInput.getInt(0, 1) == 0) {
            boolean canAddArmour = hero.canAddArmour(weapon);
            if (!canAddArmour) {
                System.out.println("Broń dodana do ekwpinuku (" + weapon.toString() + ")");
                hero.addWeaponToArmour(weapon);
            }else {
                System.out.println("Nie można dodać broni");
            }
        }else {
            System.out.println("Nie dodałeś broni do ekpipunku! (" + weapon.toString() +")");
        }
    }

    @Override
    public String getDescription() {
        return "MIASTO - może tutaj znajdziesz coś ciekawego!";
    }
}
