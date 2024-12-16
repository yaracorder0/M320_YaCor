package V2;

public class Main {

    /**
     * Main method to run the soccer team simulation.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Team femaleTeam = new Team();

        Goalkeeper goalkeeper = new Goalkeeper("Anik", 1.55 );
        Striker striker1 = new Striker("Giulia");
        Striker striker2 = new Striker("Naima");
        Defender defender1 = new Defender("Leona");
        Defender defender2 = new Defender("Jasmin");
        Defender defender3 = new Defender("Michelle");

        System.out.println("All Players are added ->");

        femaleTeam.setPlayer(goalkeeper);
        femaleTeam.setPlayer(striker1);
        femaleTeam.setPlayer(striker2);
        femaleTeam.setPlayer(defender1);
        femaleTeam.setPlayer(defender2);
        femaleTeam.setPlayer(defender3);


        femaleTeam.printTeam();

        femaleTeam.play();
    }
}
