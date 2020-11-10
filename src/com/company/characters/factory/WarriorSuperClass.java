package com.company.characters.factory;

public class WarriorSuperClass {

    // variables membres
    private int m_iHealthPoint;
    private boolean m_bIsAlive;

    //constructor

    protected WarriorSuperClass() {
        m_bIsAlive = true;

    }

    // méthodes
    protected boolean isAlive(WarriorSuperClass character) {
        return m_iHealthPoint > 0;
    }

    // getters

    protected int getHealthPoint() {
        return m_iHealthPoint;
    }

    protected boolean getIsAlive() {
        return m_bIsAlive;
    }

    // setters

    protected void setHealthPoint(int HealthPoint) {
        m_iHealthPoint = HealthPoint;
    }

    protected void setIsAlive(boolean IsAlive) {
        m_bIsAlive = IsAlive;
    }
}
