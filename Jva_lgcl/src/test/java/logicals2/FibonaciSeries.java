package logicals2;

public class FibonaciSeries {

	public static void main(String[] args) {
int prev=2;
int next=4;
int upto=10;
for(int i=1;i<=upto;i++){
	System.out.print("  "+prev);
	int sum=prev+next;
	prev=next;
	next=sum;
	
}
	}

}
