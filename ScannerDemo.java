import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // interger Using nextInt()
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        //withoiut sc.nextLine() it will works fine
        //sc.nextLine();

        //string  Using next()
        System.out.print("Enter your first name: ");
        String firstName = sc.next();

        // sc.nextLine()is not given then nextLine() may just read the leftover newline and return an empty string.
        //sc.nextLine();

        // string Using nextLine()
        
        System.out.print("Enter your full address: ");
        sc.skip("\r\n|\r|\n");
        String address = sc.nextLine();

       
        System.out.println("Collected Info");
        System.out.println("Age: " + age);
        System.out.println("First Name: " + firstName);
        System.out.println("Full Address: " + address);

       
    }
}

