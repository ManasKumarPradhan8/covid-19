package ArrayBased;

public class LeftRotationOfArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 14, 82, 23, 41, 15 };
		int mark = 23;
		int arr_length=arr.length;
		System.out.println("All Elements of Array are  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for (int i = 0; i < mark; i++) {
			int j, first;
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;

		}
		System.out.println();
		System.out.println("ELEMENTS AFTER LEFT-SHIFTING");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
