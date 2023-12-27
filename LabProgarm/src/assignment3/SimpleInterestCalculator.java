package assignment3;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time in years (T): ");
        double time = scanner.nextDouble();

        double rate;

        if (principal > 10000) {
            rate = 0.1; // 10% interest rate
        } else if (principal <= 10000 && principal >= 5000) {
            rate = 0.08; // 8% interest rate
        } else {
            rate = 0.05; // 5% interest rate
        }

        double simpleInterest = (principal * rate * time);

        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();

	}

}
