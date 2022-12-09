package org.tnsindia.statickeyword;

//static keyword with variable

public class DemoOnStaticVariable {

	/* If we declare any variable outside the main function and 
	 * we print that variable without static
	 * then we will get the error...for that purpose we have  to use static keyword
	 */
	
	static int a=56;
	// static int b;
	public static void main(String[] args) {
		System.out.println(a);

	}
}