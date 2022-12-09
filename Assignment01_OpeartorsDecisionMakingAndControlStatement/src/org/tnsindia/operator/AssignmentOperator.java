package org.tnsindia.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=s.nextInt();
		System.out.println("Enter first number : ");
		int b=s.nextInt();
		a*=b;//a=a*b
		System.out.println(a);
		s.close();

	}

}
