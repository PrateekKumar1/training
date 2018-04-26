package com.training.controller;

import java.util.Scanner;
import java.util.logging.Logger;

import com.training.model.Bank;
import com.training.model.CheckingAccount;
import com.training.model.Customers;
import com.training.model.FlexibleAccount;
import com.training.model.SavingsAccount;

/**
 * @author PRATEEK KR
 *
 */
public class App extends Bank
{
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(App.class.getName());
Bank bnks;
Customers cust;
static FlexibleAccount fa;
static SavingsAccount sva;
static CheckingAccount chacc;
public static void main( String[] args )
{
int choice;
int choice2;
displayname();
lps.info("Enter the type of account");
lps.info("1>Savings Account\n2>Flexible Account\n3>Checking Account\t");
choice=read.nextInt();
switch(choice)
{
case 1:lps.info("Savings Account");
lps.info("Enter the operation you want to perform");
lps.info("1>Withdrwal\n2>Deposit\t");
choice2=read.nextInt();
	switch(choice2) {
	case 1:double balw=read.nextDouble();
			sva.Wdrawamt(balw);
		break;
	case 2:double depoa=read.nextDouble();
	        sva.DepoAmt(depoa);
		break;
	default:lps.info("Invalid operation selection!!!");
	break;
	}
break;
case 2:lps.info("Flexible Account");
lps.info("Enter the operation you want to perform");
lps.info("1>Withdrwal\n2>Deposit\t");
choice2=read.nextInt();
	switch(choice2) {
	case 1:double balw=read.nextDouble();
	fa.Wdrawamt(balw);
		break;
	case 2:double depoa=read.nextDouble();
    fa.DepoAmt(depoa);
		break;
	default:lps.info("Invalid operation selection!!!");;
	break;
	}
	break;
case 3:lps.info("Checking Account");
lps.info("Enter the operation you want to perform");
lps.info("1>Withdrwal\n2>Deposit\t");
choice2=read.nextInt();
	switch(choice2) {
	case 1:double balw=read.nextDouble();
	chacc.Wdrawamt(balw);
		break;
	case 2:double depoa=read.nextDouble();
	chacc.DepoAmt(depoa);
		break;
	default:lps.info("Invalid operation selection!!!");
	break;
	}
	break;
default:lps.info("Invalid Bank account selection selection");
break;
}
read.close();
}
}
