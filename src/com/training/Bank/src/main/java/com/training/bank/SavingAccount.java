/**
 * 
 */
package com.training.bank;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author trainee
 *
 */
public class SavingAccount {
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(Address.class.getName());
public void withdraw(double witdrw,double bal)
{
bal=bal-witdrw;
lps.info("Remaining balanc=INR"+bal);
}
/**
* @param args
*/
public static void main(String[] args) {

}

}
