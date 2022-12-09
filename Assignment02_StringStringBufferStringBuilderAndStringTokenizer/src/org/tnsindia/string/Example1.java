package org.tnsindia.string;

//Example on string literal
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		//compile time input
		String str = "Dhanshree";
		System.out.println(str);
		System.out.print("The any string : ");
		//run time input
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		System.out.println("The enter string is :"+str1);
		s.close();

	}

}
