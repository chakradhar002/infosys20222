package com.demo.inheritencedemo;


class Area{
	
	
	
	
	  //area of circle
	 void shap(float radius) {
		 
		 float dummyresult = 3.14f*radius*radius;
		 System.out.println(dummyresult);
		 
	 }
	 //area of rectangle
 void shap(int lenght,int breadth) {
		 
		 float dummyresult = lenght*breadth;
		 System.out.println(dummyresult);
		 
	 }
	
	
}



public class OverloadingMethodDemo {
	
	public static void main(String ar[]) {

		Area a = new Area();
		a.shap(6.6f);
		
		a.shap(2, 2);
		

	}

}
