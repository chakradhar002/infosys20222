package com.demo.inheritencedemo;

public interface CarInterfaceOwner{
	
	void start();   //by default it is public abstract
	
     void  stop();
     
    void engine();

}


 interface CarInterfaceFeatures extends CarInterfaceOwner{   //an interface can extends another interface
	
	void tyre();   //by default it is public abstract
	
     void  dashboar();
     
     void selfstart();

}

class TataSaf implements CarInterfaceOwner,CarInterfaceFeatures{


	public void start() {
		
		
	}


	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void tyre() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void dashboar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void selfstart() {
		// TODO Auto-generated method stub
		
	}
	
	
}
class Toyato implements CarInterfaceOwner{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		
	}
	
	
}