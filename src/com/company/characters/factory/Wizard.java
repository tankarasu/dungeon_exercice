package com.company.characters.factory;

public class Wizard extends Monster implements WarriorInterface {
    // variables membres


    //constructor

    public Wizard() {
        setHealthPoint(20);
        setWeakness("Water_Flask");
    }

    // méthodes

    @Override
    public void attack(WarriorSuperClass defendingCharacter) {
        System.out.println("Wizard attack");
    }


    // getters

    // setters


}
