package edu.ecpi.finalproject;

import java.util.Scanner;

/*
---------------------------------------------------------
STUDENT NOTES
---------------------------------------------------------

This class contains helper methods used throughout the program.

Utility classes are common in professional software projects.
They store reusable tools that multiple classes may need.

Examples:
• input validation
• formatting output
• random number helpers
• reusable calculations

You MAY:
• add additional helper methods
• add new input validation methods
• add formatting utilities

You SHOULD:
• keep methods reusable
• avoid storing game-specific logic here

You SHOULD NOT:
• store player data here
• store game state here
• turn this into a second Game.java

Think of this class as a toolbox for your program.

---------------------------------------------------------
*/

/**
 * Utils
 *
 * Utility class that provides helper methods used throughout
 * the application.
 *
 * All methods in this class are static, meaning they can be
 * used without creating a Utils object.
 */
public class Utils {

    /**
     * Safely reads an integer from the user.
     *
     * This prevents the program from crashing if the user enters
     * invalid input such as letters instead of numbers.
     *
     * @param input shared Scanner object
     * @return valid integer entered by the user
     */
    public static int getIntInput(Scanner input) {

        while (!input.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            input.next();
        }

        int value = input.nextInt();
        input.nextLine(); // clears newline from input buffer

        return value;
    }

    /**
     * Reads a line of text input from the user.
     *
     * @param input shared Scanner object
     * @return text entered by the user
     */
    public static String getStringInput(Scanner input) {
        return input.nextLine();
    }

    /**
     * Generates a random number within a given range.
     *
     * This method may be useful later for gameplay events.
     *
     * @param min minimum value
     * @param max maximum value
     * @return random integer within range
     */
    public static int randomNumber(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    /**
     * Prints a visual divider line for console formatting.
     *
     * Helps improve readability of console output.
     */
    public static void printDivider() {
        System.out.println("---------------------------------");
    }

}
