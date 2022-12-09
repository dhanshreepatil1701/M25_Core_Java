package org.tnsindia.string;

//write a java code  to check whether the input string matches with the word dhoni
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		String str = "Dhoni";
		System.out.println("enter the string : ");
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		if(str.equalsIgnoreCase(str1)) {
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}
		
		s.close();

	}
}