package com.demo.collectionsdemo.setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* 
 * write all point here related with Set and HashSet*/

public class SetDemo {

	public static void main(String[] args) {
                     //same for linked hashset
		Set<String> listHashset = new HashSet<String>();//

		listHashset.add("ram");
		listHashset.add("tom");
		listHashset.add("ravi");
		listHashset.add("ravi");

		Iterator<String> itr = listHashset.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
