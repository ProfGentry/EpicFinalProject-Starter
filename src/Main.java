package edu.ecpi.epicfinalproject;
/*
---------------------------------------------------------
STUDENT NOTES
---------------------------------------------------------

This file launches the program.

You SHOULD NOT:
- Add gameplay logic here
- Add large methods here
- Write your entire program inside main()

You MAY:
- Leave this file unchanged
- Add minor startup messages if desired

Your main development work should happen in:

Game.java        -> controls the program flow
Player.java      -> stores player information
GameMode.java    -> represents different modes or actions
Other classes    -> features you add during the project

Think of Main.java as the "power button" of the program.

When the program starts:
1. Main.java runs
2. A Game object is created
3. The Game class controls everything else

---------------------------------------------------------
*/

import java.util.Scanner;

/**
 * Main
 *
 * Entry point for the Java Final Project application.
 *
 * This class is responsible for launching the program and initializing
 * shared resources needed by the application.
 *
 * In professional software projects, the main class should remain very small
 * and should only be responsible for starting the application.
 *
 * All program logic should be implemented in other classes.
 */
public class Main {

    /**
     * Application entry point.
     *
     * The JVM begins execution here when the program starts.
     *
     * @param args command line arguments (not used in this project)
     */
    public static void main(String[] args) {

        // ---------------------------------------------------------
        // Create a Scanner object for reading user input
        // ---------------------------------------------------------
        // This scanner is shared with the Game class so the entire
        // application can read keyboard input from the player.
        Scanner input = new Scanner(System.in);

        // ---------------------------------------------------------
        // Create the main Game object
        // ---------------------------------------------------------
        // The Game class contains the primary program logic including
        // menus, gameplay flow, and interactions with other classes.
        Game game = new Game(input);

        // ---------------------------------------------------------
        // Start the game
        // ---------------------------------------------------------
        // Control of the program is now passed to the Game class.
        game.start();

        // ---------------------------------------------------------
        // Close the scanner when the program finishes
        // ---------------------------------------------------------
        input.close();
    }
}
