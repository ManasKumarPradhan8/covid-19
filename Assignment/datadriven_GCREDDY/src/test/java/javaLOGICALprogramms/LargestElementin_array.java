package javaLOGICALprogramms;

import java.util.Arrays;

public class LargestElementin_array {

	public static void main(String[] args) {

		int arr[] = { 10, -20,-30,-40, 30, 40, 87766656, 503333,76455 };
		int maximum_NO =arr[0];
		int minimum_NO =arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			if(minimum_NO>arr[i]){
				minimum_NO=arr[i];
			}
			if(maximum_NO<arr[i]){
				maximum_NO=arr[i];
			}
		}
		System.out.println("ALL ELEMENTS OF ARRAY IS" + Arrays.toString(arr));
		System.out.println("BIGGEST ELEMENT OF ARRAYIS==" + maximum_NO);
		System.out.println("SMALLESTN ELEMENT OF ARRAYIS==" + minimum_NO);

	}
}
