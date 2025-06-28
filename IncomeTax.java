import java.util.Scanner;

public class IncomeTax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();
        double tax = 0;

        if (income <= 500000) {
            tax = 0;
        } else if (income <= 750000) {
            tax = (income - 500000) * 0.10;
        } else if (income <= 1000000) {
            tax = (250000 * 0.10) + (income - 750000) * 0.15;
        } else if (income <= 1500000) {
            tax = (250000 * 0.10) + (250000 * 0.15) + (income - 1000000) * 0.20;
        } else {
            tax = (250000 * 0.10) + (250000 * 0.15) + (500000 * 0.20) + (income - 1500000) * 0.30;
        }

        System.out.println("Total Income Tax Payable:" + tax);
       
    }
}
