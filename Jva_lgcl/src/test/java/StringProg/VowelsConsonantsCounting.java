package StringProg;

public class VowelsConsonantsCounting {

	public static void main(String[] args) {
		int vcount=0,consonantCount=0;
		int space=0;
String test="This is a really simple sentence";
String two=test.toLowerCase();
for(int i=0;i<test.length();i++){
	if(test.charAt(i)=='a'||test.charAt(i)=='e'||test.charAt(i)=='i'||test.charAt(i)=='o'||test.charAt(i)=='u'){
		vcount++;
	}else if(test.charAt(i)>='a'&&test.charAt(i)<='z'){
		consonantCount++;
		
	}
}
System.out.println("vowel  "+vcount);
System.out.println("consonant  "+consonantCount);
System.out.println("totoal  "+test.length());

	}

}
