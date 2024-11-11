package N1;
import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        boolean repeat = true;

        System.out.println("Currency Converter");
        while (repeat) {
            showMenu();

            int exchange = scanner.nextInt();
            chooseConverter(exchange);

            System.out.println("Do you want to convert again? (y/n)");
            char answer = scanner.next().charAt(0);
            if (answer == 'n' || answer == 'N') {
                repeat = false;
                System.out.println("Thank you for using this converter.");
            }
        }
    }

    private static void showMenu(){
        System.out.println("Choose one of the following options to convert:");
        System.out.println("1. CHF to Euro");
        System.out.println("2. Euro to CHF ");
        System.out.println("3. CHF to USD");
    }

    private static void chooseConverter(int exchange){
        switch(exchange){
            case 1:{
                convertCHFtoEuro();
                break;
            }
            case 2:{
                convertEURtoCHF();
                break;
            }
            case 3:{
                convertCHFtoUSD();
                break;
            }
            default:{
                System.out.println("Invalid option. Please choose between the numbers 1, 2 or 3.");
                break;
            }
        }
    }

    private static void convertCHFtoEuro(){
        System.out.println("Enter a number for CHF:");
        float chf = scanner.nextFloat();
        if(chf>=0){
            System.out.println(chf+ " CHF is " + chf*1.04 + " EURO");
        } else {
            System.out.println("Please enter positive numbers for CHF!");
        }
    }


    private static void convertEURtoCHF(){
        System.out.println("Enter a number for EUR:");
        float usd = scanner.nextFloat();
        if(usd>=0){
            System.out.println(usd + " EUR is " + usd * 1.11 + " CHF");
        } else {
            System.out.println("Please enter positive numbers for EUR!");
        }
    }

    private static void convertCHFtoUSD(){
        System.out.println("Enter a number for CHF:");
        float chf = scanner.nextFloat();
        if(chf>=0){
            System.out.println(chf + " CHF is " + chf * 1.11 + " USD");
        } else {
            System.out.println("Please enter positive numbers for CHF!");
        }
    }
}

