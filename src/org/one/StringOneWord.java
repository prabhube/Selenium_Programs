package org.one;

public class StringOneWord {
public static void main(String[] args) {
	String s="India is my Country";
	String[] split = s.split(" ");
	System.out.print(split[0]+" ");
	for(int i=split.length-1;i>=1;i--)
	{
		System.out.print(split[i]+" ");
	}
}
}
