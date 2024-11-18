package D2;


import java.util.ArrayList;
import java.util.List;

public class Flight {
    private List<Passenger> passengers = new ArrayList<>();


    public void returnPassengerList() {
        for (Passenger p : passengers) {
            p.returnName();
        }
    }


    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }


    public List<Passenger> getAllPassengers() {
        return passengers;
    }


    public Passenger getPassengerByName(String name) {
        for (Passenger p : passengers) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;  // If passenger not found
    }
}
