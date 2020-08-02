package ArrayBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemovingDuplicateElementArray2 {

	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int n = arr.length;
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer>list2=new ArrayList<Integer>();
		for(int i:arr){
			list.add(i);
		}
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()){
			int temp=itr.next();
			if(!list2.contains(temp))
				list2.add(temp);
			//System.out.println(temp);
		}
		Object[]arr2 =list2.toArray();
		//System.out.println(list2);
		for(Object ob:arr2){
			System.out.print(ob+"  ");
		}
	}
}
