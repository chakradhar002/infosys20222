package com.demo.java8.streamsdemo;
import java.util.ArrayList;
import java.util.List;
class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class StreamsUsingCollectionDemo {

	public static void main(String[] args) {
		//collection  here
		List<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product(1,"samsung",2000));   //we can create an  object like this way-anonymous object
		productlist.add(new Product(2,"iphone",4000)); /// hardcode values
		productlist.add(new Product(3,"MI",7000)); 
		productlist.add(new Product(4,"MI2",7000)); 
		
		//applied stream over the java collectiions
		
		productlist.stream().filter(product-> product.price==7000).forEach(product->System.out.println(product.name));
  
		productlist.stream().findFirst();
		
	}

}
