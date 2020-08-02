package logicals;

public class SumOfAALL_digits_array {

	public static void main(String[] args) {
		int arr[]={2,4,45,54,32,46,543};
		int sum=0;
		for(int i=0;i<arr.length-1;i++){
			sum=sum+arr[i];
		}
		System.out.println("sum of array elements are"+sum);

	}

}
