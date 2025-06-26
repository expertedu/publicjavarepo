package publicjavarepo;

import java.util.*;
class StudentInfoProgram{
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		int rollNum,s1,s2,s3;
		String studentName;
		int totalMarks=300;
		double marksObtained,percentage;
		System.out.print("Enter the Student Name:");
		studentName=sc.nextLine();
		System.out.print("Enter the Student Roll Number:");
                rollNum=sc.nextInt();
		System.out.println("Enter the marks of all subject:");
		System.out.print("Subject s1 mark:");
		s1=sc.nextInt();
		System.out.print("Subject s2 mark:");
		s2=sc.nextInt();
		System.out.print("Subject s3 mark:");
		s3=sc.nextInt();
		marksObtained=s1+s2+s3;
		percentage=(marksObtained/totalMarks)*100;
		System.out.print("Total marks obtained by student: "+marksObtained);
		System.out.println();
		System.out.print("Percentage of student:"+percentage);

	}
}

