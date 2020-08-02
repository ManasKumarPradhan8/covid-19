package Mix;

import java.util.Arrays;
import java.util.Collections;

public class TwoMaxValuesOF_ARRAY {

	public static void main(String[] args) {
int arr[]=new int[]{12,43,65,5,3,54,54,456,21343,54,65,35,6,54,53};
int maxOne=arr[0];
int maxTwo=arr[1];
Arrays.sort(arr);
maxOne=arr[arr.length-1];
maxTwo=arr[arr.length-2];
System.out.println("Biggest Element ina array is "+maxOne);
System.out.println("Second Biggest Element ina array is "+maxTwo);

	}

}
