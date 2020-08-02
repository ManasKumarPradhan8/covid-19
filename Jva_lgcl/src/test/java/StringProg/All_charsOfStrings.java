package StringProg;

public class All_charsOfStrings {

	public static void main(String[] args) {
String test="qwerty keypad is better than abcde";
String temp=test.replaceAll(" ","");
System.out.println(temp);
int len=temp.length();
for(int i=0;i<temp.length();i++){
	

System.out.print(temp.charAt(i)+" ");
	}
	}
}
