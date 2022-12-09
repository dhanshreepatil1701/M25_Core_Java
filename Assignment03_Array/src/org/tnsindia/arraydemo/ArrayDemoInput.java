package org.tnsindia.arraydemo;

import java.util.Scanner;

public class ArrayDemoInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=s.nextInt();
		//array declaration
		int arr[]=new int[size];
		
		System.out.println("Enter the value: ");
		//enter the element in the array
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+i+" index");
			arr[i]=s.nextInt();
		}
		//to print the element in the array
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
			
		s.close();


	}

}
