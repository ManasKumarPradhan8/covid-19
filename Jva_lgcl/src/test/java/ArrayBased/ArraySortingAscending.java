package ArrayBased;

import java.util.Arrays;

public class ArraySortingAscending {

	public static void main(String[] args) {
int[]arr={5,2,9,87,57,4};
for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<arr.length;j++){//using 3rd variable
		if(arr[i]>arr[j]){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}



for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]+" ");
}
	}

}
