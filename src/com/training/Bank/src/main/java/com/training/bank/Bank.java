package com.training.bank;

import java.util.logging.Logger;

/**
 * @author PRATEEK KR
 *
 */
public class Bank {
final static Logger lps=Logger.getLogger(Address.class.getName());
String name="Bank of India";
public void bankName()
{
lps.info("Welcome to\t"+name);
}
public static void main(String[] args) {
	}
}
