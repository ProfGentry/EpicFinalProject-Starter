import java.util.Scanner;

/*
---------------------------------------------------------
STUDENT NOTES
---------------------------------------------------------

This class controls the main flow of the program.

It is responsible for:
• displaying menus
• reading user input
• directing the program to the correct feature
• controlling when the program starts and stops

You MAY:
• add new menu options
• add new helper methods
• expand the adventure logic
• connect new classes you create

You SHOULD:
• keep methods small and organized
• move feature-specific logic into new classes
• keep menu handling readable

You SHOULD NOT:
• place your entire project in one method
• duplicate player logic here if Player.java should handle it
• remove the main program loop

Think of this class as the "controller" of the application.
It directs traffic between other classes.

---------------------------------------------------------
*/

/**
 * Game
 *
 * Controls the main flow of the Java Final Project application.
 *
 * This class coordinates user interaction, menu navigation,
 * and communication between other project classes.
 *
 * In professional software systems this type of class is
 * often called a controller or application manager.
 */
public class Game {

    /** Scanner used for reading user input */
    private Scanner input;

    /** Controls whether the application loop continues running */
    private boolean running;

    /** Represents the player for the current session */
    private Player player;

    /** Represents the current game mode */
    private GameMode mode;

    /**
     * Constructor that initializes the game state.
     *
     * @param input shared Scanner used for keyboard input
     */
    public Game(Scanner input) {
        this.input = input;
        this.running = true;

        // Create the player object
        this.player = new Player("Hero");

        // Initialize the starting game mode
        this.mode = new GameMode("Adventure");
    }

    /**
     * Starts the main program loop.
     *
     * This method runs until the player chooses to exit.
     */
    public void start() {

        displayWelcomeMessage();

        while (running) {
            showMenu();
            int choice = Utils.getIntInput(input);
            handleChoice(choice);
        }

        displayExitMessage();
    }

    /**
     * Displays the welcome message shown at program start.
     */
    private void displayWelcomeMessage() {

        Utils.printDivider();
        System.out.println("   Welcome to the Java Adventure");
        Utils.printDivider();
    }

    /**
     * Displays the exit message when the program ends.
     */
    private void displayExitMessage() {
        System.out.println("Game session ended.");
    }

    /**
     * Displays the main menu options.
     *
     * Students will expand this menu as new features
     * are added throughout the project.
     */
    private void showMenu() {

        System.out.println("\n=== Main Menu ===");
        System.out.println("1. Start Adventure");
        System.out.println("2. View Player Stats");
        System.out.println("3. View Game Mode");
        System.out.println("4. Exit");

        System.out.print("Choose an option: ");
    }

    /**
     * Processes the player's menu selection.
     *
     * @param choice menu option selected by the user
     */
    private void handleChoice(int choice) {

        switch (choice) {

            case 1:
                startAdventure();
                break;

            case 2:
                viewPlayerStats();
                break;

            case 3:
                viewGameMode();
                break;

            case 4:
                exitGame();
                break;

            default:
                System.out.println("Invalid choice. Try again.");
        }
    }

    /**
     * Placeholder method where students will implement
     * their main gameplay logic later in the project.
     */
    private void startAdventure() {

        System.out.println("\nAdventure mode starting...");
        System.out.println("More gameplay features will be added in later weeks.");
    }

    /**
     * Displays the player's statistics.
     */
    private void viewPlayerStats() {
        player.displayStats();
    }

    /**
     * Displays information about the current game mode.
     */
    private void viewGameMode() {
        mode.displayMode();
    }

    /**
     * Ends the main program loop and exits the application.
     */
    private void exitGame() {
        running = false;
    }
}
