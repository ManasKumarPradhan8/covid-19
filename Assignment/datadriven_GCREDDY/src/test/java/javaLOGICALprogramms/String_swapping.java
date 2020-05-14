package javaLOGICALprogramms;

public class String_swapping {

	public static void main(String[] args) {
		String one="manas";
		String two="kumar";
		System.out.println("before swapping values are"+one+" "+two);
		one=one+two;
		two=one.substring(0,one.length()-two.length());
		System.out.println(two.length());
		one=one.substring(two.length());//manaskumar
		System.out.println("after swapping values are"+one+" "+two);


	}

}
