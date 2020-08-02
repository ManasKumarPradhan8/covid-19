package logicals;

public class ReverseString2 {

	public static void main(String[] args) {
		String test="i know i can do anything in the world";
		String rev="";
		for(int i=test.length()-1;i>=0;i--)
		{
			rev=rev+test.charAt(i);
		}
		System.out.println("reverse string is      "+rev);

	}

}
