package D2;

public class Passenger {

    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void returnName() {
        System.out.println(name);
    }


    public String getName() {
        return name;
    }
}
