package org.tnsindia.regexdemo;

import java.util.Scanner;
import java.util.regex.Pattern;

//demo on matches() method of pattern class 
public class RegExPatternMethodDemo {

	public static void main(String[] args) {
		String Pattern ="Dhanshree Patil";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the input for a matching: ");
		
		String input=s.nextLine();
		boolean result =Pattern.matches(Pattern);
		System.out.println(result);
	}

}
