package StringProg;

public class NoOfCharsINstring {

	public static void main(String[] args) {
		int sum=0;
String main="where are you";
for(int i=0;i<main.length();i++){
	sum=sum+1;
	System.out.println(main.charAt(i)+" charcter    "+sum);
	
}
System.out.println("Total number of chars  "+sum);
	}

}
