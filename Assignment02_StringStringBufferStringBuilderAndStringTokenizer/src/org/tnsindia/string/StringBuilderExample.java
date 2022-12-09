package org.tnsindia.string;

//Demo on StringBuilder 
//To create mutable strings
//Similar to StringBuffer
public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		System.out.println(sb.capacity());

		//length of the string is less than 16 so it display the value as 16
		sb.append("Hive");

		System.out.println(sb.capacity());

		sb.append("Java is my favourite language");
		
		//(16*2)+2= 34
		System.out.println(sb.capacity());

	}

}
