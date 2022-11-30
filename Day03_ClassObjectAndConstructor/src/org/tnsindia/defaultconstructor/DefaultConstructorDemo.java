package org.tnsindia.defaultconstructor;
//program on default constructor
//class definition
class Car {
	//variables
	public int speed;
	//methods
	void display() {
		System.out.println(" The speed is = "+speed+"km/hr");
	}
	/* 
	//default constructor
	Car() {
		speed=50;
	}
	*/
}
public class DefaultConstructorDemo {
	public static void main(String[] args) {
		//object creation
		Car obj=new Car();
		obj.speed=50;
		//calling the method of car class
		obj.display();
	}
}