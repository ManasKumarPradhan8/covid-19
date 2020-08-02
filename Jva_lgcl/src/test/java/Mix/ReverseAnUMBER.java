package Mix;

public class ReverseAnUMBER {

	public static void main(String[] args) {
int num=54678;
int temp=num;
int dg=0;
int rev=0;
while(num!=0){
	dg=num%10;
	rev=rev*10+dg;
	num=num/10;
}
System.out.println("Nymber is "+temp);
System.out.println("After reverse operation  Number is  "+rev);
	}

}
