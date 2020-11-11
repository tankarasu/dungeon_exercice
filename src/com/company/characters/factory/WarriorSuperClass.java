package com.company.characters.factory;

import com.company.weapon.WeaponFactory;

public class WarriorSuperClass {

    // variables membres
    private int m_iHealthPoint;
    private boolean m_bIsAlive;
    private boolean m_bIsKO;
    protected static WeaponFactory weaponFactory = new WeaponFactory();
    private String m_sWeakness;
    private int flaskNumber = 0;


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

    public boolean isM_bIsKO() {
        return m_bIsKO;
    }

    public int getFlaskNumber() {
        return flaskNumber;
    }

    public String getWeakness() {
        return m_sWeakness;
    }

    // setters

    public void setHealthPoint(int HealthPoint) {
        m_iHealthPoint = HealthPoint;
    }

    public void setIsAlive(boolean IsAlive) {
        m_bIsAlive = IsAlive;
    }

    public void setM_bIsKO(boolean IsKO) {
        m_bIsKO = IsKO;
    }

    public void setFlaskNumber(int p_flaskNumber) {
        flaskNumber = p_flaskNumber;
    }
}

