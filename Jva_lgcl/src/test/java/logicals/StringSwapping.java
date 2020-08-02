package logicals;

public class StringSwapping {

	public static void main(String[] args) {
		String first="manas";
		String second="kumar";
		System.out.println("first string is "+first+"    second string is "+second);

	   first=first+second;//MANASKUMAR
	   System.out.println(first);
	//second=first.substring(0,5);
	second=first.substring(0,first.length()-second.length());
	//first=first.substring(5);
	first=first.substring(5);

	System.out.println("first string is "+first+"        second string is "+second);

	}

}
