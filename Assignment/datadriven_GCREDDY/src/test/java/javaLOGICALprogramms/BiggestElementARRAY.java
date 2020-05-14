package javaLOGICALprogramms;

public class BiggestElementARRAY {

	public static void main(String[] args) {
		int intArr[] = {10,20,15,22,35}; 
		int max=intArr[0];
		  int len=intArr.length;
		  for(int i=1;i<len;i++)
		  {
			if(intArr[i]>max)
			{
				max=intArr[i];
			}
		  }
		  System.out.println("Biggest element of array is   "+max);
 


	}

}
