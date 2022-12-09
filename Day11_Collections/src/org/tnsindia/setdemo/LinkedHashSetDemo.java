package org.tnsindia.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
//LinkedHashSet is follows the insertion order
	public static void main(String[] args) {
		
		Set<Object> s=new LinkedHashSet<>();
		s.add("dhanshree");
		s.add('a');
		s.add(12);
		s.add("dhanshree");
		s.add(null);
		
		//to extract the elements from set by using enhanced for loop
		for(Object itr:s) {
			System.out.println(s);
		}
		System.out.println("The element in the set are :"+s);
				

	}
}