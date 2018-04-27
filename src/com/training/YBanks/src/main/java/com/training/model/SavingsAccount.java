/**
 * 
 */
package com.training.model;

import java.util.logging.Logger;

/**
 * @author trainee
 *
 */
public class SavingsAccount {
	final static Logger lps = Logger.getLogger(SavingsAccount.class.getName());
	double balance = 1000;
	final double interest = 8.47;
	static int id = 0;
	SavingsAccount(double balance)
	{
		this.balance=balance;
		id=id++;
	}
	SavingsAccount(){
		
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the id
	 */
	public static int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public static void setId(int id) {
		SavingsAccount.id = id;
	}
	/**
	 * @return the interest
	 */
	public double getInterest() {
		return interest;
	}
}
