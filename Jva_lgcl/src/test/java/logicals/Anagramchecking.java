package logicals;

import java.util.Arrays;

public class Anagramchecking {
public int w;
	public static void main(String[] args) {
		String first = "manas kumar";
		String second = "kumar manas";
		boolean res=false;
		if (first.length() != second.length()) {
			System.err.println("two strings is of different length");
		} else {
			String f = first.replaceAll(" ", "");
			String s = second.replaceAll(" ", "");
			System.out.println(f);
			System.out.println(s);
			char[] x = f.toLowerCase().toCharArray();
			char[] y = s.toLowerCase().toCharArray();
			Arrays.sort(x);
			Arrays.sort(y);

			 res = Arrays.equals(x, y);
		}
		if (res) {
			System.out.println("two strings are anagram");
		} else {
			System.out.println("not equal");

		}
	}

}