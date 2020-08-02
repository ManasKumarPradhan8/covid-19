package logicals;

public class Palondrom_String {

	public static void main(String[] args) {
		String test="aba";
		StringBuffer ac=new StringBuffer(test);
		StringBuffer rev=ac.reverse();
		if(test.equals(rev))
		{
			System.out.println("palindrom");
		}else
		{
			System.out.println("not palindrom");
		}
	

	}

}
