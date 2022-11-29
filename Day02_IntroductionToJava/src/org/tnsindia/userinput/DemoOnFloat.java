package org.tnsindia.userinput;
import java.util.Scanner;

//program on user input of float data types

public class DemoOnFloat {

	public static void main(String[] args) {
		//for user input
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of x= ");
		float x=s.nextInt();
		System.out.println("Result = "+x);
		s.close();
		
	}

}
