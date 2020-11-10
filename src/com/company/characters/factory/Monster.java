package com.company.characters.factory;

public class Monster extends WarriorSuperClass {
    // monsters will have a weakness, and know it
    // indicates players wich weapon is efficient

    // variables membres
    private String m_sWeakness;

    //constructor

    // méthodes
    public void whatIsWeakness() {
        System.out.println("You must attack back with " + getWeakness());
    }

    // getters

    public String getWeakness() {
        return m_sWeakness;
    }

    // setters

    public void setWeakness(String Weakness) {
        m_sWeakness = Weakness;
    }
}
