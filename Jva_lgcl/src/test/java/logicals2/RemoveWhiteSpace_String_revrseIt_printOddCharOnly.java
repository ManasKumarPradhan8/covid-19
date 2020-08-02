package logicals2;

public class RemoveWhiteSpace_String_revrseIt_printOddCharOnly {

	public static void main(String[] args) {//remove white space from string reverse it,print only odd chars...
String test="where are you";
String test1=test.replaceAll(" ","");
System.out.println(test1);
for(int i=test1.length()-1;i>=0;i-=2){
	System.out.print(test1.charAt(i));
//	System.out.print(test1.charAt(1));
	//System.out.println(test1.charAt(3));
//	System.out.println(test1.charAt(5));
//	System.out.println(test1.charAt(7));

}
	}}