package ArrayBased;

public class SecondBiggestElement {

	public static void main(String[] args) {
int []test=new int[]{23,37,98,76,34,21,4};
for(int i=0;i<test.length;i++){
	for(int j=i+1;j<test.length;j++){
		if(test[i]>test[j]){
			int temp=test[i];
			test[i]=test[j];
			test[j]=temp;
		}
	}
}
System.out.println("second biggest element of arraay  "+test[test.length-2]);
	}

}
