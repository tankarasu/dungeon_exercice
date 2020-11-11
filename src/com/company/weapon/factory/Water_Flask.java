package com.company.weapon.factory;

import com.company.characters.factory.WarriorSuperClass;

import java.util.Random;

public class Water_Flask implements WeaponsInterface {
    // variables membres
    public int m_iDealedDamage = 10;
    public int flaskNumber = 0;

    @Override
    public void inflictDamages(WarriorSuperClass defendingCharacter) {
        if (!getClass().getSimpleName().equals(defendingCharacter.getWeakness())) {
            System.out.println("This weapon isn't efficient against Barbarian");
        } else {
            defendingCharacter.setHealthPoint(defendingCharacter.getHealthPoint() - m_iDealedDamage);
            System.out.println("Wizard suffers " + m_iDealedDamage + " damages" +
                    " and he's still have " + defendingCharacter.getHealthPoint() + " HP remaining");
        }
    }
}
