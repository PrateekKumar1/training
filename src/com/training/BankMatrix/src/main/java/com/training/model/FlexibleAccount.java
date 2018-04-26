/**
 * 
 */
package com.training.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.training.view.Account;

/**
 * @author PRATEEK KR
 *
 */
public class FlexibleAccount implements Account {
	final static Logger lps = Logger.getLogger(FlexibleAccount.class.getName());
	double balance = 1000;
	String accnumb;
	final double interest = 8.81;
	static int id = 0;
	Customers cust;

	public FlexibleAccount(final double balance, final String accnumb, final Customers cust) {
		super();
		this.balance = balance;
		this.accnumb = accnumb;
		this.cust = cust;
	}

	public FlexibleAccount(final double balance, final String accnumb) {
		this.balance = balance;
		this.accnumb = accnumb;
	}

	public FlexibleAccount() {
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
		return "Flexible Account\n Balance=" + balance + ", accountNumber=" + accnumb + ", interestRate=" + interest
				+ ", Customer=" + cust + "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.training.view.Account#Wdrawamt(double)
	 */
	public List Wdrawamt(double amount) {
		final FlexibleAccount flxacc = new FlexibleAccount();
		double balance = flxacc.getBalance();
		balance = balance - amount;
		final List list = new ArrayList();
		list.add(amount);
		lps.info("Remaining balance in " + cust.getFlatno() + cust.getLname()
				+ "flexible account after withdrawl is INR" + amount);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.training.view.Account#DepoAmt(double)
	 */
	public List DepoAmt(double amount) {
		final FlexibleAccount fldepo = new FlexibleAccount();
		double balance = fldepo.getBalance();
		balance = balance + amount;
		final List list = new ArrayList();
		list.add(amount);
		lps.info("Amount in " + cust.getFlatno() + cust.getLname() + "flexible account after deposit is INR" + amount);
		return list;
	}
}
