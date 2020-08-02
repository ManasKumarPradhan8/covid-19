package logicals;

import java.util.HashMap;
import java.util.Map;

public class Count_occourance_chars_String {

	public static void main(String[] args) {
		String test = "you dont know how much i love you.you wont belive";
		char[] arr = test.toCharArray();
		Map<Character, String> map = new HashMap<Character, String>();
		for (char c : arr) {
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

		System.out.println( map);

	}

}
