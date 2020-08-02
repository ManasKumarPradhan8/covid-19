package logicals;

public class Palindrom_Number {

	public static void main(String[] args) {
		int no = 7875;
		int temp=no;
		int  rem,rev=0;
		while (no != 0) 
		{
		 rem = no % 10;
			rev = (rev * 10) +rem;
			no = no / 10;
		}
		if (temp== rev) {
			System.out.println("palindrom");
		} else {
			System.out.println("not pal");
		}

	}

}
