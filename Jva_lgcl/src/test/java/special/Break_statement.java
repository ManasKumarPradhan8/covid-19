package special;

public class Break_statement {

	public static void main(String[] args) {
int[]arr={6,4,65,78,8,6,5435};
for(int i=0;i<arr.length-1;i++)
{
	System.out.println(arr[i]);
	if(arr[i]==78)
	{
		break;
	}
	System.out.println("after if else");
}
System.out.println("after for loop");

	}
	

}
