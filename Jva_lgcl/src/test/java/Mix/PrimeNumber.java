package Mix;

public class PrimeNumber {

	public static void main(String[] args) {
int num=5;
int i=2;
int ctr=0;
if(num==0 && num==1){
	System.out.println("number entered is less than 0 and 1 ..ENTER NEW NUMBER");
}
for( i=2;i<num;i++){
	if(num%i==0){
		ctr++;
	}
}
if(ctr==0){
	System.out.println("Numbr is PRIME");
}else{
	System.out.println("Number is NOT PRIME");
}
	}

}
