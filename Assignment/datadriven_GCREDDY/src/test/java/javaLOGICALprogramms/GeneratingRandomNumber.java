package javaLOGICALprogramms;

import java.util.Random;

public class GeneratingRandomNumber {
	
	public static void main(String[] args) {
		Random a1=new Random();
		//System.out.println(a1.nextInt());
		for(int i=1;i<=100;i++)
		{
		int num=a1.nextInt(1000);
		System.out.println("random no is"+i+" "+num);
		}

}
}

