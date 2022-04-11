package com.demo.java8.streamsdemo;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {
		
		
	  List<String> listitems =new ArrayList<String>();
	  
	  listitems.add("ram");
	  listitems.add("tom");
	  listitems.add("sham");
	  listitems.add("ravi");
	  listitems.add("Anu");
	 
	  listitems.sort((str1,str2)->str1.compareTo(str2));  ///str1 is a anonymous object
	  System.out.println(listitems);

	}

}
