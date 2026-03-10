/*
---------------------------------------------------------
STUDENT NOTES
---------------------------------------------------------

This class represents the player in the program.

It stores information about the player and provides
methods that allow the program to interact with that data.

You MAY:
• add new player attributes (inventory, level, etc.)
• add new player methods (attack, heal, gain experience)
• modify how player stats are displayed

You SHOULD:
• keep player-related data inside this class
• use methods to change player state instead of directly
  modifying variables from other classes

You SHOULD NOT:
• move player data into Game.java
• make fields public unless instructed
• store unrelated game logic in this class

This class models the idea of an OBJECT in Java.

An object combines:
data (fields) + behavior (methods)

---------------------------------------------------------
*/

/**
 * Player
 *
 * Represents the player character in the application.
 *
 * This class stores player-related data such as name,
 * health, and score. It also provides methods for
 * interacting with that data.
 *
 * In object-oriented design, this type of class is often
 * called a "model" because it represents an entity
 * in the system.
 */
public class Player {

    /** Player name */
    private String name;

    /** Player health value */
    private int health;

    /** Player score or experience points */
    private int score;

    /**
     * Constructor used to create a new player.
     *
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.score = 0;
    }

    /**
     * Displays the player's current statistics.
     */
    public void displayStats() {

        System.out.println("\n--- Player Stats ---");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Score: " + score);
    }

    /**
     * Reduces the player's health.
     *
     * @param damage amount of damage taken
     */
    public void takeDamage(int damage) {

        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }

    /**
     * Adds points to the player's score.
     *
     * @param points number of points gained
     */
    public void addScore(int points) {
        score += points;
    }

    /**
     * Checks whether the player is still alive.
     *
     * @return true if health is greater than zero
     */
    public boolean isAlive() {
        return health > 0;
    }

}
