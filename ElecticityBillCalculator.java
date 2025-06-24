import java.util.*;

public class ElecticityBillCalculator
{


	public static void main (String ... args)
	{

		Scanner sc= new Scanner(System.in);

	        System.out.print("Enter number of units consumed : ");

		double units = sc.nextDouble();

		double bill =0 ;

		if (units <=10 ){
			
			bill= 0;

			System.out.print (" Electricity bill for " + units + "consumed is : " + bill );
		}
		else if ( units <=50 ){
			
			bill = (units - 10 )* 3.25 ;

			System.out.print (" Electricity bill for " + units + "consumed is : " + bill );
		}
		else if ( units <= 100){

			bill = (50 -10) *3.25 + (units -50 )* 4.50 ;

			System.out.print (" Electricity bill for " + units + "consumed is : " + bill );

		}
		else if ( units <= 150 ) {

			bill =(50 -10) *3.25 + (100-50)*4.50 +(units -100) *6.35 ;

			System.out.print (" Electricity bill for " + units + "consumed is : " + bill );

		}
		else  {


			 bill =(50 -10) *3.25 + (100-50)*4.50 +(units -100) *6.35 + (units -150 )* 7;


			 System.out.print (" Electricity bill for " + units + "consumed is : " + bill );}
	}
}









		        





