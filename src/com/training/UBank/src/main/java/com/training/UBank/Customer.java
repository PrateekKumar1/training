/**
 * 
 */
package com.training.UBank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
/**
 * @author PRATEEK KR
 *
 */
class Customer {
static Contact cntc;
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(Customer.class.getName());
private String fname;
private String lname;
/**
 * @param fname
 * @param lname
 */
public Customer(final Double balance,final String fname,final String lname,Contact cntc)
{

this.fname=fname;
this.lname=lname;
this.cntc=cntc;
}

/**
 * @param fname
 */
public void setfname(final String fname)
{
this.fname=fname;
}
/**
 * @return
 */
public String getfname()
{
return fname;
}
/**
 * @param lname
 */
public void setlname(final String lname)
{
this.lname=lname;
}
/**
 * @return
 */
public String getlname()
{
return lname;
}
/**
* @param args
*/
public static void main(final String[] args) throws IOException {
lps.info("Enter first name");
final String fname=read.next();
lps.info("Enter last name");
final String lname=read.next();
final List<Object> cust = new ArrayList<Object>();
cust.add(fname);
cust.add(lname);
cust.add(cntc);
lps.info(fname+"\t"+lname+"\t"+cntc);
read.close();
}
}