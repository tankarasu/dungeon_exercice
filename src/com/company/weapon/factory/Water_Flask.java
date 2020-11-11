package com.company.weapon.factory;

import com.company.characters.factory.WarriorSuperClass;

public class Water_Flask implements WeaponsInterface {
    // variables membres
    public int m_iDealedDamage = 10;

    @Override
    public void inflictDamages(WarriorSuperClass attackingCharacter,
                               WarriorSuperClass defendingCharacter) {
        if (!getClass().getSimpleName().equals(defendingCharacter.getWeakness())) {
            System.out.println("This weapon isn't efficient against Barbarian");
        } else {
            if (attackingCharacter.getFlaskNumber() > 0) {
                System.out.println("number of waterFlask on his feet:" + attackingCharacter.getFlaskNumber());
            }
            int damageDone =
                    m_iDealedDamage + (attackingCharacter.getFlaskNumber() * 2);
            defendingCharacter.setHealthPoint(defendingCharacter.getHealthPoint() - damageDone);
            System.out.println("Wizard suffers " + damageDone + " damages" +
                    " and he's still have " + defendingCharacter.getHealthPoint() + " HP remaining");
            attackingCharacter.setFlaskNumber(attackingCharacter.getFlaskNumber() + 1);
        }
    }
}
