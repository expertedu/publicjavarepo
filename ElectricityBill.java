import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double DEFAULT_CHARGES = 200.0; 
        double unitsConsumed, totalBill;

        System.out.print("Enter the units consumed: ");
        unitsConsumed = scanner.nextDouble();

        if (unitsConsumed <= 100) {
            totalBill = DEFAULT_CHARGES;
        } else if (unitsConsumed <= 150) {
            totalBill = DEFAULT_CHARGES + (unitsConsumed - 100) * 3.50;
        } else if (unitsConsumed <= 200) {
            totalBill = DEFAULT_CHARGES 
                        + (50 * 3.50) 
                        + (unitsConsumed - 150) * 4.50;
        } else if (unitsConsumed <= 250) {
            totalBill = DEFAULT_CHARGES 
                        + (50 * 3.50) 
                        + (50 * 4.50) 
                        + (unitsConsumed - 200) * 6.50;
        } else {
            totalBill = DEFAULT_CHARGES 
                        + (50 * 3.50) 
                        + (50 * 4.50) 
                        + (50 * 6.50) 
                        + (unitsConsumed - 250) * 8.00;
        }

        System.out.println("========== Electricity Bill ==========");
        System.out.println("Units Consumed : " + unitsConsumed);
        System.out.printf("Total Bill Amount: ₹%.2f\n", totalBill);
        
        scanner.close();
    }
}

