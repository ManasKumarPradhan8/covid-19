package StringProg;

import java.util.ArrayList;
import java.util.List;

public class LowerCaseToUPPERviceversa {

	public static void main(String[] args) {
		String test = "QqweRTY";
		StringBuffer sb=new StringBuffer(test);
		for(int i=0;i<test.length();i++){
			if(Character.isLowerCase(test.charAt(i))){
				sb.setCharAt(i,Character.toUpperCase(test.charAt(i)));
			}else{
				sb.setCharAt(i,Character.toLowerCase(test.charAt(i)));
			}
		}
		System.out.println("After operation "+sb);
	}
}
