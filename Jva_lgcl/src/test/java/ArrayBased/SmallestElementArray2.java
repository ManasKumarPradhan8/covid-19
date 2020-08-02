package ArrayBased;

public class SmallestElementArray2 {

	public static void main(String[] args) {
int arr[]=new int[]{12,13,14,15,8,67,9,2,12};
int min=arr[0];
for(int i=0;i<arr.length;i++){
	if(arr[i]<min){
		min=arr[i];
	}
}
System.out.println("Biggest element of Array is "+min);
	}

}
