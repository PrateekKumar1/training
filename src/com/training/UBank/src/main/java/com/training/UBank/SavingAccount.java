/**
 * 
 */
package com.training.UBank;

import java.util.Scanner;
import java.util.logging.Logger;
/**
 * @author PRATEEK KR
 *
 */
public class SavingAccount extends Account {
Customer cust;
final double interestRate= 8.47; 
/**
* @param balance
* @param cust
*/
public SavingAccount(final double balance, final Customer cust) {
super(balance, cust);
this.cust=cust;
}

public void Deposit(int amt) {
balance = balance + amt;
}

public void Withdraw(int amt) {
if (balance - amt > 0) {
balance = balance - amt;
}
else {
System.out.println("Not enough balance to withdraw " + amt);
}
}
public void addInterest()
{
balance = interestRate * balance+balance ;
System.out.println("Salary After adding interest rate is :"+balance);
}
public void Disp() {
System.out.println(" \n Account no:" + accnum + "\t|\t Balance:" + balance+"\t|\t Name:"+customer.getfname()+" \t|\t Surname:"+customer.getlname());
	}
}