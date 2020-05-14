package projects.naukri;

public class STR {
	public static String leftRotate(String str,int d){
		String ans=str.substring(d)+str.substring(0,d);
		return ans;
	}
	public static String righytRotate(String str,int d){
		return leftRotate(str, str.length()-d);
	}

	public static void main(String[] args) {
		String str1="abcdefg";
		String str2=leftRotate(str1, 2);
		System.out.println(leftRotate(str1, 2));
		System.out.println(righytRotate(str2, 4));
	}

}
