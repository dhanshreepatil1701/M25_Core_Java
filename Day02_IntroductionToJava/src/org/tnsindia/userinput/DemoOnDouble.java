package org.tnsindia.userinput;

import java.util.Scanner;

//program on user input for double data types
public class DemoOnDouble {

	public static void main(String[] args) {
		//for user input
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the value of x = ");
		double x=s.nextInt();
		System.out.print("Result = "+x);
		s.close();

	}

}
