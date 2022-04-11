package com.demo.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> listdemo = new ArrayList<String>();
		
		listdemo.add("ram");
		listdemo.add("tom");
		listdemo.add("sham");
		
		
		//enachanced for loop
    for(String s :listdemo) {
    	
    	System.out.println(s);
    }
    
  //using traditional for loop	
    for (int i = 0; i < listdemo.size(); i++) {
    	System.out.println(listdemo.get(i));
    }


	}

}
