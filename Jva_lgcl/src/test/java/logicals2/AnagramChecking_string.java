package logicals2;

import java.util.Arrays;

public class AnagramChecking_string {

	public static void main(String[] args) {
String one="where are youe";
String two="are you where";
one.replaceAll(" ", "");
two.replaceAll(" ", "");
char[]arr=one.toCharArray();
char[]arr2=two.toCharArray();
Arrays.sort(arr);
Arrays.sort(arr2);
if(one.length()!=two.length()){
	System.out.println("TWO STRINGS ARE OF DIFFERENT LENGTH");
}
else if(arr.equals(arr)){
	System.out.println("ANAGRAM");
}else{
	System.out.println("not anagram");
}
	}

}
