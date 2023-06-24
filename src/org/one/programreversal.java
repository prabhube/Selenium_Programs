package org.one;

public class programreversal {
	public static void main(String[] args) {
		
	String s="";
	String a="prabhube.cdm@gmail.com";
		a = a.replaceAll("[^a-zA-Z]","");
	System.out.println("initial removed num: "+a);
	String[] split = a.split("");
	for(int i=split.length-1;i>0;i--) {
		s= s+split[i];
		
	}
	System.out.println("after removed then reversed :"+s);
	
	
	}
}
