package logicals2;

public class PrimeNum {

	public static void main(String[] args) {
int no=102;
for(int i=2;i<no;i++){
	if(no%i==0){
		System.out.println("not prime number");
		break;
	}else{
		System.out.println("prime number");
		break;
	}
}
	}

}
