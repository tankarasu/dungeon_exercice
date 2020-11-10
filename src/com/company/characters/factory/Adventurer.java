package com.company.characters.factory;

public class Adventurer extends WarriorSuperClass implements WarriorInterface {
    // variables membres

    /*
     * Player have 2 differents weapons depends monster at instanciation
     * */

    //constructor

    public Adventurer() {
        setHealthPoint(200);
    }


    // méthodes


    @Override
    public void attack(WarriorSuperClass defendingCharacter) {
        System.out.println("The Player attack");
    }

    // by input a weapon Name + behavior
    // choose a weapon for the attack
    private void chooseWeapon() {
        System.out.println("You have choosen a weapon");
    }


    // getters

    // setters


}
