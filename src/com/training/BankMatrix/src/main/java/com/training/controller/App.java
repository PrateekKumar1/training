package com.training.controller;

import java.util.Scanner;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Bank;
import com.training.model.CheckingAccount;
import com.training.model.Customers;
import com.training.model.FlexibleAccount;
import com.training.model.SavingsAccount;

/**
 * @author PRATEEK KR
 *
 */
public class App extends Bank {
	final static Scanner read = new Scanner(System.in);
	final static Logger lps = Logger.getLogger(App.class.getName());
	

	public static void main(String[] args) {
		Bank bnks;
		Customers cust;
		FlexibleAccount fa = new FlexibleAccount();
		SavingsAccount sva = new SavingsAccount();
		CheckingAccount chacc = new CheckingAccount();
		int choice;
		int choice2;
		displayname();
		lps.info("\nCustomer Details\n");
		ApplicationContext actx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SavingsAccount e=(SavingsAccount)actx.getBean("e");
		lps.info("\n"+e.getAccnumb()+"|"+e.getBalance()+"|"+e.getCust());
		lps.info("Enter the type of account");
		lps.info("\n1>Savings Account\n2>Flexible Account\n3>Checking Account\t");
		choice = read.nextInt();
		switch (choice) {
		case 1:
			lps.info("Savings Account");
			lps.info("Enter the operation you want to perform");
			lps.info("\n1>Withdrwal\n2>Deposit\t");
			choice2 = read.nextInt();
			switch (choice2) {
			case 1:
				double sbalw = read.nextDouble();
				sva.Wdrawamt(sbalw);
				break;
			case 2:
				double sdepoa = read.nextDouble();
				sva.DepoAmt(sdepoa);
				break;
			default:
				lps.info("Invalid operation selection!!!");
				break;
			}
			break;
		case 2:
			lps.info("Flexible Account");
			lps.info("Enter the operation you want to perform");
			lps.info("\n1>Withdrwal\n2>Deposit\t");
			choice2 = read.nextInt();
			switch (choice2) {
			case 1:
				double fbalw = read.nextDouble();
				fa.Wdrawamt(fbalw);
				break;
			case 2:
				double fdepoa = read.nextDouble();
				fa.DepoAmt(fdepoa);
				break;
			default:
				lps.info("Invalid operation selection!!!");
				;
				break;
			}
			break;
		case 3:
			lps.info("Checking Account");
			lps.info("Enter the operation you want to perform");
			lps.info("\n1>Withdrwal\n2>Deposit\t");
			choice2 = read.nextInt();
			switch (choice2) {
			case 1:
				double cbalw = read.nextDouble();
				chacc.Wdrawamt(cbalw);
				break;
			case 2:
				double cdepoa = read.nextDouble();
				chacc.DepoAmt(cdepoa);
				break;
			default:
				lps.info("Invalid operation selection!!!");
				break;
			}
			break;
		default:
			lps.info("Invalid Bank account selection selection");
			break;
		}
		read.close();
	}
}
