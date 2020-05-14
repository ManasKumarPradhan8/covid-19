package projects.naukri;

public class Ques2 {
	public static void stringShifting(String data,int leftshift,int rightshift)
	{
		char[]arr=data.toCharArray();
		
		//For LeftShift
		for(int k=0;k<leftshift;k++){
		for(int i=0;i<arr.length;i++)
		{
			int j;
			char first;
			
			first=arr[0];
			for(j=0;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println();
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		
		//For RightShift
		
		for(int k=0;k<leftshift;k++){
			for(int i=0;i<arr.length;i++)
			{
				int j;
				char first;
				
				first=arr[0];
				for(j=0;j<arr.length-1;j++){
					arr[j]=arr[j+1];
				}
				arr[j]=first;
			}
			System.out.println();
			}
			for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]+" ");
			}
		
		
	}

	public static void main(String[] args) {
		
		Ques2 q=new Ques2();
		q.stringShifting("abcdefg", 2, 4);
	}

}
