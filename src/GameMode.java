public class GameMode {
    private String modeName;

    public GameMode(String modeName) {
        this.modeName = modeName;
    }

    public void displayMode() {
        System.out.println("Current game mode: " + modeName);
    }
}
