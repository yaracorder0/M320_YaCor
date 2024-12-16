package V2;

public class Striker extends Player {

    public Striker(String name) {
        super(name);
    }

    public void jogTraining(){
        System.out.println(getName() + " is jogging.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is a striker");
    }
}
