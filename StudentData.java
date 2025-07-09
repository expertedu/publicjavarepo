import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // student details
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.skip("\r\n|\r|\n");
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        // marks for three subjects
        System.out.print("Enter marks for Subject 1: ");
        float mark1 = sc.nextFloat();

        System.out.print("Enter marks for Subject 2: ");
        float mark2 = sc.nextFloat();

        System.out.print("Enter marks for Subject 3: ");
        float mark3 = sc.nextFloat();

        // percentage
        float total = mark1 + mark2 + mark3;
        float percentage = total / 3;

        // student data
        System.out.println("Student Details ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");

        
    }
}

