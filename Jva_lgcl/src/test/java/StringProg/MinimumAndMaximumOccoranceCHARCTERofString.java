package StringProg;

public class MinimumAndMaximumOccoranceCHARCTERofString {

	public static void main(String[] args) {
		String test = "MinimumAndMaximumOccoranceCHARCTERofString";
		int[] freq = new int[test.length()];
		char minchar = test.charAt(0);
		char maxchar = test.charAt(0);
		char[] string = test.toCharArray();
		int i, j, min, max;
		for (i = 0; i < string.length; i++) {
			freq[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					freq[i]++;
					// string[j]='0';
				}
			}
		}
		min = max = freq[0];
		for (i = 0; i < freq.length; i++) {
			if (freq[i] > max) {
				max = freq[i];
				maxchar = string[i];
			}
			if (freq[i] < min) {
				min = freq[i];
				minchar = string[i];
			}

		}
		System.out.println("Maximum occourance of chaarcter is " + maxchar);
		System.out.println("Minimum occourance of chaarcter is " + minchar);

	}

}
