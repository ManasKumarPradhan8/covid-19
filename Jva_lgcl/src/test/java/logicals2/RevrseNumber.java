package logicals2;

public class RevrseNumber {

	public static void main(String[] args) {
int no=454;
int rev=0;
int dg=0;
while (no!=0){
	dg=no%10;
	rev=rev*10+dg;
	no=no/10;
}
System.out.println("Reverse number is  "+rev);
	}

}
