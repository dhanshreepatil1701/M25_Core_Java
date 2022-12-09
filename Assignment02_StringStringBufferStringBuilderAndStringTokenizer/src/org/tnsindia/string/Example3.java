package org.tnsindia.string;

//comparing the string is equal or not
public class Example3 {

	public static void main(String[] args) {
		//string literal
		//String str = "Dhanshree";
		//String str1 = "Dhanshree";
		
		//string by new keyword
		String str1 =new String("hello");
		String str2 =new String("hello");
		
		//comparing string by string literal
		//System.out.println(str1==str2);
		
		//comparing string by new keyword
		System.out.println(str1.equals(str2));

	}

}
