package logicals2;

import java.util.Scanner;

public class PrimeNum2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter your Number");
		int num = scn.nextInt();
		int ctr = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				// System.out.println("Number is NOT PRIME");
				ctr++;
			}
		}
		if (ctr == 0) {
			System.out.println("Number Is Prime");
		} else {
			System.out.println("Number Is Not Prime");
		}
	}

}
