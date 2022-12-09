package org.tnsindia.enumdemo;

public class EnumCarDemo {

	public static void main(String[] args) {
		//enum does not support the creation of objects
		//Car r1 =Car.HONDA;
		//System.out.println(r1);

		//using enhanced for loop
		for(Car c:Car.values()) {
			
			System.out.println(c);
			//System.out.println(c.MARUTI);
		}
	}

}
