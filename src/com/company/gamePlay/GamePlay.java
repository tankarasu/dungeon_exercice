package com.company.gamePlay;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GamePlay {


    // les différents choix possible dans le menu principale
    enum m_emenu {EASY, MEDIUM, HARD, HIGH_SCORE, QUIT}

    static Scanner m_scmenuScan = new Scanner(System.in);
    int menuChoice = 0;
    static String regexTest = "(?:^)[ ]sword[ ]?(?:$)|(?:^)[ ]?water[ _]?flask[ ]?(?:$)";

    // méthodes
    // explicit
    public static void welcomeMessage() {
        String line = "Welcome to the aweful and ugly DUNGEON";
        String bars = "";
        for (int i = 0; i < line.length(); i++) {
            bars += "-";
        }
        System.out.println(bars + "\n" + line + "\nClean it!\n" + bars);
    }

    public static void mainMenu() {
        System.out.println("Make a choice and don't be Afraid!!!");
        for (m_emenu choice : m_emenu.values()) {
            System.out.println((choice.ordinal() + 1) + " - " + choice);
        }

        // passer en String pour try&catch
        String userInput = m_scmenuScan.next();

        userInput = isTheChooseMenuValid(userInput);

        int Choice = Integer.parseInt(userInput);

        // choix de la difficulté,HS et Quit
        switch (Choice) {
            case 1:
            case 2:
            case 3:
                playGame(Choice);
                break;
            case 4:
                System.out.println("HIGH_SCORE");
                viewHighScore();
                mainMenu();
                break;
            case 5:
                System.out.println("Have a good Day Boy");
                quitGame();
                break;
            default:
                mainMenu();
        }
    }

    private static String isTheChooseMenuValid(String userInput) {
        Pattern pattern = Pattern.compile("[1-6]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(userInput);
        while (!matcher.find()) {
            System.out.println("Choice's not valid, try Again");
            userInput = m_scmenuScan.next();
            matcher = pattern.matcher(userInput);
        }
        return userInput;
    }

    private static boolean isTheWeaponPerformAgainst(String regexTest, String userInput) {
        Pattern test = Pattern.compile(regexTest, Pattern.CASE_INSENSITIVE);
        Matcher matcher = test.matcher(userInput);
        return matcher.find();
    }

    private static void playGame(int menuChoice) {
        System.out.println("Play the Game");
    }

    private static void quitGame() {
        System.out.println("Quit the Game");
    }

    private static void viewHighScore() {
        System.out.println("View the highScore");
    }
}
    // variables membres
