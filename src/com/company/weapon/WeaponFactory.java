package com.company.weapon;

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
    public Sword setWeapon(Sword p_weaponToSet) {
        return p_weaponToSet = new Sword();
    }

    public Axe setWeapon(Axe p_weaponToSet) {
        return p_weaponToSet = new Axe();
    }

    public Lightning setWeapon(Lightning p_weaponToSet) {
        return p_weaponToSet = new Lightning();
    }

    public Water_Flask setWeapon(Water_Flask p_weaponToSet) {
        return p_weaponToSet = new Water_Flask();
    }

    // getters

    // setters


}
