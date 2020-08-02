package logicals2;

public class PalindromNum {

	public static void main(String[] args) {
int num=1232176;
int take=num;
int rev=0;
int dg=0;
while(num>0){
	dg=num%10;
	rev=rev*10+dg;
	num=num/10;
	
}
if(take==rev){
	System.out.println("palindrom number");
}else{
	System.out.println("not palindrom number");
}
	}

}
