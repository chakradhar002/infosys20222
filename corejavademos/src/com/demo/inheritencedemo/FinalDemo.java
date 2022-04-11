package com.demo.inheritencedemo;

   class A {  //immutable class
	 final void show(final int salary) {

	}
}

class B extends A {
	void show() {  //overided here

	}

}


class main{
	
	
	public static void main(String ar[]) {
		
	final B b = new B();
		b.show();
	}
}

