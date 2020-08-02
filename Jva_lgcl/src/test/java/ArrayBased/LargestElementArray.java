package ArrayBased;

public class LargestElementArray {

	public static void main(String[] args) {
int arr[]=new int[]{12,13,14,15,8,67,9,2,12};
int max=arr[0];
for(int i=0;i<arr.length;i++){
	if(arr[i]>max){
		max=arr[i];
	}
}
System.out.println("Biggest element of Array is "+max);
	}

}
