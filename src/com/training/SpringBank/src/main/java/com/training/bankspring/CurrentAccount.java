/**
 * 
 */
package com.training.bankspring;

/**
 * @author PRATEEK KR
 *
 */
public class CurrentAccount {
static int id = 0;
int accnumb;
double interestRate=8.23;
Customers custm;
double balance;
/**
* @return 
*/
public int getaccnumb() {
return accnumb;
}
/**
* @param 
*/
public void setAccountNumber(int accnumb) {
this.accnumb = accnumb;
}
/**
* @return 
*/
public double getInterestRate() {
return interestRate;
}
/**
* @param 
*/
public void setInterestRate(double interestRate) {
this.interestRate = interestRate;
}
/**
* @return */
public Customers getCustomer() {
return custm;
}
/**
* @param 
*/
public void setCustomer(Customers custm) {
this.custm = custm;
}
/**
* @return 
*/
public double getBalance() {
return balance;
}
/**
* @param 
*/
public void setBalance(double balance) {
this.balance = balance;
	}
}
