package org.tnsindia.client;

import org.tnsindia.application.MMBankFactory;
import org.tnsindia.application.MMCurrentAccount;
import org.tnsindia.application.MMSavingAccount;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAccount;
import org.tnsindia.framework.SavingAccount;


public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		BankFactory b=new MMBankFactory();
		SavingAccount s=new MMSavingAccount(1111, "Dhanshree Patil", 10000, true);
		CurrentAccount c=new MMCurrentAccount(2222, " Raaj Patil", 20000, 1500);
		System.out.println();
		System.out.println("Saving Account is : "); 
		s.withdraw(s.getAccBal());
		System.out.println();
		System.out.println("Current Account is : "); 
		c.withdraw(c.getAccBal());
		System.out.println();
		System.out.println(s); 
		System.out.println(c); 
	}

}
