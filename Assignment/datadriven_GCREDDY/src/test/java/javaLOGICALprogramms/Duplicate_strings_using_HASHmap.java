package javaLOGICALprogramms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicate_strings_using_HASHmap {

	public static void main(String[] args) {
		String[] arr = { "manas", "kumar", "pradhan", "maynas", "kumar", "pradhan" };
		Map<String, Integer> map= new HashMap<String, Integer>();
		for (String one : arr) {
			if (map.containsKey(one)) {
				map.put(one, map.get(one) + 1);

			} else {
				map.put(one, 1);
			}
		}
		/*for (Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + "-------" + e.getValue());
		}*/
		//System.out.println(map.get("manas"));
		for(String s:map.keySet()){
			System.out.println(s+"---->"+map.get(s));
		}
	}

}
