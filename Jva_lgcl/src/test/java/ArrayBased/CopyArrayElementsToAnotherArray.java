package ArrayBased;

public class CopyArrayElementsToAnotherArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 12, 43, 34, 64, 76, 334, 64, 243, 34 };
		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(temp[j] + " ");
		}
	}

}
// CONTROL+SHIFT+F