package com.demo.javabasic.oopconcepts;

//oops concepts class and object
class DrawingRoom {
	// naming convention cam
	void showDrawingRoomObjects() { // functions or methods

		System.out.println(" this my DrawingRoom ");
	}

}

class BedRoom {
	void showBedRoomObjects() { // functions or methods
		System.out.println(" this my bed room ");
	}
}

class Kitchen {
	
	void showKitchenObjects() { // functions or methods
		System.out.println(" this my Kitchen room ");
	}

}

public class HouseDemo {

	public static void main(String ar[]) {

		// object declarations

		DrawingRoom books = new DrawingRoom();
		
		books.showDrawingRoomObjects();  //called the method of that class
		
		
		BedRoom bed =  new BedRoom(); //created the object of BedRoom class
		
		bed.showBedRoomObjects();
		
		Kitchen freeze =  new Kitchen(); //created the object of BedRoom class
		
		freeze.showKitchenObjects();//createdltich objeects of kitchen
		
	}

}
