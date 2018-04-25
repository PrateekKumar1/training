/**
 * 
 */
package com.training.bankspring;

/**
 * @author PRATEEK KR
 *
 */
public class CheckingAccount {
Customers custm;
double interestRate = 8.46;
double balance;
static int id =0;
int accnumb;
/**
* @param custm
* @param interestRate
* @param balance
* @param accnumb
	 */
public CheckingAccount(final Customers custm, final double interestRate, final double balance, final int accnumb) {
super();
this.custm = custm;
this.interestRate = interestRate;
this.balance = balance;
this.accnumb = accnumb;
}
/**
 * 
 */
/**
* @return 
 */
public Customers getcustomer() {
return custm;
}
/**
* @param 
*/
public void setCustomer(final Customers custm) {
this.custm = custm;
}
/**
* @return the interestRate
*/
public double getInterestRate() {
return interestRate;
}
/**
* @param interestRate the interestRate to set
*/
public void setInterestRate(final double interestRate) {
this.interestRate = interestRate;
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
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
return "Checking account customer=" + custm + ", interestRate=" + interestRate + ", balance=" + balance	+ ", accountNumber=" + accnumb+ "";
}

}
