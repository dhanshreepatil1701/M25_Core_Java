package org.tnsindia.statickeyword;

class A {
	//non-static method
	int add(int a,int b) {
		return a+b;
	}
	
	//static method
	public static void display() {
		System.out.println("WELCOME TO THE FULL STACK DEVELOPMENT TRAINING");
	}
}
public class DemoOnStaticMethod {

	public static void main(String[] args) {
		//WITHOUT CREATING ANYOBJECT FOR A CLASS WE CAN ACCESS THAT METHOD BY MAKING
		//THAT METHOD AS STATIC
		
		//classname.methodname();
		A.display();
	}
}