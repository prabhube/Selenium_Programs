package org.one;

import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicates {
	public static void main(String[] args ){
		String s="Hai prabhu prem prabha";
	Map<String,Integer> m= new LinkedHashMap();
		String[] split=s.split("");
		for(String string:split)
			{
		if(m.containsKey(string))
		{
			Integer input=m.get(string);
			m.put(string,input+1);
//		System.out.println(m);
		}
			else{
			m.put(string, 0);
			
			}
		
			}
		System.out.println(m);
	}

	
}
