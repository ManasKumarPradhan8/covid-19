package logicals2;

import java.util.Scanner;

public class PowerOFnumber {

	public static void main(String[] args) {
		int sum=0;
		int res=0;

System.out.println("enter your number");
Scanner scn=new Scanner(System.in);
int num=scn.nextInt();
System.out.println("Enter the power");
int power=scn.nextInt();
if(power==2){
	sum=sum+(num*num);
	res=sum;
	sum=0;
}
else if(power==3){
	sum=sum+(num*num*num);
	res=sum;
	sum=0;
}
else if(power==4){
	sum=sum+(num*num*num*num);
	res=sum;
	sum=0;

	}
else if(power==5){
	sum=sum+(num*num*num*num*num);
	res=sum;sum=0;

}
System.out.println("RESULT IS  "+res);}
}
