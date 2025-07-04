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
            tax = (income - 500000) * (10/100.00);
        } else if (income <= 1000000) {
            tax = (250000 * (10/100.00)) + (income - 750000) * (15/100.00);
        } else if (income <= 1500000) {
            tax = (250000 * (10/100.00)) + (250000 * (15/100.00)) + (income - 1000000) * (20/100.00);
        } else {
            tax = (250000 * (10/100.00)) + (250000 * (15/100.00)) + (500000 * (20/100.00)) + (income - 1500000) * (30/100.00);
        }

        System.out.println("Total Income Tax Payable:" + tax);
       
    }
}
