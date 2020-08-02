package StringProg;

public class LargestSmallestWordOFstring {

	public static void main(String[] args) {
String test="Consider above example in which an is the smallest word and extraordinaryyyyyyyyyyy"
		+ " is the largest word. One of the approach to find smallest and largest word "
		+ "is to split string into words then, compare length of each word with variables small"
		+ " and large. If length of a word is less than length of small then, store that word in small."
		+ " If length of a word is greater than length of large then, store that word in large." ;
	String[]arr=test.split(" ");
	String largestWord=arr[0];
	int big=arr[0].length();
	String smallestWord=arr[0];
	int small=arr[0].length();
	for(String temp:arr){
		if(temp.length()>big){
			big=temp.length();
			largestWord=temp;
		}
		if(temp.length()<small){
			small=temp.length();
			smallestWord=temp;
		}
	}
	System.out.println("Smallest word is "+smallestWord);
	System.out.println("Smallest word is "+largestWord);

	}

}
