package com.tripadvisor.qa.testcases;

public class Stringcompare {
	 static String result="";

	 public static String stringCompare(String str1, String str2) 
	    { 
		
	  
	        int l1 = str1.length(); 
	        int l2 = str2.length(); 
	        int lmin = Math.min(l1, l2); 
	  
	        for (int i = 0; i < lmin; i++) { 
	            int str1_ch = (int)str1.charAt(i); 
	            int str2_ch = (int)str2.charAt(i); 
	  
	            if (str1_ch != str2_ch) { 
	            	result=result+"*";
	            	//return result;
	            }
	            else{
	            	result=result+".";
	            	//return result;
	            }
	            }
            return result;

	           
	    } 
	  
	    // Driver function to test the above program 
	    public static void main(String args[]) 
	    { 
	        String string1 = new String("ATCCGCTTAGAGGGATT"); 
	        String string2 = new String("GTCCGTTTAGAAGGTTT"); 
	         
	  
	        // Comparing for String 1 < String 2 
	        System.out.println("Comparing " + string1 + " and " + string2 
	                           + " : " + stringCompare(string1, string2)); 
	  
	          } 

}
