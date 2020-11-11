package com.company.weapon.factory;

import com.company.characters.factory.Adventurer;
import com.company.characters.factory.WarriorSuperClass;

public interface WeaponsInterface {

    void inflictDamages(WarriorSuperClass attackingCharacter,
                        WarriorSuperClass defendingCharacter);

}
