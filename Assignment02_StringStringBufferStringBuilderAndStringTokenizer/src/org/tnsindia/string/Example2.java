package org.tnsindia.string;

//Example on string new keyword
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		System.out.print("Enter any String : ");
		Scanner s=new Scanner(System.in);
		String str1=new String(s.nextLine());
		System.out.println("The enter string is :"+str1);
		s.close();

	}

}
