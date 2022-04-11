package com.demo.java8.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo2 {

	public static void main(String[] args) {

         List<Integer> numberdemo = Arrays.asList(1,2,3,4);
         //where n is anonymous you can consider any value reference
         numberdemo.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
