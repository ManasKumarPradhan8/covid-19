package javaLOGICALprogramms;

public class DuplicateCHARinString {

	public static void main(String[] args) {
		
		String test="aabbbcccddddeeeeeffgg";
		int ctr=0;
		char[]c=test.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					ctr++;
					System.out.println("charcter "+c[j]+  "is repeated at+"+j+"index for +"+ctr+"times");
				}
			}
		}
			}

		}
