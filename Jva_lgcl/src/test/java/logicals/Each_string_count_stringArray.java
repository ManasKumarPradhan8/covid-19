package logicals;

import java.util.HashMap;
import java.util.Map;

public class Each_string_count_stringArray {

	public static void main(String[] args) {
		String[]arr={"manas","kumar","mans","kumar"};
		Map<String,Integer>map=new HashMap<String,Integer>();
		for(String temp:arr)
		{
			if(map.containsKey(temp))
			{
				map.put(temp,map.get(temp)+1);
				
			}
			else
			{
				map.put(temp,1);
			}
		}
		//System.out.println(map);
		for(String temp:map.keySet())
		{
		System.out.println("string "+temp+ "is repeated for "+map.get(temp)+"times");
		}
	}

}
