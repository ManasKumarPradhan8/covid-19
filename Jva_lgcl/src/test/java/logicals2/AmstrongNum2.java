package logicals2;

public class AmstrongNum2 {

	public static void main(String[] args) {
		
		int num=153;
		int sum=0;
		int rev=0;
		int dg=0;
		while(num>0){
			 dg=rev*10+dg;
			sum=sum+dg*dg*dg;
			num=num/10;
			
		}
		if(sum==num){
			System.out.println("NUMBER IS AMSTRONG NUMBER");
		}else{
			System.out.println("NUMBER IS NOT AMSTRONG");
		}
	}

}
