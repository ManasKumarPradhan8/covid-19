package logicals2;

public class NumSwapingWithout3rdVR2 {

	public static void main(String[] args) {
	int num1=10;
	int num2=20;
	System.out.println("Before swapping values are "+num1+" "+num2);

	int sum=num1+num2;
	num2=sum-num2;
	System.out.println(num2);
	num1=sum-num2;
	System.out.println("After swapping values are "+num1+" "+num2);
	

	}

}
