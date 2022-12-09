package org.tnsindia.customexception;

//Example on Custom Exception
//
class SimpleCustomException extends Exception {
	public String str;

	//constructor
	public SimpleCustomException(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "SimpleCustomException [str=" + str + "]";
	}
	
}
public class SimpleCustomExceptionDemo {
	public static void main (String[] args ) {
		/* In order  to use own custom exception, we've to create a new objcet of the class 
		 * and throw it using the throw keyword
		 */
		try {
			throw new SimpleCustomException ("This is user defined exception");
		}
		catch (SimpleCustomException e){
			System.out.println(e);
			System.out.println(e.getMessage());
			
		}
		
	}
}