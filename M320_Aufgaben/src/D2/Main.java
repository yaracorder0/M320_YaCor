package D2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Flight flight = new Flight();
        boolean exit = true;

        Passenger rando = new Passenger("Anik");
        flight.addPassenger(rando);


        do{
            System.out.println("Passenger Management");
            System.out.println("1. Add Passenger");
            System.out.println("2. Remove Passenger");
            System.out.println("3. Print Passenger List");


            System.out.println("\nChoose a number:");
            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1: {
                    System.out.println("Enter Passenger name :");
                    String name = scan.nextLine();
                    Passenger passenger = new Passenger(name);
                    flight.addPassenger(passenger);
                    System.out.println("Passenger Added");
                    break;
                }
                case 2: {
                    System.out.println("Enter Passenger name :");
                    String name = scan.nextLine();
                    Passenger p = flight.getPassengerByName(name);
                    if (p == null) {
                        System.out.println("Passenger not found");
                        break;
                    }
                    flight.removePassenger(p);
                    System.out.println("Passenger Removed");
                    break;
                }
                case 3: {
                    System.out.println("List of passengers in flight:");
                    flight.returnPassengerList();
                }
            }

            System.out.println("\nDo you want to exit? (Y/N)");
            String answer = scan.nextLine();
            if(answer.toLowerCase().equals("y")){
                exit = false;
            }

        }while(exit);



    }
}
