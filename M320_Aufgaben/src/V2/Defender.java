package V2;

public class Defender extends Player{

    /**
     * Constructs a new Defender with the given name.
     *
     * @param name The name of the defender.
     */
    public Defender(String name) {
        super(name);
    }

    /**
     * Describes the role of the defender.
     */
    @Override
    public void play() {
        System.out.println(getName() + " is a defender");
    }
}
