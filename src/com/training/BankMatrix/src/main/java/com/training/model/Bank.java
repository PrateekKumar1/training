/**
 * 
 */
package com.training.model;

import java.util.logging.Logger;

/**
 * @author PRATEEK KR
 *
 */
public class Bank {
final static Logger lps=Logger.getLogger(Bank.class.getName());
/**
 * Displays name of the bank
 */
public void displayname()
{
final String name="Azores Bank";
lps.info(name);
}
}
