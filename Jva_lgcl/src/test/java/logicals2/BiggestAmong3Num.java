package logicals2;

public class BiggestAmong3Num {

	public static void main(String[] args) {
		int fno = 10666, sno = 20, thrdno = 599999;
		if ((fno > sno) && (fno > thrdno)) {
			System.out.println("BIGGEST NUMBER IS  " + fno);
		} else if ((sno > fno) && (sno > thrdno)) {
			System.out.println("biggest no is  " + sno);
		} else if ((thrdno > fno) && (thrdno > sno)) {
			System.out.println("biggest no is  " + thrdno);

		}

	}
}
