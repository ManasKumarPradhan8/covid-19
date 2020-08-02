package StringProg;

import java.util.ArrayList;
import java.util.List;

public class DuplicatecharsOfSTRING {

	public static void main(String[] args) {
String test="where are you my friend";
List<Character>li=new ArrayList<Character>();
char[]arr=test.toCharArray();
for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<test.length();j++){
		if(arr[i]==arr[j] && !li.contains(arr[j])){
			li.add(arr[j]);
			
		}
	}
	}
System.out.println("repeated charcters are-------------");
System.out.println(li);

	}

}
