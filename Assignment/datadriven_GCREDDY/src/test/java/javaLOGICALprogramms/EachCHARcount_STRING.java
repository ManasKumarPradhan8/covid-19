package javaLOGICALprogramms;

import java.util.HashMap;

public class EachCHARcount_STRING {
	private static void characterCount(String inputString)
    {
        //Creating a HashMap containing char as a key and occurrences as a value
  
        HashMap<Character, Integer> cm = new HashMap<Character, Integer>();
  
        //Converting given string to char array
  
        char[] strArray = inputString.toCharArray();
  
        //checking each char of strArray
  
        for (char c : strArray)
        {
            if(cm.containsKey(c))
            {
                //If char 'c' is present in charCountMap, incrementing it's count by 1
            	                                                                      //BASE CLASS OF EXCEPTION//COLLECTION
  
                cm.put(c, cm.get(c)+1);
            }
            else
            {
                //If char 'c' is not present in charCountMap,
                //putting 'c' into charCountMap with 1 as it's value
  
                cm.put(c, 1);
            }
        }
         
        //Printing inputString and charCountMap 
  
        System.out.println(inputString+" : "+cm);
    }
  
    public static void main(String[] args)
    {
       characterCount("cuttack is a beautiful city and i love it");
  
      characterCount("All Is Well");
  
       characterCount("Done And Gone");
    }
}

