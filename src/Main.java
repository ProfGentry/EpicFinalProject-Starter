package edu.ecpi.finalproject;

import java.util.Scanner;

/*
---------------------------------------------------------
STUDENT NOTES
---------------------------------------------------------

This file is the entry point of the program.

Its job is to:
• start the application
• create shared resources
• create the main Game object
• hand control to Game.java

You MAY:
• leave this file unchanged
• update small startup details if instructed

You SHOULD:
• keep this file short and simple
• let Game.java control the program flow

You SHOULD NOT:
• put game logic here
• build menus here
• write large methods here
• place your entire project inside main()

Think of Main.java as the "power button" of the program.
It starts the application, then hands control to Game.java.

---------------------------------------------------------
*/

/**
 * Main
 *
 * Entry point for the Java Final Project application.
 *
 * In professional software projects, the main class is usually
 * kept very small. Its purpose is to launch the application
 * and initialize any shared resources needed at startup.
 */
public class Main {

    /**
     * Starts the Java application.
     *
     * The JVM begins execution here when the program runs.
     *
     * @param args command-line arguments (not used in this project)
     */
    public static void main(String[] args) {

        // Create a shared Scanner for reading keyboard input
        Scanner input = new Scanner(System.in);

        // Create the main game controller object
        Game game = new Game(input);

        // Start the application
        game.start();

        // Close the Scanner before the program exits
        input.close();
    }
}
