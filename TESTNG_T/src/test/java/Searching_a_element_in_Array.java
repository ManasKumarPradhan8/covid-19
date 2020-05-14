import java.util.Scanner;

public class Searching_a_element_in_Array {


		public static void main(String[] args) {
			
			boolean found=false;
			int arr[]=new int[5];
			Scanner S=new Scanner(System.in);
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("enter elements to the array");
				arr[i]=S.nextInt();
				
			}
			System.out.println("display elements of array");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("elements of array are"+arr[i]+" at index "+i);
		
			}
			System.out.println("enter the number you want to search");
			int p=S.nextInt();
			for(int i=0;i<arr.length;i++)
			{
				if(p==arr[i])
				{
					found=true;
					break;
				}
				
			}
			if(found)
			{
				System.out.println("element found");
			}
			else
				System.out.println("not found");

		}

	}

