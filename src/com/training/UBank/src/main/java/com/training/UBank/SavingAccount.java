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
/**
	 * @param custm
	 */
public SavingAccount(Customer custm) {
super(custm);
}
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(SavingAccount.class.getName());
static Double balance;
static Double rate;
static int time;
static Double interest;
static Double totamt;


/**
 * @param args
 */
public static void main(final String[] args) {
lps.info("Enter balance amount");
balance=read.nextDouble();
rate=8.51;
lps.info("Enter time");
time=read.nextInt();
interest=balance*rate*time/100;
totamt=balance+interest;
System.out.println("INR"+totamt);
}
}