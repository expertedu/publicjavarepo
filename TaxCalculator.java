package publicjavarepo;

import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your annual income (in rupees): ");
        double income=sc.nextDouble();

        double tax=0;

        if (income<=1200000) {
            tax=0;
            System.out.println("No tax for upto 12 lac annual income: "+tax +" (in rupees)");
        } else if (income<=1600000) {
            tax=(income-1200000)*0.15;
            System.out.println("15% tax on annual income between 12 lac to 16 lac: "+tax +" (in rupees)");
        } else if (income<=2000000) {
            tax=(1200000*0.00)+((1600000-1200000)*0.15)+(income-1600000)*0.20;
            System.out.println("20% tax on annual income between 16 lac to 20 lac: "+tax +" (in rupees)");
        } else if (income<=2400000) {
            tax = (1200000 * 0.00) + ((1600000 - 1200000) * 0.15) + ((2000000 - 1600000) * 0.20) + (income - 2000000) * 0.25;
            System.out.println("25% tax on annual income between 20 lac to 24 lac: " + tax +" (in rupees)");
        } else {
            tax = (1200000 * 0.00) + ((1600000 - 1200000) * 0.15) + ((2000000 - 1600000) * 0.20) + ((2400000-2000000) * 0.25)+(income-2400000)*0.30;
            System.out.println("30% tax on annual income above 24 lac: " + tax +" (in rupees)");
        }
    }
}
