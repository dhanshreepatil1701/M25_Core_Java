package org.tnsindia.setdemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//Set is interface we cant create the object for the set
		//Set s=new Set<>();
		
		//it is unOrder and it does not contain same element
		Set s=new HashSet<>();
		s.add("dhanshree");
		s.add('a');
		s.add(12);
		s.add("dhanshree");
		s.add(null);
		System.out.println("The element in the set are :"+s);
		

	}
}