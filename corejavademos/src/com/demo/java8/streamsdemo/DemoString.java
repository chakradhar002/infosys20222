package com.demo.java8.streamsdemo;

import java.util.List;
import java.util.stream.Stream;

public class DemoString {

	public static void main(String[] args) {
		List<String> castList = List.of("ram","tom","Anu","jack");
		Stream<String>  ref =  castList.stream();
		
		System.out.println(ref.count());
		System.out.println(ref);
		
		
		

	}

}
