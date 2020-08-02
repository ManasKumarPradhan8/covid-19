package logicals;

public class Palindrom_string2 {

	public static void main(String[] args) {
		String main="abc";
		String rev="";
		for(int i=main.length()-1;i>=0;i--)
		{
		rev=rev+main.charAt(i);
		}
		if(main.equalsIgnoreCase(rev))
		{
			System.out.println("palindrom");
		}else
		{
			System.out.println("not palindrom");
		}

	}

}
