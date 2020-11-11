package com.company.characters.factory;

import com.company.weapon.factory.WeaponsInterface;

import java.util.Random;

public class Barbarian extends Monster implements WarriorInterface {
    // variables membres
    private final int m_iDAMAGE_POINT;
    private int m_iDealedDamage;
    Random random = new Random();
    private boolean isKo;
    // gives the type for the factory
    private WeaponsInterface axeWeapon;

    //constructor
    public Barbarian() {
        setHealthPoint(20);
        setWeakness("Sword");
        m_iDAMAGE_POINT = 15;
        axeWeapon = weaponFactory.setWeapon("Axe");
        setKo(false);
    }

    // méthodes

    @Override
    public void attack(WarriorSuperClass attackingCharacter,
                       WarriorSuperClass defendingCharacter) {
        System.out.println("\nBarbarian Attack\n");
        if (!getIsKO()) {
            axeWeapon.inflictDamages(attackingCharacter, defendingCharacter);
        } else {
            System.out.println("Le barbare est sonné, il n'attaque pas ce " +
                    "tour");
            setKo(false);
        }
        if (!defendingCharacter.isAlive(defendingCharacter)) {
            defendingCharacter.setIsAlive(false);
        }
    }

    // getters
    public boolean getIsKO() {
        return isKo;
    }

    // setters

    public void setKo(boolean ko) {
        isKo = ko;
    }
}
