package StringProg;

public class MinimumAndMaximumOccoranceCHARCTERofString3 {

	public static void main(String[] args) {
		String test="where are you";
		int[]freq=new int[test.length()];
		char[]arr=test.toCharArray();
		char maxfrq=arr[0];
		char minfrq=arr[0];
		int min,max=0,freqq;
		for(int i=0;i<arr.length;i++){
			 freq[i]=1;
			 for(int j=i+1;j<arr.length;j++){
				 if(arr[i]==arr[j] && arr[i]!='0' && arr[i]!=' '){
					freq[i]++;
				 }
			 }
		}
			 min=max=freq[0];
				 for ( int i = 0; i < freq.length; i++) {
						if (freq[i] > max) {
							max = freq[i];
							maxfrq = arr[i];
						}
						if (freq[i] < min) {
							min = freq[i];
							minfrq= arr[i];
						}

					}
				 
				 System.out.println("Maximum occourance of chaarcter is " + maxfrq);
					System.out.println("Minimum occourance of chaarcter is " + minfrq);

			 }
		}
			


