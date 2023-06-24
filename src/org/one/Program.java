package org.one;

public class Program {
	public static void main(String[] args ){
		String s="Hai prabhu";
		String[] split=s.split("");
			for(int i=split.length-1; i>=0;i--)
			{
				System.out.print(split[i]);
				
			}
	}
}
