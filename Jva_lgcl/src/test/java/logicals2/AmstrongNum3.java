package logicals2;

public class AmstrongNum3 {

	public static void main(String[] args) {
int num=153;
int temp=num;
int sum=0,dg=0;
while(num>0){
	dg=num%10;
	sum=sum+(dg*dg*dg);
	num=num/10;
}
if(temp==sum){
	System.out.println("armstrong number");
}else{
	System.out.println("Not armstrong number");
}
	}

}
