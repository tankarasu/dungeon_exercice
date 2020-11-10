package com.company.place;

public class SingleDungeon {


    // variables membres

    //creating the single Instance
    private final static SingleDungeon instance = new SingleDungeon();

    //constructor
    private SingleDungeon() {
    }

    //quantity of room in the current dungeon
    int m_iRoomNumber = 5;

    // by passing through all rooms the Adventurer will fight all Monsters
    // inside

    // when fight i want information of remaining HP of each
    // i want even the randomEvent if it's happens


    // méthodes
    public void enterDungeon(int p_difficulty) {
        System.out.println("you have entered the Dungeon");
        fillTheDungeonWithRoom(p_difficulty);

        // all rooms are iterated once you're still alive and monster is not
        // Alive until the last Doors
        // Iterator Pattern ?
    }

    private void fillTheDungeonWithRoom(int p_difficulty) {
        Room[] dungeonRooms = new Room[4 + p_difficulty];

        for (int i = 0; i < dungeonRooms.length; i++) {
            Room aNewRoom = new Room();
            dungeonRooms[i] = aNewRoom;
        }
    }

    // return the only available Object
    public static SingleDungeon getInstance() {
        return instance;
    }


    private void openNextDoor() {
        System.out.println("next door's open");

        // if last door information of endGame
        // if players die = EndGame
    }

    // getters

    // setters


}
