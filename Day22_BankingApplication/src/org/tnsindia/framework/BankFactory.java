package org.tnsindia.framework;

import org.tnsindia.framework.CurrentAccount;
import org.tnsindia.framework.SavingAccount;

public abstract class BankFactory {
	abstract public SavingAccount getNewSavingAccount(int accNo , String accNm , float accBal , boolean isSalaried);
	abstract public CurrentAccount getNewCurrentAccount(int accNo , String accNm , float accBal , float creditLimit);

}
