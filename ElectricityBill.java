import java.util.Scanner;

public class ElectricityBill{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total units consumed: ");
        int units = scanner.nextInt();

        double billAmount = 0;

        if (units <= 100) {
            billAmount = 0;
        } else if (units <= 150) {
            billAmount = (units - 100) * 3.25;
        } else if (units <= 250) {
            billAmount = (50 * 3.25) + (units - 150) * 4.50;
        } else if (units <= 400) {
            billAmount = (50 * 3.25) + (100 * 4.50) + (units - 250) * 6.35;
        } else {
            billAmount = (50 * 3.25) + (100 * 4.50) + (150 * 6.35) + (units - 400) * 7.00;
        }

        System.out.println("Total Electricity Bill:" + billAmount);
        
    }
}
