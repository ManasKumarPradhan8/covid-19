package logicals2;

public class PerfectNum3 {

	public static void main(String[] args) {
		int num=6,sum=0;
		int i=1;
		while(i<=num/2){
			if(num%i==0){
				sum=sum+i;
			}
			i++;
		}
		if(num==sum){
			System.out.println("yes its perfect num");
		}else{
			System.out.println("no its not");
		}

	}

}
