/**
 * 
 */
package com.training.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author trainee
 *
 */
class Customer extends Contact{
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(Address.class.getName());
private String fname;
private String lname;
/**
 * @param fname
 * @param lname
 */
public Customer(String fname,String lname)
{
this.fname=fname;
this.lname=lname;
}
/**
 * @param fname
 */
public void setfname(String fname)
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
public void setlname(String lname)
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
public static void main(String[] args) {

}
List<String> names=new ArrayList<String>();
lps.info("Enter address\t");
final String adrs=read.next();
lps.info("Enter city\t");
final String ctys=read.next();

}