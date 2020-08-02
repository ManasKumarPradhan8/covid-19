package logicals2;

public class PerfectNum2 {

	public static void main(String[] args) {
int no=6123,sum=0;
int i=1;
while(i<=no/2){
	if(no%i==0){
		sum=sum+i;
	}
	i++;
}
if(no==sum){
	System.out.println("perfect number");
}else{
	System.out.println("not perfect number");
}
	}

}
