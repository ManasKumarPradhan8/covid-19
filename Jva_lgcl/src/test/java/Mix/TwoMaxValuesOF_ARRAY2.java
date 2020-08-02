package Mix;

import java.util.Arrays;
import java.util.Collections;

public class TwoMaxValuesOF_ARRAY2 {

	public static void main(String[] args) {
int arr[]=new int[]{12,43,65,5,3,54,54,456,21343,54,65,35,6,54,53};
int maxOne=arr[0];
int maxTwo=arr[1];
for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<arr.length;j++){
		if(arr[i]>arr[j]){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	
}
maxOne=arr[arr.length-1];
maxTwo=arr[arr.length-2];
System.out.println("Biggest Element ina array is "+maxOne);
System.out.println("Second Biggest Element ina array is "+maxTwo);

	}

}
