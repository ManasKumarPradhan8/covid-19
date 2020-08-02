package logicals2;

public class BiggestNDsmallestWordofSentence {

	public static void main(String[] args) {
		String test="biggggggg isjkhlkhhhljk small akjhjhnjh";
		String[]arr=test.split(" ");
		String largestword="",smallestword="";

		largestword=smallestword=arr[0];
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"  of length "+arr[i].length());
			
			if(arr[i].length()>largestword.length()){
				largestword=arr[i];//bigggggg
			}
			if(arr[i].length()<smallestword.length()){
				smallestword=arr[i];
			}
		}
		System.out.println("Biggest word of the string is "+largestword);
		System.out.println("Smallest word of the string is "+smallestword);

	}

}
