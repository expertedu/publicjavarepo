import java.util.Scanner;
public class taxcal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income = ");
        float income= sc.nextFloat();
        float tax = 0;

        if (income > 1500000){
            tax += (income - 1500000)*0.30f;
            income = 1500000;
            // System.out.println("30 = "+tax);
        }
        if (income > 1000000){
            tax += (income - 1000000)*0.20f;
            income = 1000000;
            // System.out.println("20 = "+tax);
        }
        if (income > 750000){
            tax += (income - 750000)*0.15f;
            income = 750000;
            // System.out.println("15 = "+tax);
        }
        if (income > 500000){
            // System.out.println(tax);
            // System.out.println(income);
            tax += (income - 500000)*0.10f;
            income = 500000;
            // System.out.println("10 = "+tax);
        }
        // if(num <= 500000){
        //     tax = 0;
        //     // float num1= (num*0)/100;
        //     // System.out.println("Tax Amount = "+num1);
        // } else if(num >= 500000 && num <= 750000){
        //     tax = num*0.10f;
        //     // float num2=(num*10)/100;
        //     // System.out.println("Tax Amount = "+num2);
        // } else if (num >= 750000 && num <=1000000 ){
        //     tax = num*0.15f;
        //     // float num3=(num*15)/100;
        //     // System.out.println("Tax Amount = "+num3);
        // } else if (num >=1000000 && num <= 1500000){
        //     tax = num*0.20f;
        //     // float num4 = (num*20)/100;
        //     // System.out.println("Tax Amount = "+num4);
        // } else if (num >=1500000){
        //     tax = num*0.30f;
        //     // float num5 = (num*30)/100;
        //     // System.out.println("Tax Amount = "+num5);
        // }
        System.out.println("Tax to pay = "+ tax);
        sc.close();
    }
}