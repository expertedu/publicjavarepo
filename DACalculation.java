import java.util.Scanner;

public class DACalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double salary = scanner.nextDouble();

        double da = 0;

        if (salary <= 25000) {
            da = salary * 0.10;
            if (da < 2500) {
                da = 2500;
            }
        } else if (salary <= 50000) {
            da = salary * 0.20;
            if (da > 7500) {
                da = 7500;
            }
        } else {
            da = salary * 0.30;
            if (da > 12000) {
                da = 12000; 
            }
        }

        System.out.println("Dearness Allowance :" + da);
       
    }
}
