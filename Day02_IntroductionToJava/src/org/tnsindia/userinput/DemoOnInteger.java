package org.tnsindia.userinput;
import java.util.Scanner;

//program on user input of integer data types
public class DemoOnInteger {

	public static void main(String[] args) {
		//for user input
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of x= ");
		int x=s.nextInt();
		System.out.println("Result = "+x);
		s.close();
		
	}

}
