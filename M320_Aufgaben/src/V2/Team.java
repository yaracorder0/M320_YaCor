package V2;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private Goalkeeper goalkeeper;
    private List<Striker> strikers;
    private List<Defender> defenders;

    /**
     * Constructs a new Team with no players.
     */
    public Team() {
        this.defenders = new ArrayList<Defender>();
        this.strikers = new ArrayList<Striker>();
    }

    /**
     * Adds a player to the team based on their type.
     *
     * @param player The player to add.
     * @throws IllegalArgumentException If the player type is unknown.
     */
    public void setPlayer(Player player) {
        if (player instanceof Goalkeeper){
            setGoalkeeper((Goalkeeper) player);
        } else if (player instanceof Striker){
            addStriker((Striker) player);
        } else if (player instanceof Defender){
            addDefender((Defender) player);
        } else {
            throw new IllegalArgumentException("Unknown player type");
        }
    }

    /**
     * Sets the team's goalkeeper.
     *
     * @param goalkeeper The goalkeeper to add to team
     */
    public void setGoalkeeper(Goalkeeper goalkeeper) {
        this.goalkeeper = goalkeeper;
        System.out.println("Goalkeeper added: " + goalkeeper.getName());
    }

    /**
     * Adds a striker to the team if the limit is not reached.
     *
     * @param striker The striker to add to team
     */
    public void addStriker(Striker striker) {
        if (strikers.size() < 16){
            strikers.add(striker);
            System.out.println("Striker added: " + striker.getName());
        } else {
            System.out.println("Max amount of strikers reached.");
        }
    }

    /**
     * Adds a defender to the team if the limit is not reached.
     *
     * @param defender The defender to add to team
     */
    public void addDefender(Defender defender) {
        if (defenders.size() < 4){
            defenders.add(defender);
            System.out.println("Defender added: " + defender.getName());
        } else {
            System.out.println("Max amount of defenders reached.");
        }
    }

    /**
     * Prints all players of the team.
     */
    public void printTeam() {
        System.out.println("\nSoccer Team");
        if (goalkeeper != null) {
            System.out.println("Goalkeeper: " + goalkeeper.getName());
        }
        System.out.println("Strikers:");
        for (Striker striker : strikers) {
            System.out.println(striker.getName());
        }
        System.out.println("Defenders:");
        for (Defender defender : defenders) {
            System.out.println(defender.getName());
        }
    }

    /**
     *  Calls each Player play method.
     */
    public void play() {
        System.out.println("\nPlaying Team");
        if (goalkeeper != null) {
            goalkeeper.play();
        }
        for (Striker striker : strikers) {
            striker.play();
        }
        for (Defender defender : defenders) {
            defender.play();
        }
    }
}
