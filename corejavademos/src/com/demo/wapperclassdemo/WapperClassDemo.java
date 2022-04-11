package com.demo.wapperclassdemo;

public class WapperClassDemo {

	public static void main(String[] args) {
	int i =10;
	
	Integer k = Integer.valueOf(i);//convert int into integer explicitly
	
	Integer p = k;//autoboxing, now complier will write Integer.valueOf(i) internally integer
	
 //un boxing
	
	Integer t = new Integer(5);
	
	
	
	int l = t.intValue();// convert integer into int explicitly
	
	int b =l;//this call unboxing
	
	 System.out.println(t.hashCode());
	 
	 byte r=10;  ///this is primitive
	 
	 Byte byteobj =(Byte)r;// thisis autoboxing coverting primitive into obj  done by developr
	 
	 Byte obj =r;//jvm done this for u
	 
	 
	 
	 

	
	}

}
