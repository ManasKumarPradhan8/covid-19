package StringProg;

import java.util.HashMap;
import java.util.Map;

public class MinimumAndMaximumOccoranceCHARCTERofString2 {

	public static void main(String[] args) {
		String test = "MinimumAndMaximumOccoranceCHARCTERofString";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] arr = test.toCharArray();
		for (char v : arr) {
			if (map.containsKey(v)) {
				map.put(v, map.get(v) + 1);
			} else {
				map.put(v,1);
			}
		}
		System.out.println("occourance of each charcter is  ");
		System.out.println(map);
	}

}
