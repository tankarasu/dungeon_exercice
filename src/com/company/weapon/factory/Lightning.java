package com.company.weapon.factory;

import com.company.characters.factory.WarriorSuperClass;

import java.util.Random;

public class Lightning implements WeaponsInterface {
    // variables membres
    Random random = new Random();
    private int m_iDealedDamage = 10;

    // méthodes

    public void inflictDamages(WarriorSuperClass attackingCharacter,
                               WarriorSuperClass defendingCharacter) {
        if (random.nextInt() > 0.25) {
            System.out.println("You had frozen by Wizard and can't attack " +
                    "one turn!");
            defendingCharacter.setM_bIsKO(true);
        }
        defendingCharacter.setHealthPoint(defendingCharacter.getHealthPoint() - m_iDealedDamage);
        System.out.println("you suffers " + m_iDealedDamage + " damages and " +
                "you have "
                + defendingCharacter.getHealthPoint() + " HP remaining");
    }
}
//todo set difficulties with Random event
