package Mix;

import java.util.ArrayList;
import java.util.List;

public class AllSubstrings_ofSTRING {

	public static void main(String[] args) {
		String test = "ABCA";
		int len = test.length();
		List<String> li = new ArrayList<String>();

		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				li.add(test.substring(i, j + 1));

			}
		}
		System.out.println(li);
	}

}
