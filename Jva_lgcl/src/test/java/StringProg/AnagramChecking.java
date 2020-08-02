package StringProg;

import java.util.Arrays;

public class AnagramChecking {

	public static void main(String[] args) {
String test="hey i know  you";
String test2="Hey know you I ";
String upd1=test.replaceAll( " ","").toLowerCase();
String upd2=test2.replaceAll(" ", "").toLowerCase();
//test.toLowerCase();
//test2.toLowerCase();
char[]arr=upd1.toCharArray();

char[]arr2=upd2.toCharArray();
int p=arr.length;
int q=arr2.length;
System.out.println(p+" "+q );
Arrays.sort(arr);
Arrays.sort(arr2);
if(Arrays.equals(arr, arr2)){
	System.out.println("Two arrays are equal");
}else{
	System.out.println("Two arrays are not EQUAL");
}
	}

}
