/**
 * 
 */
package com.training.UBank;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author trainee
 *
 */
public class FlexibleSavingAccount extends Account{
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(CheckingAccount.class.getName());
static Double balance;
static Double rate;
static int time;
static Double interest;
static Double totamt;
/**
* @param custm
*/
public FlexibleSavingAccount(Customer custm) {
super(custm);
}

/**
* @param args
*/
public static void main(final String[] args) {
lps.info("Enter balance amount");
balance=read.nextDouble();
rate=8.75;
lps.info("Enter time");
time=read.nextInt();
interest=balance*rate*time/100;
totamt=balance+interest;
System.out.println("INR"+totamt);
read.close();
}

}
