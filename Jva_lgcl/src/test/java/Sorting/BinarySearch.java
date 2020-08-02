package Sorting;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 30;
		int first = 0;
		int last = arr.length - 1;
	int c=binarySearch(arr, first, last, key);
	if (c == -1)  
        System.out.println("Element is not found!");  
    else  
        System.out.println("Element is found at index: "+c);  
}
	

	public static int binarySearch(int arr2[], int firstt, int lastt, int keyy) {
		int mid = 0;
		if (lastt >= firstt) {
			mid = firstt + (lastt - firstt) / 2;
			if(arr2[mid] == keyy){
				return mid;
		}
		if (arr2[mid] > keyy) {
			return binarySearch(arr2, firstt, mid - 1, keyy);// search in left
																// subarray
		} else {
			return binarySearch(arr2, mid + 1, lastt, keyy);// search in right
		}													// subarray
		}
		return -1;
		
	}

}
