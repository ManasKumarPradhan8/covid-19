package logicals2;

public class TwoBiggestElementArray {

	public static void main(String[] args) {
int arr[]={12,56,89,5,65,97,980,544,11,543,90,11,678};
int firstmax=arr[0];
int secmax=arr[0];
for(int i=1;i<arr.length;i++){
	if(arr[i]>firstmax){
		firstmax=arr[i];
	}else{
		secmax=arr[i];
	}
}
System.out.println("firstbiggest number is "+firstmax+" second biggest is  "+secmax);
	}

}
