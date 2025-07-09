import java.util.Scanner;

public class SytemExitDemo {

	public static void main(String[] args) {
	/*	  int[] numbers = {3, 5, 7, 9, 11};

	        for (int num : numbers) {
	            if (num == 7) {
	                System.out.println("Found number 7, program.");
	                System.exit(0);  // Normal exit
	            }
	            System.out.println("Checking for 7 number is: " + num);
	        }
             
	        //this will never execute
	        System.out.println("This line will not execute.");
	   */     
	        
	        //(2)example
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();

	        if (age < 0 || age > 120) {
	            System.out.println("Invalid age entered. Exiting program.");
	            System.exit(1);            // Non-zero status indicates abnormal termination
	        }
           
	        //age if enter invalid age this statement will not execute ever 
	        System.out.println("Your age is: " + age);
	}

}

