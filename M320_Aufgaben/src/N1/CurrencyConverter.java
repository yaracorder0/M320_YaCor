package N1;

import java.util.Scanner;

public class CurrencyConverter {
    public Scanner scanner = new Scanner(System.in);

    public void convertEURToGPD(){
        System.out.println("Enter a value:");
        int eur = scanner.nextInt();

        if(eur >= 0){
            System.out.println(eur + " EUR is " + eur * 0.86 + " GPD");
        } else {
            System.out.println("Please enter a positive number!");
        }
    }

    public void convertUSDToEUR(){
        System.out.println("Enter a value:");
        int usd = scanner.nextInt();

        if(usd >= 0){
            System.out.println(usd + " USD is " + usd * 0.91 + " EUR");
        } else {
            System.out.println("Please enter a positive number!");
        }
    }

    public void convertGPDToUSD(){
        System.out.println("Enter a value:");
        int gpd = scanner.nextInt();
        if (gpd >= 0){
            System.out.println(gpd + " GPD is " + gpd * 1.27 + " USD");
        } else {
            System.out.println("Please enter a positive number!");
        }
    }
}
