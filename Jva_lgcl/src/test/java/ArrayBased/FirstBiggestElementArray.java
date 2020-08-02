package ArrayBased;

public class FirstBiggestElementArray {

	public static void main(String[] args) {
		int[]arr=new int[]{23,87,90,655,534,234};
		int size=arr.length;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println("biggest element of array "+arr[arr.length-1]);

	}

}
