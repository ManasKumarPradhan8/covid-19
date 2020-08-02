package logicals2;

public class FibonasiSeris3 {

	public static void main(String[] args) {
int prev=5,next=10,upto=10;
for(int i=0;i<upto;i++){
	System.out.print(+prev+" ");
	int sum=prev+next;
	prev=next;
	next=sum;
}
	}

}
