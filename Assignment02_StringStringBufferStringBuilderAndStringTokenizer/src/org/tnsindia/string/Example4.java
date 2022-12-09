package org.tnsindia.string;

//Demo on length, charAt function of the string
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		System.out.print("Enter the string : ");
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		
		//length() method returns the length of the string
		System.out.println(str1.length());
		
		//charAt() method returns a char value at the given index number
		System.out.println(str1.charAt(1));
		
		//UpperCase() method converts all lower case to upper case
		System.out.println(str1.toUpperCase());
		
		//LowerCase() method converts all upper case to lower case
		System.out.println(str1.toLowerCase());
		
		s.close();
	}

}
