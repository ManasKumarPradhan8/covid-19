package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 12, 5, 9, 23, 87, 2 };
		System.out.print("All elements are ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		inSertionSort(arr);
		System.out.println("After sortig elements are ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}

	}
	public static void inSertionSort(int arr[]){
		int n=arr.length;
		for(int j=1;j<n;j++){
			int key=arr[j];
			int i=j-1;
			while ( (i > -1) && ( arr [i] > key ) ) {  
                arr[i+1] = arr[i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
    
	}

}
