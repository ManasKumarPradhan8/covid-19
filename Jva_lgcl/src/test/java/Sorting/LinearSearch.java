package Sorting;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = { 23, 21, 4, 76, 5, 32, 76, 43 };
		int key = 76;
		int res=linearSearch(arr,key);
		System.out.println(key +" is  found in "+res+" location");
		}
	public static int linearSearch(int arr2[],int keyy){
		for(int i=0;i<arr2.length;i++){
			if(arr2[i]==keyy){
			return i;	
			}
			}
		return -1;
		}
	}

	

