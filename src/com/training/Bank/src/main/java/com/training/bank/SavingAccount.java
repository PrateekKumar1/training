/**
 * 
 */
package com.training.bank;

import java.util.Scanner;
import java.util.logging.Logger;
/**
 * @author PRATEEK KR
 *
 */
public class SavingAccount extends Account {
//Customer custm;
/**
 * @param balance
 * @param custm
 */
public SavingAccount(Double balance, Customer custm,Double prin,Double rate, Double time) {
super(balance, custm, prin, rate, time);
}
final static Scanner read=new Scanner(System.in);
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
public static void main(String[] args) {
lps.info("Enter balance amount");
final int balance=read.nextInt();
//int ch;

}
}
