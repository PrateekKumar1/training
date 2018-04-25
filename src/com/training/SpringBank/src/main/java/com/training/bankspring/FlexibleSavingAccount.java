/**
 * 
 */
package com.training.bankspring;

/**
 * @author PRATEEK KR
 *
 */
public class FlexibleSavingAccount {
double balance;
int accnumb;
final double interestRate = 8.67;
static int id = 0;
Customers cust;
public FlexibleSavingAccount(final double balance, final int accnumb, final Customers cust) {
super();
this.balance = balance;
this.accnumb = accnumb;
this.cust = cust;
}
public FlexibleSavingAccount(final double balance, final int accnumb) {
this.balance = balance;
this.accnumb = accnumb;
}
public FlexibleSavingAccount() {
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
public void setBalance(final double balance) {
this.balance = balance;
}
/**
* @return
*/
public int getAccountNumber() {
return accnumb;
}
/**
* @param
*/
public void setAccountNumber(final int accnumb) {
this.accnumb = accnumb;
}
/**
 * @return the customer
 */
public Customers getCustomer() {
return cust;
}
/**
 * @param customer the customer to set
 */
public void setCustomer(final Customers custm) {
this.cust= cust;
}
/**
 * @return the interestRate
 */
public double getInterestRate() {
return interestRate;
}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
@Override
public String toString() {
return "SavingAccount balance=" + balance + ", accountNumber=" + accnumb + ", interestRate="+ interestRate + ", customer=" + cust + "";
}
}
