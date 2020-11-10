package com.company.characters.factory;

public class Barbarian extends Monster implements WarriorInterface{
    // variables membres

    //constructor
    public Barbarian() {
        setHealthPoint(20);
        setWeakness("Sword");
    }

    // méthodes

    @Override
    public void attack(WarriorSuperClass defendingCharacter) {
        System.out.println("Barbarian Attack");
    }


    // getters

    // setters


}
