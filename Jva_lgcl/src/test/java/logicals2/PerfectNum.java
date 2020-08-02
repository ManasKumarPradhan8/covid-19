package logicals2;

public class PerfectNum {

	public static void main(String[] args) {
		int no=6,sum=0;
		int i=1;
		while(i<=no/2){
			if(no%i==0){
				sum=sum+i;
			}
			i++;
		}
		if(sum==no){
			System.out.println("perfect");
		}else{
			System.out.println("not perfect");
		}

	}

}
