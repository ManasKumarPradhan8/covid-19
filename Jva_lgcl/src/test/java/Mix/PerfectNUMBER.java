package Mix;

public class PerfectNUMBER {

	public static void main(String[] args) {
		
int num=17;
int i=1;
int sum=0;
while(i<=num/2){
	if(num%i==0){
		sum=sum+i;

	}
	i++;
}
if(sum==num){
	System.out.println("perfect number");
}else{
	System.out.println("Not perfect number");
}
	}

}
