import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // employee details
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Salary Calculations
        double hra = 0.20 * basicSalary;  
        double da = 0.10 * basicSalary;   
        double pf = 0.08 * basicSalary; 

        double grossSalary = basicSalary + hra + da;
        double netSalary = grossSalary - pf;

       
        System.out.println("Employee Salary Details");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary:" +basicSalary);
        System.out.println("HRA " +hra);
        System.out.println("DA" +da);
        System.out.println("PF " +pf);
        System.out.println("Gross Salary:" +grossSalary);
        System.out.println("Net Salary:" +netSalary);

        
    }
}

