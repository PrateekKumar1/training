/**
 * 
 */
package com.training.UBank;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author PRATEEK KR
 *
 */
abstract class Account {
final static Scanner read=new Scanner(System.in);
static Customer custm;
//SavingAccount sacc;
//FlexibleSavingAccount fsa1;
//CheckingAccount ca1;
static long numb=1;
long accno;
/**
 * @param balance
 * @param custm
 */
public Account(final Customer custm)
{
this.custm=custm;
accno=numb++;
}
/**
 * @return
 */
public long getAccountNumber() {
return accno;
}
/**
 * @param args
 */
public static void main(final String[] args)
{
System.out.println(custm);
int ch;
System.out.print("Select Account type:\n1>Savings account\n2>Checking Account\n3>Flexible saving account\t");
ch=read.nextInt();
switch(ch) {
case 1:break;
case 2:break;
case 3:break;
default:System.out.println("Invalid choice!!!!!!!!");
}
}
}