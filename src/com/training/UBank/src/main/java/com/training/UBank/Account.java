/**
 * 
 */
package com.training.UBank;

/**
 * @author PRATEEK KR
 *
 */
abstract class Account {
Customer customer;
static int id;
double balance;
long accnum;
/**
 * @param balance
 * @param customer
 */
public Account(final double balance,final Customer customer) {
id=1;
this.balance = balance;
this.customer=customer;
accnum = id++;
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
public void setBalance(final double balance) {
this.balance = balance;
}
/**
* @return the accountNumber
*/
public long getAccountNumber() {
return accnum;
}
@Override
public String toString() {
return "Account (balance=" + balance + "\t accountNumber=" + accnum + ")";
}
}