package publicjavarepo;

import java.util.*;
public class StudentMarksCard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte l1,l2,l3,maths,science,social;
        double totalMarks=600;
        System.out.println("Enter the student marks");
        System.out.print("Language 1: ");
        l1=sc.nextByte();
        System.out.print("Language 2: ");
        l2=sc.nextByte();
        System.out.print("Language 3: ");
        l3=sc.nextByte();
        System.out.print("Mathematics: ");
        maths=sc.nextByte();
        System.out.print("Science: ");
        science=sc.nextByte();
        System.out.print("Social: ");
        social=sc.nextByte();
        int totalMarksObtained=l1+l2+l3+maths+science+social;
        System.out.print("Total marks in all subjects: "+totalMarksObtained);
        System.out.println();
        double percentage;
        percentage=(totalMarksObtained/totalMarks)*100;
        System.out.println("Marks in percentage: "+percentage);
        if(percentage>=75){
            System.out.println("Result is Distinction");
        } else if (percentage<75 && percentage>=60) {
            System.out.println("Result is First Class");
        } else if (percentage<60 && percentage>=50) {
            System.out.println("Result is Second Class");
        } else if (percentage<50 && percentage>=35) {
            System.out.println("Result is Third Class");
        } else {
            System.out.println("Result is Fail");
        }
    }
}
