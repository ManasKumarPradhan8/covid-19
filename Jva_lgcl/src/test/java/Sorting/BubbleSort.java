package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
int[] arr={3,60,35,2,45,320,5};
for(int i=0;i<arr.length;i++){
	System.out.print(arr[i]+"  ");
}
System.out.println("--------------------------------");
Bubblesort(arr);
for(int i=0;i<arr.length;i++){
	System.out.print(arr[i]+"  ");
}
	}
public static void Bubblesort(int qwe[]){
	int len=qwe.length;
	int temp=0;
	for(int i=0;i<len;i++){
		for(int j=1;j<len;j++){
			if(qwe[j-1]>qwe[j]){
				temp=qwe[j-1];
				qwe[j-1]=qwe[j];
				qwe[j]=temp;
			}
		}
	}
}
}
