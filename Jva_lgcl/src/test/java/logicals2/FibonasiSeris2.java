package logicals2;

public class FibonasiSeris2 {

	public static void main(String[] args) {
int prev=2;
int next=5;
int upto=20;
for(int i=0;i<upto;i++){
	System.out.print(" "+prev);
	int sum=prev+next;
	prev=next;
	next=sum;
}
	}

}
