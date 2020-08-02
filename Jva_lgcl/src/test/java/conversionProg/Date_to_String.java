package conversionProg;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Stack;

public class Date_to_String {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		//stack.pop(); 
		if(stack.peek()){
			
		}
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}   
	}

}
