package com.company.place;

public class Room {

    /*if warrior alive and monster !alive pass to a new room until the end
     * each Room generate one Random Monster
     * */

    // variables membres

    private int m_iRoomIndex;
    private static int RoomIndex = 0;

    //constructor
    public Room() {
        RoomIndex++;

        setRoomIndex(RoomIndex);
    }

    // méthodes
    public void whatRoomIsIt() {
        System.out.println("You are in the room n°" + getRoomIndex());
    }

    // getters

    /**
     * @return - get the current room number who start at 1
     */
    public int getRoomIndex() {
        return m_iRoomIndex;
    }

    // setters

    /**
     * @param RoomIndex - set instancied Room number
     */
    public void setRoomIndex(int RoomIndex) {
        m_iRoomIndex = RoomIndex;
    }
}
