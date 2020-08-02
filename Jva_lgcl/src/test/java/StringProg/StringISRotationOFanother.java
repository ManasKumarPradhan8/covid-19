package StringProg;

import java.util.Arrays;

public class StringISRotationOFanother {

	public static void main(String[] args) {
String test="abcd";
String test2="bcadv";
char[]tes=test.toCharArray();
char[]tes2=test2.toCharArray();
Arrays.sort(tes);
Arrays.sort(tes2);
if(Arrays.equals(tes, tes2)){
	System.out.println("two strings are rotatin of each ");
}else{
	System.out.println("Two strings are of different length ");
}
	}

}
