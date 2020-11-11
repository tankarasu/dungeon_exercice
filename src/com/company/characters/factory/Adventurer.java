package com.company.characters.factory;

import com.company.weapon.factory.WeaponsInterface;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Adventurer extends WarriorSuperClass implements WarriorInterface {
    // variables membres


    /*
     * Player have 2 différents weapons depends monster at instanciation
     * */
    private final WeaponsInterface swordWeapon;
    private final WeaponsInterface water_flaskWeapon;
    private String m_choosenWeapon;
    Scanner userInput = new Scanner(System.in);


    //constructor

    public Adventurer() {
        setHealthPoint(200);
        swordWeapon = weaponFactory.setWeapon("Sword");
        water_flaskWeapon = weaponFactory.setWeapon("Water_Flask");
    }

    // méthodes
    //todo ajouter une javadoc

    @Override
    public void attack(WarriorSuperClass attackingCharacter,
                       WarriorSuperClass defendingCharacter) {
        if (!isM_bIsKO()) {
            chooseWeapon();
            if (getM_choosenWeapon().equals("Fail")) {
                System.out.println("Your attack have failed");
            } else if (getM_choosenWeapon().equals("Sword")) {
                System.out.println("You attack with your " + getM_choosenWeapon());
                swordWeapon.inflictDamages(attackingCharacter, defendingCharacter);
            } else {
                System.out.println("You attack with your " + getM_choosenWeapon());
                water_flaskWeapon.inflictDamages(attackingCharacter,
                        defendingCharacter);
            }
        } else {
            setM_bIsKO(false);
        }
        if (!defendingCharacter.isAlive(defendingCharacter)) {
            defendingCharacter.setIsAlive(false);
            System.out.println("Ennemy is defeated");
        }
    }

    // by input a weapon Name + behavior
    // choose a weapon for the attack
    private void chooseWeapon() {
        String regexUserInput = "^((?:[ ]?[sS]word[ ]?)|(?:[ ]?[wW]ater[ " +
                "_][fF]lask)[ ]?)$";
        System.out.println("Wich weapon to use ? (Sword - Water_Flask)");
        String theUserInput = userInput.next();
        Pattern pattern = Pattern.compile(regexUserInput);
        Matcher matcher = pattern.matcher(theUserInput);
        boolean matchResult = matcher.matches();
        if (matchResult & theUserInput.equalsIgnoreCase("Sword")) {
            setM_choosenWeapon("Sword");
        } else if (matchResult & (theUserInput.equalsIgnoreCase("Water_Flask") | theUserInput.equalsIgnoreCase("Water Flask"))) {
            setM_choosenWeapon("Water_Flask");
        } else {
            setM_choosenWeapon("Fail");
        }

    }

    // getters

    public String getM_choosenWeapon() {
        return m_choosenWeapon;
    }

    // setters

    public void setM_choosenWeapon(String p_userInput) {
        m_choosenWeapon = p_userInput;
    }
}
