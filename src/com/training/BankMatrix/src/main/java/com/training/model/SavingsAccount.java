/**
 * 
 */
package com.training.model;

import java.util.List;
import java.util.logging.Logger;

import com.training.service.Account;



/**
 * @author PRATEEK KR
 *
 */
public  class SavingsAccount implements Account {
	final static Logger lps = Logger.getLogger(SavingsAccount.class.getName());
	double balance = 1000;
	String accnumb;
	final double interest = 8.67;
	static int id = 0;
	Customers cust;

	public SavingsAccount(final double balance, final String accnumb, final Customers cust) {
		super();
		this.balance = balance;
		this.accnumb = accnumb;
		this.cust = cust;
	}
	
	public SavingsAccount() {
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the accnumb
	 */
	public String getAccnumb() {
		return accnumb;
	}

	/**
	 * @param accnumb
	 *            the accnumb to set
	 */
	public void setAccnumb(String accnumb) {
		this.accnumb = accnumb;
	}

	/**
	 * @return the cust
	 */
	public Customers getCust() {
		return cust;
	}

	/**
	 * @param cust
	 *            the cust to set
	 */
	public void setCust(Customers cust) {
		this.cust = cust;
	}

	/**
	 * @return the interest
	 */
	public double getInterest() {
		return interest;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Saving Account\n Balance=" + balance + ", accountNumber=" + accnumb + ", interestRate=" + interest
				+ ", Customer=" + cust + "";
	}

	
}
