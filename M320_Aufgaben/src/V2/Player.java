package V2;

public abstract class Player {

    private String name;

    /**
     * Constructs a new Player with the given name.
     *
     * @param name The name of the player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the player.
     *
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Abstract method to describe the role of the player.
     */
    public abstract void play();
}
