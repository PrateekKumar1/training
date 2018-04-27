/**
 * 
 */

package com.training.model;

import java.util.logging.Logger;

/**
 * @author PRATEEK KR
 *
 */
public class Bank
{
	final Logger lps = Logger.getLogger(Bank.class.getName());
	String name = "Y Bank";
	/**
	 * Displaying bank name
	 */
	public void displaybank() {
		lps.info("\t"+name);
	}
}
