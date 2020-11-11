package com.company.weapon.factory;

import com.company.characters.factory.WarriorSuperClass;

import java.util.Random;

public class Axe implements WeaponsInterface {
    Random random = new Random();
    private int m_iDealedDamage;
    private final int m_iDAMAGE_POINT;

    // constructor

    public Axe() {
        m_iDAMAGE_POINT = 15;
    }

    // méthodes
    @Override
    public void inflictDamages(WarriorSuperClass attackingCharacter,
                               WarriorSuperClass defendingCharacter) {
        if (random.nextInt() > 0.3) {
            System.out.println("Barbarian does an extraDamage");
            m_iDealedDamage = m_iDAMAGE_POINT * 2;
        } else {
            m_iDealedDamage = m_iDAMAGE_POINT;
        }
        defendingCharacter.setHealthPoint(defendingCharacter.getHealthPoint() - m_iDealedDamage);
        System.out.println("you suffers " + m_iDealedDamage + " damages and " +
                "you have "
                + defendingCharacter.getHealthPoint() + " HP remaining");
    }

}
