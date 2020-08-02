package StringProg;

public class EqualPartionsString {

	public static void main(String[] args) {
String test="aaabbbcccddd";
int len=test.length();
int key=3;
int temp=0,chars=len/key;
String[]equalString=new String[key];
if(len%key!=0){
	System.out.println("Strings can not be divided");
	
}else{
	for(int i=0;i<len;i=i+chars){
		String part=test.substring(i,i+chars);
		equalString[temp]=part;
		temp++;
	}
	System.out.println(key+" equal parts of strings are");
	for(int i=0;i<equalString.length;i++){
		System.out.println(equalString[i]);
	}
}
	}

}
