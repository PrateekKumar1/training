package com.training.bank;

import java.util.logging.Logger;

/**
 * @author PRATEEK KR
 *
 */
public class Bank {
final static Logger lps=Logger.getLogger(Address.class.getName());

public static void main(String[] args) {
String name="Bank of India";
lps.info("Welcome to "+name);
	//lps.info("Enter phone number\t");
//	final int ph1=read.nextInt();
	//lps.info("Enter mobile number\t");
	//final int mob1=read.nextInt();
Account ac1=new Account(1000,12);
	
	
	}
}
