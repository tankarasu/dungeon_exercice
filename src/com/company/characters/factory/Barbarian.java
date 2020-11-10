package com.company.characters.factory;

import com.company.weapon.WeaponFactory;
import com.company.weapon.factory.Axe;

import java.util.Random;

public class Barbarian extends Monster implements WarriorInterface {
    // variables membres
    private final int m_iDAMAGE_POINT;
    private int m_iDealedDamage;
    Random random = new Random();
    private boolean isKo;
    private Axe axeWeapon;

    //constructor
    public Barbarian() {
        setHealthPoint(20);
        setWeakness("Sword");
        m_iDAMAGE_POINT = 15;
        weaponFactory.setWeapon(axeWeapon);
    }

    // méthodes

    @Override
    public void attack(WarriorSuperClass defendingCharacter) {
        System.out.println("Barbarian Attack");

        if (random.nextInt() > 0.3) {
            System.out.println("Barbarian does an extraDamage");
            m_iDealedDamage = m_iDAMAGE_POINT * 2;
        } else {
            m_iDealedDamage = m_iDAMAGE_POINT;
        }
        defendingCharacter.setHealthPoint(defendingCharacter.getHealthPoint() - m_iDealedDamage);
        System.out.println("you suffers " + m_iDealedDamage + " and you have "
                + defendingCharacter.getHealthPoint() + " HP remaining");
    }


    // getters

    // setters


}
