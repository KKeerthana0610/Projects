package twentyqns;

import java.util.Scanner;

public class Primenum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = tc.nextInt();
		int f = 0;
		for(int i = 1; i<=n; i++) {
			if(n%i==0) {
				f++;
			}
		}
		
		if(f==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}

	}

}
