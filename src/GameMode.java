/*
---------------------------------------------------------
STUDENT NOTES
---------------------------------------------------------

This class represents a game mode in the program.

A game mode could describe the current style of play,
such as Adventure, Survival, Battle, Puzzle, or any
other mode you want your project to support.

You MAY:
• change the mode name
• add more fields related to the mode
• add methods that describe or control the mode
• expand this class to support multiple game styles

You SHOULD:
• keep mode-related data in this class
• use methods to display or manage mode information
• keep this class focused on the game mode concept

You SHOULD NOT:
• place all game logic in this class
• store player data here
• turn this into a second Game.java

Think of this class as a model for one part of your game.

---------------------------------------------------------
*/

/**
 * GameMode
 *
 * Represents a game mode used by the application.
 *
 * This class stores information about the current mode and
 * provides methods for displaying or managing that mode.
 *
 * In object-oriented design, this is a model class because
 * it represents a specific concept in the system.
 */
public class GameMode {

    /** Name of the current game mode */
    private String modeName;

    /**
     * Creates a new GameMode object.
     *
     * @param modeName name of the game mode
     */
    public GameMode(String modeName) {
        this.modeName = modeName;
    }

    /**
     * Displays information about the current game mode.
     *
     * Students may expand this method later to show
     * more detailed information about how the mode works.
     */
    public void displayMode() {
        System.out.println("\n--- Game Mode ---");
        System.out.println("Current mode: " + modeName);
        System.out.println("More features for this mode will be added in later weeks.");
    }

    /**
     * Returns the name of the current game mode.
     *
     * @return the current mode name
     */
    public String getModeName() {
        return modeName;
    }

    /**
     * Updates the name of the current game mode.
     *
     * @param modeName new mode name
     */
    public void setModeName(String modeName) {
        this.modeName = modeName;
    }
}
