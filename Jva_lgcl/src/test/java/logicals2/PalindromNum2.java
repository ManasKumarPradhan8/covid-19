package logicals2;

public class PalindromNum2 {

	public static void main(String[] args) {
int no=525;
int temp=no;
int rev=0;
while(no!=0){
int	dg=no%10;
rev=rev*10+dg;
no=no/10;
}
if(temp==rev){
	System.out.println("palindrom number");
}else{
	System.out.println("not palindrom num");
}

	}

}
