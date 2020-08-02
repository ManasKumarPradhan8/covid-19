package ArrayBased;

public class FirstBiggestElementArray2 {

	public static void main(String[] args) {
		int[]arr=new int[]{23,87,90,655,534,234};
		int big=arr[0];
		int size=arr.length;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>big){
				big=arr[i];
			}
			}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println("biggest element of array   "+big);

	}

}
