package com.company.characters.factory;

import com.company.weapon.factory.Lightning;

public class Wizard extends Monster implements WarriorInterface {
    // variables membres
  private   int m_iDealedDamage = 10;
  private Lightning lightningWeapon;

    //constructor

    public Wizard() {
        setHealthPoint(20);
        setWeakness("Water_Flask");
        weaponFactory.setWeapon(lightningWeapon);
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
