package ArrayBased;

import java.util.Arrays;

public class ArraySortingDescending2 {

	public static void main(String[] args) {
		int[]arr={12,32,2,54,8,4,67,43};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]>arr[i]){
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("After sorting in DESCENDING ORDER");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}

}
