package logicals;

public class ArraySorting {

	public static void main(String[] args) {
	int[]num={43,56,87,21,532,42,6,54,35};
	int count=num.length;
	for (int i = 0; i < count; i++) 
    {
        for (int j = i + 1; j < count; j++) { 
            if (num[i] > num[j]) 
            {
               int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
    }
    System.out.print("Array Elements in dscending Order: ");
   // for (int i =count-1; i >=0 ; i--) //desending
    	for (int i=0;i<count;i++)//ascending
    {
        System.out.print(num[i] + ", ");
    }
  //  System.out.print(num[count - 1]);
   /* 	int num2[]={12,67,2,98,8767,8,11,23,2,76,5};
    	int arrsize=num2.length;
    	for(int i=0;i<arrsize;i++){
    		for(int j=i+1;j<arrsize;j++){
    			if(num2[i]>num2[j]){
    				int temp=num2[i];
    				num2[i]=num2[j];
    				num2[j]=temp;
    				//System.out.println("after sorting the elements are "+num2[i]+",");
    			}
    			
    		}
    		System.out.println("after sorting the array is");
    		for(int p=0;i<arrsize;p++){
    			System.out.print(num2[i]);
    		}*/
    	}
}
