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
    public void attack(WarriorSuperClass defendingCharacter) {
        System.out.println("Wizard attack");
        defendingCharacter.setHealthPoint(defendingCharacter.getHealthPoint() - m_iDealedDamage);
        System.out.println("you suffers " + m_iDealedDamage + " and you have "
                + defendingCharacter.getHealthPoint() + " HP remaining");
    }


    // getters

    // setters


}
