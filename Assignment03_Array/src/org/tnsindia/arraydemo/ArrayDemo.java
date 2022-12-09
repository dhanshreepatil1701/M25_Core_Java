package org.tnsindia.arraydemo;

public class ArrayDemo {

	public static void main(String[] args) {
		
		/* int arr[4]= new int []{11,45,33,8};
		  do not declare the size at the end if you are initializing the array */
		int arr[]= new int []{11,45,33,8};
		System.out.println("The array index value is: "+ arr[2]);
		
		//Array index is out of bound exception as index is 3  we are accessing and last index is 2
		//System.out.println("The array index value is: "+ arr[4]);
		
	}

}
