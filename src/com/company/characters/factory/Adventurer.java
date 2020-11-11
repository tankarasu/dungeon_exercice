package com.company.characters.factory;

import com.company.weapon.factory.WeaponsInterface;

public class Adventurer extends WarriorSuperClass implements WarriorInterface {
    // variables membres


    /*
     * Player have 2 différents weapons depends monster at instanciation
     * */
    private WeaponsInterface swordWeapon;
    private WeaponsInterface water_flaskWeapon;


    //constructor

    public Adventurer() {
        setHealthPoint(200);
        swordWeapon = weaponFactory.setWeapon("Sword");
        water_flaskWeapon = weaponFactory.setWeapon("Water_Flask");
    }

    // méthodes

    @Override
    public void attack(WarriorSuperClass defendingCharacter) {
        System.out.println("Player Attack");
        if (!isM_bIsKO()) {
            swordWeapon.inflictDamages(defendingCharacter);
        } else {
            System.out.println("vous êtes sonné par les éclairs, vous " +
                    "n'attaquez pas ce " +
                    "tour");
            //todo traduction à faire
            setM_bIsKO(false);
        }
    }

    // by input a weapon Name + behavior
    // choose a weapon for the attack
    private void chooseWeapon() {
        System.out.println("You have choosen a weapon");
    }

    // getters


    // setters


}
