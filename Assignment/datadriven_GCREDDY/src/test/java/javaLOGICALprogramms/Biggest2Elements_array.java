package javaLOGICALprogramms;

public class Biggest2Elements_array {

	public static  void gettwomaxvalues(int[]nums)
	{
		int maxone=0;
		int maxtwo=0;
		for(int p:nums)
		{
			if(maxone<p)
			{
				//maxone=p;
				maxtwo=maxone;
				maxone=p;                                                              
			}
			else if(maxtwo<p)
			{
				maxtwo=p;
			}
		}
		System.out.println("maximum element is"+maxone);
		System.out.println("second maximum element is"+maxtwo);
	}

	public static void main(String[] args) {
		int[]nums={3,67,7,35,132,76,56,32,3,7,3,9};
	Biggest2Elements_array.gettwomaxvalues(nums);

	}

}
