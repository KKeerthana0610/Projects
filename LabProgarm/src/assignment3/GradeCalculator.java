package assignment3;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter marks for five subjects (out of 100):");

	        int totalMarks = 0;
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Enter marks for subject " + i + ": ");
	            int marks = scanner.nextInt();

	            // Adding each subject's marks to the total
	            totalMarks += marks;
	        }

	        // Calculating average marks
	        double averageMarks = totalMarks / 5.0;

	        // Assigning grades based on average marks
	        String grade;
	        if (averageMarks > 90) {
	            grade = "Ex";
	        } else if (averageMarks > 80) {
	            grade = "A";
	        } else if (averageMarks > 60) {
	            grade = "B";
	        } else if (averageMarks >= 40) {
	            grade = "C";
	        } else {
	            grade = "F";
	        }

	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Marks: " + averageMarks);
	        System.out.println("Grade: " + grade);

	        scanner.close();

	}

}
