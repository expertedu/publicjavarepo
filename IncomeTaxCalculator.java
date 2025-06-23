import java.util.Scanner;

public class IncomeTaxCalculator
{
 public static void main(String... args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your annual salary (in Rs. ): " );
    double salary = scanner.nextDouble();
    double tax = calculateTax(salary);

    System.out.println("Total income tax payable: Rs. " + tax);
    scanner.close();
  }
    public static double calculateTax(double salary)
    {
     double tax = 0;

     if (salary <= 5_00_000){
	 tax = 0;
     }
	else if (salary <=7_50_000){
	 tax = (salary - 5_00_000) * 0.10;
	}
	else if (salary <=10_00_000){
         tax = (2_50_000 * 0.10) + (salary - 7_50_000) * 0.15;
	}
	else if (salary <=15_00_000){
         tax = (2_50_000 * 0.10) + (2_50_000 * 0.15) + (salary - 10_00_000) * 0.20;
	}
	else {
	 tax = (2_50_000 * 0.10) + (2_50_000 * 0.15) + (5_00_000 * 0.20) + (salary - 15_00_000) * 0.30;
	}

	return tax;
    }
}

