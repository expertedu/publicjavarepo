import java.util.Scanner;

public class ElectricityBillCalculator
{
 public static void main(String... args)
 {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter the total electricity units consumed: ");
  int units = scanner.nextInt();
  double bill = calculateBill(units);

  System.out.println("Total electricity bill : Rs.  " + bill);
  scanner.close();
 }
  
  public static double calculateBill(int units)
  {
   double bill = 0;

   if (units <= 100) {
       bill = 0;
   }
     else if (units <= 150) {
       bill = (units - 100) * 3.25;
     }
     else if (units <= 250) {
       bill = (50 * 3.25) + (units - 150) * 4.50;
     }
     else if (units <= 400) {
       bill = (50 * 3.25) + (100 * 4.50) + (units - 250) * 6.35;
     }
     else {
       bill = (50 * 3.25) + (100 * 4.50) + (150 * 6.35) + (units - 400) * 7.00;
     }
     return bill;
  }

}

