package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Example on List interface using array list
public class ArrayListDemo {

	public static void main(String[] args) {
		//creating a first list using ArrayList 
		List<String> list =new ArrayList<String>();
		
		list.add("java");
		list.add("python");
		list.add("c++");
		
		List<String> list1 =new ArrayList<String>();
		
		list1.add("Raaj");
		list1.add("Priti");
		list1.add("Nehaa");
		
		
		System.out.println("The elements of list1 are :" +list);
		System.out.println("The elements of list1 are :" +list1);
		
		//adding the list2 element to list
		//list.addAll(list1);
		//System.out.println("The elements of new list are :" +list);
		
		//removing the list2 element to list
		//list.removeAll(list1);
		//System.out.println("The elements of new1 list are :" +list);
		
		//adding sublist to thelist2
		//list.subList(0,1);
		
		//Collections.rotate(list1, 2);
		//System.out.println("The elements of rotate list are :" +list1);
		
		//sort method
		//Collections.sort(list1);
		//System.out.println("The elements of sort list are :" +list1);
		
		//reverseOrder method
		//Collections.sort(list1,Collections.reverseOrder());
		//System.out.println("The elements of reverseorder list are :" +list1);
		
		//Enhanced for loop to extract the element of your ArrayList
		/*for(String itr:list) {
			System.out.println(itr);
		}*/
		
		
		//Example for list
		/*ArrayList l=new ArrayList(2);
		for(int i=0;i<=2;i++) {
			l.add(i);
		}
		System.out.println(l);
		*/
		
		//Iterator we can extract the element of your ArrayList
		/*Iterator itr1=list.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}*/
		
		//remove() is used to remove the specified index value
		//System.out.println(list.remove(2));
		//System.out.println("The elements of list are :" +list);
		
		//check the size of list
		//System.out.println(list.size());
		
		//to check contains in list
		//System.out.println(list.contains("python"));
		
		//to get the position of a particular element in ArrayList
		//1. System.out.println(list.indexOf("java"));
		//2. System.out.println(list.lastIndexOf("java"));
		
	}

}