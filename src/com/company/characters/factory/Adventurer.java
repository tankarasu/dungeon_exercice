package com.company.characters.factory;

import com.company.weapon.factory.Sword;
import com.company.weapon.factory.Water_Flask;

public class Adventurer extends WarriorSuperClass implements WarriorInterface {
    // variables membres

    /*
     * Player have 2 differents weapons depends monster at instanciation
     * */
    private boolean m_bIsKO;
    private Sword swordWeapon;
    private Water_Flask water_flaskWeapon;


    //constructor

    public Adventurer() {
        setHealthPoint(200);
        weaponFactory.setWeapon(swordWeapon);
        weaponFactory.setWeapon(water_flaskWeapon);
    }

    // méthodes

    @Override
    public void attack(WarriorSuperClass defendingCharacter) {
        System.out.println("The Player attack");
    }

    // by input a weapon Name + behavior
    // choose a weapon for the attack
    private void chooseWeapon() {
        System.out.println("You have choosen a weapon");
    }

    // getters

    // setters


}
