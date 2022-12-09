package org.tnsindia.overloading;

//demo on method overloading by changing the no. of arguments
class Mathematicaloperation {
	//method overloading
	public void addition(int a,int b) {
		System.out.println("The sum is : "+(a+b));
	}
	public void addition(float a,int b) {
		System.out.println("The sum is : "+(a+b));
	}
}

public class DemoOnMethodOverloading {

	public static void main(String[] args) {
		Mathematicaloperation m=new Mathematicaloperation();
		m.addition(10, 20);
		m.addition(12.0f, 22);
	}

}