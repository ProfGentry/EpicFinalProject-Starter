import java.util.Scanner;

public class Game {
    private Scanner input;
    private boolean running;

    public Game(Scanner input) {
        this.input = input;
        this.running = true;
    }

    public void start() {
        System.out.println("Welcome to the Java Final Project!");
        
        while (running) {
            showMenu();
            int choice = input.nextInt();
            input.nextLine(); // clear newline

            handleChoice(choice);
        }

        System.out.println("Thanks for playing!");
    }

    public void showMenu() {
        System.out.println("\n=== Main Menu ===");
        System.out.println("1. Start Adventure");
        System.out.println("2. View Game Mode");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    public void handleChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Adventure mode coming soon...");
                break;
            case 2:
                GameMode mode = new GameMode("Adventure");
                mode.displayMode();
                break;
            case 3:
                running = false;
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}
