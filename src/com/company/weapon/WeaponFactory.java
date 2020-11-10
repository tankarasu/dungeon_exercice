package com.company.weapon;

import com.company.characters.factory.WarriorSuperClass;
import com.company.weapon.factory.*;

public class WeaponFactory extends WeaponSuperClass {
    /*    Random event happens in game
     * apply Random event then reset*/

    // variables membres

    //constructor

    public WeaponFactory() {

    }

    // méthodes
    // creating weapons
    public WeaponsInterface setWeapon(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Sword")) {
            return new Sword();
        }
        if (type.equalsIgnoreCase("Axe")) {
            return new Axe();
        }
        if (type.equalsIgnoreCase("Water_Flask")) {
            return new Water_Flask();
        }
        if (type.equalsIgnoreCase("Lightning")) {
            return new Lightning();
        }
        return null;
    }

    // getters

    // setters


}
