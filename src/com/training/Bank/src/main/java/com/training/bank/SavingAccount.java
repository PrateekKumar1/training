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
public class SavingAccount extends Account {
/**
 * @param balance
 * @param accno
 */
public SavingAccount(Double balance, Long accno) {
super(balance, accno);
}
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(Address.class.getName());
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
/* (non-Javadoc)
 * @see com.training.bank.Account#setaccno(java.lang.Long)
 */
public void setaccno(Long accno)
{
this.accno=accno;
}
/* (non-Javadoc)
 * @see com.training.bank.Account#getaccno()
 */
public Long getaccno()
{
return accno;
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

/**
* @param args
*/
public static void main(String[] args) {

}

}
