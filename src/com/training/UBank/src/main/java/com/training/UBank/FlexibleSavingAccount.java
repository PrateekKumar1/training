/**
 * 
 */
package com.training.UBank;

/**
 * @author PRATEEK KR	
 *
 */
public class FlexibleSavingAccount extends Account{
Customer cust;
final double rate= 8.81;

/**
* @param cust
*/
public FlexibleSavingAccount(final double balance,final Customer cust) {
super(balance,cust);
this.cust=cust;
}

public void Withdraw(int amount)
{
 if (amount < 0)
 {
       
  }
  balance = balance - amount;
  }
public void addInterest()
{
balance = balance+(rate * balance)/100 ;
System.out.println("Salary After adding interest rate is :"+balance);
}
public void Display() {
System.out.println(" \n Account no:" + accnum + "\t|\t Balance:" + balance+"\t|\t Name:"+customer.getfname()+" \t|\t Surname:"+customer.getlname());
}
}
