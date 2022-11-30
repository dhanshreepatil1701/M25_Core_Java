package org.tnsindia.parameterized;
import java.util.Scanner;

//Demo on parameterized Constructor

class Bike{
	//variables
	public int speed;
	//default constructor
	Bike(int speed){
		this.speed=speed;
		System.out.println("Speed: "+speed+"km/hr");
	}
}

public class ParameterizedConstructorDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of speed : ");
		int speed =s.nextInt();
		Bike b=new Bike(speed);
		s.close();

	}

}
