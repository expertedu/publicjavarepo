import java.util.Scanner;

public class StudentReportCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int SUBJECT_COUNT = 6; 
        final double MAX_TOTAL_MARKS = 600.0; 
        
        byte language1, language2, language3, mathematics, science, socialStudies;

        System.out.println("===== Student Marks Entry =====");
        
        System.out.print("Enter marks for Language 1: ");
        language1 = scanner.nextByte();
        
        System.out.print("Enter marks for Language 2: ");
        language2 = scanner.nextByte();
        
        System.out.print("Enter marks for Language 3: ");
        language3 = scanner.nextByte();
        
        System.out.print("Enter marks for Mathematics: ");
        mathematics = scanner.nextByte();
        
        System.out.print("Enter marks for Science: ");
        science = scanner.nextByte();
        
        System.out.print("Enter marks for Social Studies: ");
        socialStudies = scanner.nextByte();
      
        int totalMarksObtained = language1 + language2 + language3 + mathematics + science + socialStudies;
   
        double percentage = (totalMarksObtained / MAX_TOTAL_MARKS) * 100;
       
        System.out.println("\n===== Student Marks Summary =====");
        System.out.println("Total Marks Obtained: " + totalMarksObtained + " / " + (int)MAX_TOTAL_MARKS);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        
        String result;
        if (percentage >= 75) {
            result = "Distinction";
        } else if (percentage >= 60) {
            result = "First Class";
        } else if (percentage >= 50) {
            result = "Second Class";
        } else if (percentage >= 35) {
            result = "Third Class";
        } else {
            result = "Fail";
        }
        
        System.out.println("Result: " + result);
        
        scanner.close(); 
    }
}

