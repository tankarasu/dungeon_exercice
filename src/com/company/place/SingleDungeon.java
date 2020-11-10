package com.company.place;

import com.company.characters.factory.Adventurer;

public class SingleDungeon {


    // variables membres

    //creating the single Instance
    private final static SingleDungeon instance = new SingleDungeon();

    //constructor
    private SingleDungeon() {
    }

    // by passing through all rooms the Adventurer will fight all Monsters
    // inside

    // when fight i want information of remaining HP of each
    // i want even the randomEvent if it's happens


    // méthodes
    public void enterDungeon(int p_difficulty) {
        // initialize the dungeon, the players and the content of each room
        Room[] dungeonRooms = new Room[4 + p_difficulty];
        System.out.println("you have entered the Dungeon");
        Adventurer player = new Adventurer();
        fillTheDungeonWithRoom(dungeonRooms);

        // all rooms are iterated once you're still alive and monster is not
         for (int i = 0; i < dungeonRooms.length; i++) {
                dungeonRooms[i].enterInsideTheRoom(player);
            }



        // Alive until the last Doors
        // Iterator Pattern ?
    }

    private void fillTheDungeonWithRoom(Room[] rooms) {

        for (int i = 0; i < rooms.length; i++) {
            Room aNewRoom = new Room();
            rooms[i] = aNewRoom;
        }
    }

    // return the only available Object
    public static SingleDungeon getInstance() {
        return instance;
    }


    private void openNextDoor() {
        System.out.println("next door's open");
        // give information of who attack you
        // the attack will be done inside the room

        // if last door information of endGame
        // if players die = EndGame
    }

    // getters

    // setters


}
