/**
 * 
 */
package com.training.UBank;
/**
 * @author PRATEEK KR
 *
 */
public class SavingAccount extends Account {
Customer cust;
final double rate= 8.47; 
/**
* @param balance
* @param cust
*/
public SavingAccount(final double balance, final Customer cust) {
super(balance, cust);
this.cust=cust;
}

public void Deposit(int i) {
balance = balance + i;
}

public void Withdraw(Double amt) {
if (balance - amt > 0) {
balance = balance - amt;
}
else {
System.out.println("Not enough balance to withdraw " + amt);
}
}
public void addInterest()
{
balance =balance+(rate * balance)/100 ;
System.out.println("Salary After adding interest rate is :"+balance);
}
public void Display() {
System.out.println(" \n Account no:" + accnum + "\t|\t Balance:" + balance+"\t|\t Name:"+customer.getfname()+" \t|\t Surname:"+customer.getlname());
	}
}