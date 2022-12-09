package org.tnsindia.mapdemo;

import java.util.Map;
import java.util.NavigableMap;
//import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		//TreeMap does not contain null key but it contains many null value
		//SortedMap<String,String>obj=new TreeMap<>();
		NavigableMap<String,String>obj=new TreeMap<>();
		obj.put("Dhanshree", "Student");
		obj.put("Nita", "Doctor");
		obj.put("geeta", "Engineer");
		obj.put("Shiv", null);
		System.out.println(obj);
		
		//to extract the pairs from map
		for(Map.Entry m:obj.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//to display first element with value
		System.out.println(obj.firstEntry());
		
		//to display last element with value
		System.out.println(obj.lastEntry());
		
		//to display last key
		System.out.println(obj.lastKey());

	}
}