package ArrayBased;

import java.util.Arrays;

public class ThirdBiggestElementArray {

	public static void main(String[] args) {
int arr[]={10,15,5,8,9,54,23,2,21};
int p=arr.length;

Arrays.sort(arr);
for(int i=0;i<p;i++){
	System.out.print(+arr[i]+"  ");
}
int thirdMAX=arr[p-3];
System.out.println("Third biggest number is "+thirdMAX);
}
	}


