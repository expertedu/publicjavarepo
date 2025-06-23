import java.util.*;

class EmployeeInfo{
        public static void main(String... args){
                Scanner sc=new Scanner(System.in);
                String empName,empCompany,empDesignation;
                double empSalary;
                System.out.print("Enter employee name:");
                empName=sc.nextLine();
                System.out.print("Enter Employee company name:");
                empCompany=sc.nextLine();
                System.out.println("Enter employee designation in type of character shown here below ");
                System.out.println("M-Manager "+"P-Project manager "+"T-Team lead "+"S-Senior Developer "+"J-Junior Developer ");
                System.out.print("Enter Employee Designation:");
                empDesignation=sc.nextLine();
                System.out.print("Enter Employee monthly salary (Rupees):");
                empSalary=sc.nextDouble();
                System.out.print("Enter the percentage of basic salary (e.g., 40 for 40%):");
                double percentage=sc.nextDouble();
		double basicSalary = (percentage / 100) * empSalary;

                System.out.println("\n===== Employee Details =====");
                System.out.println("Name         : " + empName);
                System.out.println("Company      : " + empCompany);
                System.out.println("Designation  : " + empDesignation);
                System.out.println("Monthly Salary: ₹" + empSalary);
                System.out.println("Basic Salary  : ₹" + basicSalary);

                sc.close();
        }
}
