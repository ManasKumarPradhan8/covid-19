package logicals;

import java.util.HashMap;

public class Each_char_count_inString {

	public static void main(String[] args) {
		String inputString = "hkhfgvyugygyhoi";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		// Converting given string to char array

		char[] strArray = inputString.toCharArray();

		// checking each char of strArray

		for (char c : strArray) {
			if (map.containsKey(c)) {
				// If char 'c' is present in charCountMap, incrementing it's
				// count by 1
				// BASE CLASS OF EXCEPTION//COLLECTION

				map.put(c, map.get(c) + 1);
			} else {
				// If char 'c' is not present in charCountMap,
				// putting 'c' into charCountMap with 1 as it's value

				map.put(c, 1);
			}
		}

		// Printing inputString and charCountMap

		System.out.println(inputString + " : " + map);
	}

}
