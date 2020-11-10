package com.company.characters.factory;

import com.company.weapon.WeaponFactory;

public class WarriorSuperClass {

    // variables membres
    private int m_iHealthPoint;
    private boolean m_bIsAlive;
    protected static WeaponFactory weaponFactory = new WeaponFactory();

    //constructor

    protected WarriorSuperClass() {
        m_bIsAlive = true;
    }

    // méthodes
    public boolean isAlive(WarriorSuperClass character) {
        return getHealthPoint() > 0;
    }

    // getters

    public int getHealthPoint() {
        return m_iHealthPoint;
    }

    public boolean getIsAlive() {
        return m_bIsAlive;
    }

    // setters

    public void setHealthPoint(int HealthPoint) {
        m_iHealthPoint = HealthPoint;
    }

    public void setIsAlive(boolean IsAlive) {
        m_bIsAlive = IsAlive;
    }
}
