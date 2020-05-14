package javaLOGICALprogramms;

public class SortingARRAY {//WRONG LOGIC

	public static void main(String[] args) {
		int[] test={56,23,4,6,87,4,78,5};
int size=test.length;
for(int i=0;i<size-1;i++)
{
	for(int j=i+1;j<size-1;j++)
	{
		if (test[i]>test[j])
		{
			int temp=test[i];
			test[i]=test[j];
			test[j]=temp;
		}
		System.out.print(test[j]+" ");

	}
	
}
//System.out.print(test[i]);

	}

}
