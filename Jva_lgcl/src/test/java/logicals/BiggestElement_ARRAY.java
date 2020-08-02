package logicals;

public class BiggestElement_ARRAY {

	public static void main(String[] args) {
		int array[]={23,65,7,2,54,87,9887,65,98,124,654,68,67543};
		int length=array.length;
		int big=array[0];
		for(int i=1;i<length;i++)
		{
			if(array[i]>big)
			{
				big=array[i];
				
			}
		
		}
		System.out.println("biggest element of array is    "+big);

	}

}
