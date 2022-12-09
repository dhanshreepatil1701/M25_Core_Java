package org.tnsindia.streamdemo;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambdaDemo {

	public static void main(String[] args) {
		Set<Integer>obj=new HashSet();
		obj.add(45);
		obj.add(67);
		obj.add(23);
		obj.add(76);
		System.out.println(obj);
		
		/*for(Integer itr:obj) {
			System.out.println(itr+" ");
		}
		//instead of using looping statement we can extract the set element using one list
		//strem API
		*/
		obj.forEach(System.out::println);

	}

}