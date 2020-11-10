package com.company.place;

public class SingleDungeon {


    // variables membres

    //creating the single Instance
    private static SingleDungeon instance = new SingleDungeon();

    //quantity of room in the current dungeon
    int m_iRoomNumber = 5;
    Room[] dungeonRooms = new Room[m_iRoomNumber];

    // by passing through all rooms the Adventurer will fight all Monsters
    // inside

    // when fight i want information of remaining HP of each
    // i want even the randomEvent if it's happens

    //constructor

    private SingleDungeon() {
    }

    // méthodes
    private void fillTheDungeon() {
        for (int i = 0; i < dungeonRooms.length; i++) {
            Room aNewRoom = new Room();
            dungeonRooms[i] = aNewRoom;
            aNewRoom.whatRoomIsIt();
        }
    }

    // return the only available Object
    public static SingleDungeon getInstance() {
        return instance;
    }

    public void enterDungeon() {
        System.out.println("you have entered the Dungeon");
        fillTheDungeon();

        // all rooms are iterated once you're still alive and monster is not
        // Alive until the last Doors
        // Iterator Pattern ?
    }

    public void openNextDoor() {
        System.out.println("next door's open");

        // if last door information of endGame
        // if players die = EndGame
    }

    // getters

    // setters


}
