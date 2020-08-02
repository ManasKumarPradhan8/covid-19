package StringProg;

public class SwappingTwoStringsWithout3rdVAriable {

	public static void main(String[] args) {
String test="manas";
String test2="prakas";
System.out.println("test BEFORE ="+test);
System.out.println("test2 BEFORE="+test2);

test=test+test2;
System.out.println(test);
test2=test.substring(0,5);
test=test.substring(5);
System.out.println("test AFTER ="+test);
System.out.println("test2 AFTER="+test2);

	}

}
