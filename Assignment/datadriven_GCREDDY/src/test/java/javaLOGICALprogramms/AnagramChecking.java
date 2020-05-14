package javaLOGICALprogramms;

import java.util.Arrays;

public class AnagramChecking {

	public static void isANAGRAM(String str1,String str2)
	{
		boolean status1=false;
	String one=str1.replaceAll("\\s", "");
	String two=str2.replaceAll("\\s", "");
	if(one.length()!=two.length())
	{
		System.out.println("two strings are of different length");
	}
	else
	{
		char[] array1=one.toLowerCase().toCharArray();
		char[] array2=two.toLowerCase().toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		status1=Arrays.equals(array1, array2);
	}
	if(status1)
	{
		System.out.println("two strings are anagram");
	}
	else
	{
		System.out.println("two strings are not anagram");
	}

	}	


	public static void main(String[] args) {
	
AnagramChecking.isANAGRAM("MANAS is a goboy","good boy is a manas");
	}

}
