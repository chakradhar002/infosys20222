package com.demo.regexdemo;

public class SplitMethodDemo {

	public static void main(String[] args) {
  
		  String name="thisishellowwhen?that";
		  
		  String reg="?";
		  
		  String arraystr[] = name.split(reg);
		  
		  
             
             for(int i=0;i<arraystr.length;i++) {
            	 
            	 System.out.println(arraystr[i]);
             }
	}

}
