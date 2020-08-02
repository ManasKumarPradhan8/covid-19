package special;

public class Array_multidimensonal3 {

	public static void main(String[] args) {
		int[][]arr=new int[5][6];
		int big=0;
		int col=0;
arr[0][0]=534;
arr[0][1]=54;
arr[0][2]=53;
arr[0][3]=533;
arr[0][4]=556;
arr[0][5]=554;




arr[1][0]=5;
arr[1][1]=589;
arr[1][2]=57;
arr[1][3]=55;
arr[1][4]=567;
arr[1][5]=58;



arr[2][0]=545;
arr[2][1]=675;
arr[2][2]=67675;
arr[2][3]=545;
arr[2][4]=555;
arr[2][5]=335;


arr[3][0]=534;
arr[3][1]=54444;
arr[3][2]=547;
arr[3][3]=578;
arr[3][4]=580;
arr[3][5]=598;



arr[4][0]=5887;
arr[4][1]=5454;
arr[4][2]=55;
arr[4][3]=5676;
arr[4][4]=588899999;
arr[4][5]=58;

for(int i=0;i<5;i++)
{
	for(int j=0;j<6;j++)
	{
		//System.out.println(arr[i][j]);
		if(arr[i][j]>big)
		{
			big=arr[i][j];
			//col=j;
		}
		
	}
	//System.out.println("     \n");
}
System.out.println(big);

	}

}
