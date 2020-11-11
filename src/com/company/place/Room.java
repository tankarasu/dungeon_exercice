package com.company.place;

import com.company.characters.factory.Adventurer;
import com.company.characters.factory.Barbarian;
import com.company.characters.factory.Monster;
import com.company.characters.factory.Wizard;

import java.util.Random;

public class Room {

    /*if warrior alive and monster !alive pass to a new room until the end
     * each Room generate one Random Monster
     * */

    // variables membres

    private int m_iRoomIndex;
    private static int RoomIndex = 0;
    private Monster monsterInTheRoom = new Monster();

    //constructor
    public Room() {
        // handle index of the room when created
        RoomIndex++;
        setRoomIndex(RoomIndex);
        setMonsterInTheRoom();
    }

    // méthodes
    public void enterInsideTheRoom(Adventurer player) {
        String monsterType = getMonsterInTheRoom().getClass().getSimpleName();
        if (player.isAlive(player)) {
            System.out.println("By entering room n°" + getRoomIndex() +
                    " You were attacked by a " + monsterType);
            monsterInTheRoom.whatIsWeakness();
        }
        // a fight until one of them die
        do {
            monsterInTheRoom.attack(monsterInTheRoom, player);
            if (!player.isAlive(player)) break;
            player.attack(player, monsterInTheRoom);
            monsterInTheRoom.setIsAlive(false);
            if (!monsterInTheRoom.isAlive(monsterInTheRoom)) break;
        } while ((player.getIsAlive()) && (monsterInTheRoom.getIsAlive()));
        System.out.println("---------------------");
    }

    // getters

    /**
     * @return - get the current room number who start at 1
     */
    public int getRoomIndex() {
        return m_iRoomIndex;
    }

    public Monster getMonsterInTheRoom() {
        return monsterInTheRoom;
    }

    // setters

    /**
     * @param RoomIndex - set instancied Room number
     */
    public void setRoomIndex(int RoomIndex) {
        m_iRoomIndex = RoomIndex;
    }

    public void setMonsterInTheRoom() {
        Random random = new Random();
        if (random.nextInt() < 0.5)
            this.monsterInTheRoom = new Wizard();
        else this.monsterInTheRoom = new Barbarian();
    }
}
