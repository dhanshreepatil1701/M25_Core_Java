package org.tnsindia.list;

//Demo on Stack-LIFO
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer>s=new Stack<>();
		
		//Push -Insertion
		s.push(1);
		s.push(5);
		s.push(8);
		System.out.println(s);
		
		//pop-Deletion
		//it delete last element(LIFO)
		s.pop();
		
		//it delete 0th index element
		//s.remove(0);
		
		System.out.println(s);

	}

}