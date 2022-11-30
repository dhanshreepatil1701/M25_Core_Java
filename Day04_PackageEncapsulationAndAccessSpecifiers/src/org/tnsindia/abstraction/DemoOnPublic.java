package org.tnsindia.abstraction;
//Demo on public access specifier

class BOD {
	//if any data members is public the visibility is in any class
	public String dob="17-11-2001";
	public void display() {
		System.out.println("The DOB is: "+dob);
	}
}
public class DemoOnPublic {

	public static void main(String[] args) {
		BOD b=new BOD();
		b.display();

	}

}