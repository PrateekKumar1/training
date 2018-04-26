package com.training.controller;

import java.util.Scanner;
import java.util.logging.Logger;

import com.training.model.Bank;
import com.training.model.Customers;

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
public static void main( String[] args )
{
int ch;
displayname();
lps.info("Enter the type of account");
lps.info("1>Savings Account\n2>Flexible Account\n3>Checking Account\t");
ch=read.nextInt();
switch(ch)
{
case 1:break;
case 2:break;
case 3:break;
default:lps.info("Invalid selection");
}
}
}
