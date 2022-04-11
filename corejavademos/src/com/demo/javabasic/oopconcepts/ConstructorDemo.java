package com.demo.javabasic.oopconcepts;

class Addition {
   int k=889;  //instance vaiable or globle variable
   String customername;
   
   
	// constuctor
	Addition(String customername) {
		
		this.customername = customername;
        
	}
	
	Addition(int a,int b) {
        int result = a+b;
		System.out.println("from constuctor result  for parameter"+result);
	}

	// mehtod
	void show() {

		System.out.println("from customer name "+customername);
	}

}

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Addition add = new Addition("jack");  //calling constructor from here
		add.show();//calling method using add as reference  varible
		
		Addition add1 = new Addition(45,45); 
	}

}
