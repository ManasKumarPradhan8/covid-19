package ArrayBased;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachELementINaRRAY {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 4, 2, 6, 4, 7, 5, 7, 6 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int temp : arr) {
			if (map.containsKey(temp)) {
				// map.Key(temp)+1;
				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
		}
		System.out.println(map);
	}

}
