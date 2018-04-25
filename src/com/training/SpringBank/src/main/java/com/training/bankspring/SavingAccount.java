/**
 * 
 */
package com.training.bankspring;

/**
 * @author PRATEEK KR
 *
 */
public class SavingAccount {
static int id = 0;
String accnumb;
double interestRate=8.75;
Customers custm;
double balance;
/**
* @return the accountNumber
*/
public String getaccnumb() {
return accnumb;
}
public void setaccnumb(String accnumb) {
this.accnumb = accnumb;
}
/**
* @return the customer
*/
public Customers getcustomer() {
return custm;
}
/**
* @param customer the customer to set
*/
public void setCustomer(Customers custm) {
this.custm = custm;
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
* @return the interestRate
*/
public double getInterestRate() {
return interestRate;
}
/**
* @param interestRate the interestRate to set
*/
public void setInterestRate(double interestRate) {
this.interestRate = interestRate;
}


}
