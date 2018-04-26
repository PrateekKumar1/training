/**
 * 
 */
package com.training.model;

import java.util.List;

import com.training.view.Account;

/**
 * @author PRATEEK KR
 *
 */
public class CheckingAccount implements Account {
double balance;
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
public CheckingAccount(final double balance, final String accnumb) {
this.balance = balance;
this.accnumb = accnumb;
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
 * @param balance the balance to set
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
 * @param accnumb the accnumb to set
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
 * @param cust the cust to set
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
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
return "Checking Account\n Balance=" + balance + ", accountNumber=" + accnumb + ", interestRate="+ interest + ", Customer=" + cust + "";
	}
/* (non-Javadoc)
 * @see com.training.view.Account#Wdrawamt(double)
 */
public List Wdrawamt(double amount) {
	// TODO Auto-generated method stub
	return null;
}
/* (non-Javadoc)
 * @see com.training.view.Account#DepoAmt(double)
 */
public List DepoAmt(double amount) {
	// TODO Auto-generated method stub
	return null;
}
}
