package com.training.bank;

import java.util.logging.Logger;

/**
 * @author PRATEEK KR
 *
 */
public class Bank {
final static Logger lps=Logger.getLogger(Bank.class.getName());

public static void main(String[] args) {
String name="Bank of India";
lps.info("Welcome to "+name);
	//lps.info("Enter phone number\t");
//	final int ph1=read.nextInt();
	//lps.info("Enter mobile number\t");
	//final int mob1=read.nextInt();
Account arr[]=new SavingAccount[100];
arr[0]=new SavingAccount(100.00);	
	
	}
}
