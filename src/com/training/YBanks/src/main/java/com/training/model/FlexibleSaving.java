/**
 * 
 */
package com.training.model;

import java.util.logging.Logger;

/**
 * @author PRATEEK KR
 *
 */
public class FlexibleSaving {
	final static Logger lps = Logger.getLogger(SavingsAccount.class.getName());
	double balance = 1000;
	final double interest = 8.67;
	static int id = 0;
	/**
	 * @param balance
	 */
	public FlexibleSaving(double balance) {
		this.balance = balance;
		id=id++;
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
		FlexibleSaving.id = id;
	}
	/**
	 * @return the interest
	 */
	public double getInterest() {
		return interest;
	}
	
	
}
