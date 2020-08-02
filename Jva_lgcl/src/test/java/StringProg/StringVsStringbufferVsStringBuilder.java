package StringProg;

public class StringVsStringbufferVsStringBuilder {

			// Concatenates to String 
			public static void concat1(String s1) 
			{ 
				s1 = s1 + "kumar"; 
			} 

			// Concatenates to StringBuilder 
			public static void concat2(StringBuilder s2) 
			{ 
				s2.append("kumar"); 
			} 

			// Concatenates to StringBuffer 
			public static void concat3(StringBuffer s3) 
			{ 
				s3.append("kumar"); 
			} 

			public static void main(String[] args) 
			{ 
				String a1 = "manas"; 
				concat1(a1); // s1 is not changed 
				System.out.println("String: " + a1); 

				StringBuilder s2 = new StringBuilder("manas"); 
				concat2(s2); // s2 is changed 
				System.out.println("StringBuilder: " + s2); 

				StringBuffer s3 = new StringBuffer("manas"); 
				concat3(s3); // s3 is changed 
				System.out.println("StringBuffer: " + s3); 
			} 
		} 


