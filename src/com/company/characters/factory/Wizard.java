package com.company.characters.factory;

import com.company.weapon.factory.Lightning;
import com.company.weapon.factory.WeaponsInterface;

public class Wizard extends Monster implements WarriorInterface {
    // variables membres
    private int m_iDealedDamage = 10;
    private WeaponsInterface lightningWeapon;

    //constructor

    public Wizard() {
        setHealthPoint(20);
        setWeakness("Water_Flask");
        lightningWeapon = weaponFactory.setWeapon("Lightning");
    }

    // méthodes

    @Override
    public void attack(WarriorSuperClass attackingCharacter,
                       WarriorSuperClass defendingCharacter) {
        System.out.println("\nWizard attack\n");
        lightningWeapon.inflictDamages(attackingCharacter, defendingCharacter);
        if (!defendingCharacter.isAlive(defendingCharacter)) {
            defendingCharacter.setIsAlive(false);
        }
    }


    // getters

    // setters


}
