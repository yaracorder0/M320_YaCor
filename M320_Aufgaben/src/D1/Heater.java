package D1;

public class Heater {

    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heater(int max, int min) {
        this.increment = 5;
        this.max = max;
        this.min = min;
        this.temperature = 15;
    }


    public String getMinMaxAndTemperature() {
        return "Temperature: " + temperature + "\nMin: " + min + "\nMax: " + max;
    }

    public int getIncrement() {
        return increment;
    }


    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature >= min && temperature <= max) {
            this.temperature = temperature;
        } else {
            System.out.println("Invalid temperature -> is above or below min/max");
        }
    }
}
