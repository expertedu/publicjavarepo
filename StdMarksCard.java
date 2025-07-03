package publicjavarepo;

import java.util.Scanner;
public class StdMarksCard {
	
	Scanner sc=new Scanner(System.in);
	String stdName;
	byte lan1,lan2,lan3,maths,science,social;
	double totalMarks=600;
	
	//method to input marks of student
	public void inputMarks() {
		System.out.print("Enter the student name:");
		//sc.skip("\r\n|\r|\n");
		stdName=sc.nextLine();
		System.out.println("Enter the student marks:");
        System.out.print("Language 1: ");
        lan1 = sc.nextByte();
        System.out.print("Language 2: ");
        lan2 = sc.nextByte();
        System.out.print("Language 3: ");
        lan3 = sc.nextByte();
        System.out.print("Mathematics: ");
        maths = sc.nextByte();
        System.out.print("Science: ");
        science = sc.nextByte();
        System.out.print("Social: ");
        social = sc.nextByte();
	}
	
	//method for calculate total marks obtained by student
    public int calculateTotalMarks() {
        return lan1 + lan2 + lan3 + maths + science + social;
    }

    // method for calculate percentage of student
    public double calculatePercentage() {
        return (calculateTotalMarks() / totalMarks) * 100;
    }
    
    //method to know result based on student percentage
    public String getResult() {
        double percentage = calculatePercentage();
        if (percentage >= 75) {
            return "Distinction";
        } else if (percentage >= 60) {
            return "First Class";
        } else if (percentage >= 50) {
            return "Second Class";
        } else if (percentage >= 35) {
            return "Third Class";
        } else {
            return "Fail";
        }
    }
    
    //method for display results of student
    public void displayResult() {
        int totalObtained = calculateTotalMarks();
        double percentage = calculatePercentage();
        String result = getResult();

        System.out.println("\nTotal Marks Obtained by "+stdName+":"+ totalObtained);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }
    
    public static void main(String[] args) {
		StdMarksCard s1=new StdMarksCard();
		StdMarksCard s2=new StdMarksCard();
		
		s1.inputMarks();
		s2.inputMarks();
		s1.displayResult();
		s2.displayResult();
	}
}
