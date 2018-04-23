/**
 * 
 */
package com.training.springcore.Apr23;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author PRATEEK KR
 *
 */
class Customer {
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(Customer.class.getName());
private static String fname;
private static String lname;
Customer(String fname,String lname){
this.fname=fname;
this.lname=lname;
}
/**
 * @param args
 */
public static void main(String[] args) {
lps.info("Enter first name and last name\t");
fname=read.next();
lname=read.next();
}

}
