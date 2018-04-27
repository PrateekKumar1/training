/**
 * 
 */

package com.training.model;

import java.util.logging.Logger;

/**
 * @author PRATEEK KR
 *
 */
public class Statement {
final static Logger lps = Logger.getLogger(Statement.class.getName());
public static void main (String[] args) 
{
Account accnmb=new Account();
lps.info(accnmb.getBnks()+"\n"+accnmb.getAccno()+"|"+accnmb.getCustm());
}
}
