package logicals;

public class Two_Biggest_element {

	public static void main(String[] args) {
		int max_one=0;
		int max_two=0;
		int[]arr={12,34,757,34,7,65,45,78};
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] >max_one) {
				max_two=max_one;
				max_one= arr[i];
 
			} else if (arr[i] >max_two) {
				max_two= arr[i];
 
			}}
System.out.println("biggest element is"+max_one);
System.out.println(" second biggest element is"+max_two);

	}

}
