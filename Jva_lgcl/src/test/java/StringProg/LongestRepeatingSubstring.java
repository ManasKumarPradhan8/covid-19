package StringProg;

public class LongestRepeatingSubstring {

	public static void main(String[] args) {
		String str="acbdfghybdf";
		String lrs="";
		int len=str.length();
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				System.out.println(str.substring(i,len));
				System.out.println(str.substring(j,len));
			String x=LongestRepeatingSubstring.longestsubstring(str.substring(i,len),str.substring(j,len));
			if(x.length() > lrs.length())
				lrs=x; 
			}
		}
        System.out.println("Longest repeating sequence: "+lrs);  
	}
	
	public static String longestsubstring(String s,String t){
		int n=Math.min(s.length(),t.length());
		for(int i=0;i<n;i++){
			if(s.charAt(i)!=t.charAt(i)){
				return s.substring(0, i);
			}
		}
		return s.substring(0, n);
	}

}

