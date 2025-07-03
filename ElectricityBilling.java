package publicjavarepo;

import java.util.*;
public class ElectricityBilling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double unitsConsumed,defaultCharges=200,bill;
        System.out.print("Enter the units consumed: ");
        unitsConsumed=sc.nextDouble();
        if(unitsConsumed<=100){
            System.out.print("Minimum bill: "+defaultCharges);
        } else if (unitsConsumed>100 && unitsConsumed<=150) {
            bill=defaultCharges+(unitsConsumed-100)*3.50;
            System.out.print("Total bill: "+bill);
        }else if (unitsConsumed>150 && unitsConsumed<=200) {
            bill=defaultCharges+(150-100)*3.50+(unitsConsumed-150)*4.50;
            System.out.print("Total bill: "+bill);
        }else if (unitsConsumed>200 && unitsConsumed<=250) {
            bill=defaultCharges+(150-100)*3.50+(200-150)*4.50+(unitsConsumed-200)*6.5;
            System.out.print("Total bill: "+bill);
        }else {
            bill=defaultCharges+(150-100)*3.50+(200-150)*4.50+(250-200)*6.5+(unitsConsumed-250)*8.00;
            System.out.print("Total bill: "+bill);
        }
    }
}
