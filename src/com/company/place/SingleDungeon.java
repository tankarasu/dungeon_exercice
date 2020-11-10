package com.company.place;

public class SingleDungeon {


    // variables membres

    //creating the single Instance
    private static SingleDungeon instance = new SingleDungeon();

    //quantity of room in the current dungeon
    int m_iRoomNumber;
    // by passing through all rooms the Adventurer will fight all Monsters
    // inside

    //constructor

    private SingleDungeon() {
    }

    // méthodes

    // return the only available Object
    public static SingleDungeon getInstance() {
        return instance;
    }

    public void enterDungeon() {
        System.out.println("you have entered the Dungeon");
    }

    // getters

    // setters


}
