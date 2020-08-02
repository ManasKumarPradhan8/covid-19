package ArrayBased;

public class SumOfALLElements {

	public static void main(String[] args) {
		int arr[]=new int[]{12,13,14,15,8,67,9,2,12};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println("sum of array is "+sum);
	}

}
