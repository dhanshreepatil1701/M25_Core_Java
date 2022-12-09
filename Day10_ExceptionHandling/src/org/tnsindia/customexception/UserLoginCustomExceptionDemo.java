package org.tnsindia.customexception;
import java.util.Scanner;

//Custom Exception for validating the Login credentials
class LoginCredentials extends Exception {
	public String str;

	//constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}
	
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
}

public class UserLoginCustomExceptionDemo {
	public static void main (String[] args ) {
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the Id :");
		String id= s.nextLine();
		System.out.print("Enter the password :");
		String password=s.nextLine();
		try {
			if(id!="dhanshree@gmail.com" && password!="abc@123")
				throw new LoginCredentials("Invalid Credentials");
			else {
				System.out.println("Logged-in succefully");
			}
		}
		catch(LoginCredentials e) {
			System.out.println("Exception handled "+e);
		}
	}
}