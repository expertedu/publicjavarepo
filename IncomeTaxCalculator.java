import java.util.Scanner;

public class IncomeTaxCalculator 
{
	public static void main (String ... args)

	{
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter Your Annual Salary in Rupees: ");

		double income = sc.nextDouble();

		double tax= 0;

		if (income <= 500000)
		{
			tax=0;

			System.out.print("Total tax as per your annual salary "+income +" is : "+ tax);

		}else if ( income > 500000 && income <= 750000){

			tax = (income - 500000) * 0.10;

			System.out.print("Total tax as per your annual salary "+income +" is : "+ tax);

		}else if (income >750000 && income <= 1000000){

			tax = (250000 * 0.10 ) + ( income - 750000) * 0.15 ;

		        System.out.print("Total tax as per your annual salary "+income +" is : "+ tax);
		
		}else if (income > 1000000 && income <= 1500000){

			tax = (250000 * 0.10 ) + ( 250000 * 0.15 ) + (income - 1000000) * 0.20 ;

			System.out.print("Total tax as per your annual salary "+income +" is : "+ tax);

		}else {
			
			tax = (250000 *0.10 ) + ( 250000 * 0.15 ) + (500000 * 0.20 ) + ( income - 1500000) * 0.30 ;

			System.out.print("Total tax as per your annual Salary "+income +" is : "+ tax); }

	}

}



				


