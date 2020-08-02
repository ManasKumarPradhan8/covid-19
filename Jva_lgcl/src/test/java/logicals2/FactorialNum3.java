package logicals2;

import java.util.Scanner;

public class FactorialNum3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your number ");
		int num=scn.nextInt();
		int fact=1;
for(int i=1;i<=num;i++){
	fact=fact*i;
}
System.out.println("factorial of number is "+fact);
	}

}
