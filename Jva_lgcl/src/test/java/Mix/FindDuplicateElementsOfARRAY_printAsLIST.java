package Mix;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateElementsOfARRAY_printAsLIST {

	public static void main(String[] args) {
int arr[]=new int[]{12,4,4,3,54,54,2,3,15,7,8,66,43,24,3,2,1};
List<Integer>li=new ArrayList<Integer>();
for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<arr.length;j++){
		if(arr[i]==arr[j]){
			if(!li.contains(arr[j])){
				li.add(arr[i]);
			}
		}
	}
}
System.out.println(li);
	}

}
