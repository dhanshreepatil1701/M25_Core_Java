package org.tnsindia.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String> s=new TreeSet();
		s.add("Dhanshree");
		s.add("45");
		s.add("patil");
		s.add("Java");
		
		System.out.println("The Elements in the TreeSet :"+s);

	}

}
