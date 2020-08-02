package StringProg;

public class PlindromString {

	public static void main(String[] args) {
String test="abab";
String temp="";
for(int i=test.length()-1;i>=0;i--){
	temp=temp+test.charAt(i);
}
if(test.equalsIgnoreCase(temp)){
	System.out.println("palindrom number");
}else{
	System.out.println("not palindrom number");
}
	}

}
