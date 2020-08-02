package Mix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseArrayLIST {

	public static void main(String[] args) {
ArrayList al=new ArrayList();
al.add("a");
al.add("b");
al.add("c");
al.add("d");
al.add("e");
al.add("f");
al.add("g");
al.add("h");
al.add("i");
al.add("j");
Iterator itr=al.iterator();
while(itr.hasNext()){
	System.out.print(itr.next()+" ");
}
Collections.reverse(al);
System.out.println("Ater sorting");
Iterator itr2=al.iterator();
while(itr2.hasNext()){
	System.out.print(itr2.next()+" ");
}
	}

}
