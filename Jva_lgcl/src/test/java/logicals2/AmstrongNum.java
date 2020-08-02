package logicals2;

public class AmstrongNum {

	public static void main(String[] args) {
int num=153;
int container=num;
int dg=0;
int rev=0;
int sum=0;
while(num>0){
	dg=rev*10+dg;
	sum=sum+(dg*dg*dg);
	num=num/10;
}if(sum==num){
	System.out.println("Number is Amstrong Number");
}else{
	System.out.println("Number is not Amstrong number");
}
	}

}
