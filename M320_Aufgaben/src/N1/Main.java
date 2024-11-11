package N1;
import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    static CurrencyConverter converter = new CurrencyConverter();

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
        System.out.println("1. EUR to GPD");
        System.out.println("2. GPD to USD");
        System.out.println("3. USD to GPD");
    }

    private static void chooseConverter(int exchangeType){

        switch(exchangeType){
            case 1:{
                converter.convertEURToGPD();
                break;
            }
            case 2:{
                converter.convertGPDToUSD();
                break;
            }
            case 3:{
                converter.convertUSDToEUR();
                break;
            }
            default:{
                System.out.println("Invalid option. Please choose between the numbers 1, 2 or 3.");
                break;
            }
        }
    }

}

