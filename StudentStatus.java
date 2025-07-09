import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        double marks = scanner.nextDouble();

        // Result logic
        if (marks >= 60) {
            System.out.println("Result: First Class");
        } else if (marks >= 50) {
            System.out.println("Result: Second Class");
        } else if (marks >= 35) {
            System.out.println("Result: Third Class");
        } else {
            System.out.println("Result: Failed");
        }

}}
