package org.tnsindia.exception;

//example on ArrayIndexOutOfBounds Exception
//catch block is used to handle the exception
public class ArrayExceptionHandling {

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		//try block contain the exception code
		try{
			int[]myIntArray = new int[] {1, 2, 3};
			print(myIntArray);
		}
		
		//catch block is used to handle the exception
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("Array Index Out Of Bounds Exception handled using catch block");
		}
			
		System.out.println("Third Line");
	}
	public static void print(int[] arr) {

		System.out.println(arr[3]);
		System.out.println("Fourth element successfully displayed!");
		
	}
	
}