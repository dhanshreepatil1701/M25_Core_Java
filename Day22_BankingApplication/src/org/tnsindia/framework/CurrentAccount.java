package org.tnsindia.framework;

import org.tnsindia.framework.BankAccount;

public abstract class CurrentAccount extends BankAccount {
	
	private final float creditLimit;
	public CurrentAccount(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	public void withdraw (float accBal) {
		System.out.println("Account No is:"+this.getAccNo()+"\nAccount Name is:"+this.getAccNm()+
				"\nAccount Balance is:"+(accBal + creditLimit));
	}
	@Override
	public String toString() {
		return String.format("CurrentAccount [creditLimit=%s]", creditLimit);
	}

}
