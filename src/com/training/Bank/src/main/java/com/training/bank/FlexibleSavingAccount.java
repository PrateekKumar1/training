/**
 * 
 */
package com.training.bank;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author trainee
 *
 */
public class FlexibleSavingAccount extends Account {
/**
* @param balance
* @param custm
*/
public FlexibleSavingAccount(Double balance, Customer custm) {
super(balance, custm);
}
//final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(SavingAccount.class.getName());
/* (non-Javadoc)
 * @see com.training.bank.Account#setbalance(java.lang.Double)
 */
public void setbalance(Double balance)
{
this.balance=balance;
}
/* (non-Javadoc)
 * @see com.training.bank.Account#getbalance()
 */
public Double getbalance()
{
return balance;
}
/**
 * @param witdrw
 */
public void withdraw(double witdrw)
{
balance=balance-witdrw;
lps.info("Remaining balanc=INR"+balance);
}
public void deposit(double depo)
{
balance=balance+depo;
lps.info("Remaining balanc=INR"+balance);
}


}
