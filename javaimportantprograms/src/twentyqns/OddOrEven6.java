package twentyqns;

import java.util.Scanner;

public class OddOrEven6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ac = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = ac.nextInt();
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}

	}

}
