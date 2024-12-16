package V2;

public class Goalkeeper extends Player{

    private double height;

    /**
     * Constructs a new Goalkeeper with the given name and height.
     *
     * @param name   The name of the goalkeeper.
     * @param height The height of the goalkeeper in meters.
     */
    public Goalkeeper(String name, double height) {
        super(name);
        this.height = height;
    }

    /**
     * Describes the role of the goalkeeper and their height.
     */
    @Override
    public void play() {
        System.out.println(getName() +" is a goalkeeper and is " + height + " m");
    }
}
