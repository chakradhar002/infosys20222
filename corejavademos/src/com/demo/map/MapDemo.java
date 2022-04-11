package com.demo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class MapDemo {
	public static void main(String ar[]) {

		HashMap<String, Integer> books = new HashMap<String, Integer>();

		// Adding key-value pairs to the map
		books.put("Data Structures With Java", 50);
		books.put("Operating System", 80);
		books.put("Let Us C", 70);
		books.put("Java Fundamentals", 40);

		System.out.println(books.size());
          //one way
		Set set = books.entrySet();
 
		Iterator it = set.iterator();

		while (it.hasNext()) {

			Map.Entry enrtydemo = (Map.Entry) it.next();// retrived both key and pair
			System.out.println(enrtydemo.getKey());
			System.out.println(enrtydemo.getValue());
		}
		
		System.out.println("***********************************");
		
		//another demo  demo
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"One");
		map.put(5, "Five");
		map.put(7, "Seven");
		map.put(2, "two");
		
		
		Set<Integer> keys = map.keySet();
		for(Integer key:keys) {
			String value = map.get(key);
			System.out.println(value);
		}

	}

}
