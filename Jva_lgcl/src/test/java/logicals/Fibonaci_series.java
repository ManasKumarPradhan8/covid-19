package logicals;

public class Fibonaci_series {

	public static void main(String[] args) {
		int prev=5;
		int next=6;
		int max=5;
		for(int i=1;i<=max;i++)
		{
			System.out.print(+prev+"   ");
		int sum=prev+next;
		prev=next;
		next=sum;
		}

	}

}
