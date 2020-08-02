package StringProg;

public class LongestWordOfString {

	public static void main(String[] args) {
		
String test="myyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy name iss khan and ipp amm not ann terrorist longesssssssssssst";
String[]arr=test.split(" ");
String longestWord=arr[0];
String smallestWord=arr[0];
int big=arr[0].length();
int small=arr[0].length();

for(String temp:arr){
	int p=temp.length();
	if(temp.length()>big){
		big=temp.length();
		longestWord=temp;
	}
	if(temp.length()<smallestWord.length()){
		small=temp.length();
		smallestWord=temp;
	}
}
System.out.println("Longest word of the string is "+longestWord);
System.out.println("Smallest word of the string is   "+smallestWord);
	}

}
