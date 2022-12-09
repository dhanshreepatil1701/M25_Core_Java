package org.tnsindia.enumdemo;

import java.util.Scanner;

import org.tnsindia.enumdemo.PizzaEnumDemo.Size;

public class PizzaEnumExcecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the pizza :");
		String size= s.nextLine();
		//converting String to enum-size of the pizza
		Size s1=Size.valueOf(size.toUpperCase());
		switch(s1) {
		case SMALL:
			System.out.println("preparing SMALL pizza for the customer");
			break;
		case MEDIUM:
			System.out.println("preparing MEDIUM pizza for the customer");
			break;
		case LARGE:
			System.out.println("preparing LARGE pizza for the customer");
			break;
		case EXTRALARGE:
			System.out.println("preparing EXTRALARGE pizza for the customer");
			break;
		}

	}

}
