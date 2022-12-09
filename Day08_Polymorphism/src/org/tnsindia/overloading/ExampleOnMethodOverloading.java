package org.tnsindia.overloading;

//Demo On Overloading by passing Zero-argument, One-argument, Two-argument
class Shape {
	//method overloading
	
	//zero-argument
	public void area () {
		System.out.println("Find area : ");
	}
	//one-argument
	public void area(int r) {
		System.out.println("Area of circle : "+3.14*r*r);
	}
	
	//two-argument
	public void area(int l, int m) {
		System.out.println("Area of rectangle : "+l*m);
	}
}
public class ExampleOnMethodOverloading {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.area();
		s.area(2);
		s.area(2, 3);

	}
}