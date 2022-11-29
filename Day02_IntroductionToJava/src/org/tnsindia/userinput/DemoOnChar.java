package org.tnsindia.userinput;
import java.util.Scanner;

//program on user input for character data-types

public class DemoOnChar {

	public static void main(String[] args) {
		//for user input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x= ");
		char x=s.next().charAt(0);
		System.out.print("Result =");
		System.out.print(x);
		s.close();
		

	}

}
