package logicals2;

import java.util.HashMap;
import java.util.Map;

public class RemoveDupicateCharsInString {

	public static void main(String[] args) {
		String str="manaskumar";
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		boolean repeatedChar=false;
		for(int i=0;i<chars.length;i++){
			boolean repeatedchars=false;
			for( int j=i+1;j<chars.length;j++){
				if(chars[i]==chars[j]){
					repeatedChar=true;
					break;
				}
			}
			if(!repeatedChar){
				sb.append(chars[i]);
			}
		}
		sb.toString();
		System.out.print("all values are  "+sb);
		
		}
		}


