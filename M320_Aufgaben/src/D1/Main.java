package D1;

public class Main {

    public static void main(String[] args) {
        Heater heater1 = new Heater(40, 10);

        // set the temperature
        heater1.setTemperature(50);

        // set the increment
        heater1.setIncrement(2);

        // get all info except increment
        System.out.println(heater1.getMinMaxAndTemperature());

    }
}
