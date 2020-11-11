package com.company.weapon.factory;

import com.company.characters.factory.WarriorSuperClass;

import java.util.Random;

public class Sword implements WeaponsInterface {

    // méthodes

    @Override
    public void inflictDamages(WarriorSuperClass defendingCharacter) {
    Random random = new Random();
        // is weapon efficient?
        if (!getClass().getSimpleName().equals(defendingCharacter.getWeakness())) {
            System.out.println("This weapon isn't efficient against the " +
                    "Wizard");
        } else {
            if (random.nextInt() > 0.3) {
                System.out.println("Barbarian get disoriented");
                defendingCharacter.setM_bIsKO(true);
            }
            // variables membres
            int m_iDealedDamage = 10;
            defendingCharacter.setHealthPoint(defendingCharacter.getHealthPoint() - m_iDealedDamage);
            System.out.println("Barbarian suffers " + m_iDealedDamage + " " +
                    "damages and " +
                    "he's still have "
                    + defendingCharacter.getHealthPoint() + " HP remaining");
        }
    }
}
