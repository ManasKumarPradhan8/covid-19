package logicals;

public class ReverseSTRING {

	public static void main(String[] args) {
		String test="where";
		String rev="";
		char[] contain=test.toCharArray();
		int p=contain.length;
		for(int i=(p-1);i>=0;i--)
		{
			rev=rev+contain[i];
			//System.out.print(contain[i]);
		}
		System.out.println("reverse string is   "+rev);

	}

}
