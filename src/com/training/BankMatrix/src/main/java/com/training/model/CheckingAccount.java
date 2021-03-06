/**
 * 
 */
package com.training.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.training.service.Account;



/**
 * @author PRATEEK KR
 *
 */
public class CheckingAccount implements Account {
	final static Logger lps = Logger.getLogger(CheckingAccount.class.getName());
	double balance = 1000;
	String accnumb;
	final double interest = 8.37;
	static int id = 0;
	Customers cust;

	public CheckingAccount(final double balance, final String accnumb, final Customers cust) {
		super();
		this.balance = balance;
		this.accnumb = accnumb;
		this.cust = cust;
	}

	public CheckingAccount() {
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
		return "Checking Account\n Balance=" + balance + ", accountNumber=" + accnumb + ", interestRate=" + interest
				+ ", Customer=" + cust + "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.training.view.Account#Wdrawamt(double)
	 */
	public List Wdrawamt(double amount) {
		final CheckingAccount chacc = new CheckingAccount();
		double balance = chacc.getBalance();
		balance = balance - amount;
		final List list = new ArrayList();
		list.add(amount);
		lps.info("Remaining in checking account after withdrwal is INR"
				+ balance);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.training.view.Account#DepoAmt(double)
	 */
	public List DepoAmt(double amount) {
		final CheckingAccount chkdepo = new CheckingAccount();
		double balance = chkdepo.getBalance();
		balance = balance + amount;
		final List list = new ArrayList();
		list.add(amount);
		lps.info("Amount in checking account after deposit is INR" + balance);
		return list;
	}
}
