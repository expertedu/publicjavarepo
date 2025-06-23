import java.util.Scanner;
public class elecbillcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units = ");
        float units = sc.nextFloat();
        float bill = 0;
        if (units > 400){
            bill += (units-400)*7;
            units=400;
            // System.out.println("400u");
        } if (units > 250){
            bill += (units-250)*6.25;
            units = 250;
            // System.out.println("250u");
        } if (units > 150){
            bill += (units-150)*4.50;
            units = 150;
            // System.out.println("150u");
        } if (units > 100){
            // System.out.println(units);
            bill += (units-100)*3.25;
            // System.out.println(bill);
            // System.out.println("100u");
        }
        System.out.println("Electricity bill = " +bill);
        sc.close();
    }
}
