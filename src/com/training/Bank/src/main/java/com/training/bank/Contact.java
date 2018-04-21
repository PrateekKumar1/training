/**
 * 
 */
package com.training.bank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
/**
 * @author trainee
 *
 */
class Contact extends Bank{
//Adding logger lps for capturing logging information
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(Contact.class.getName());
private int phone;
private	int mobile;
private String email;
/**
 * @param phone
 * @param mobile
 * @param email
 */
public Contact(final int phone,final int mobile,final String email)
{
super();
this.phone=phone;
this.mobile=mobile;
this.email=email;
}
/**
 * @param phone
 */
public void setphone(final int phone){  
this.phone=phone;  
}
/**
 * @return
 */
public int getphone(){  
return phone;  
}  
/**
 * @param mobile
 */
public void setMobile(final int mobile){  
this.mobile=mobile;  
}
/**
 * @return
 */
public int getMobile(){  
return mobile;  
}    
/**
 * @param email
 */
public void setEmail(final String email){  
this.email=email;  
}
/**
 * @return
 */
public String getEmail(){  
return email;  
}  
/**
 * @param args
 */
public static void main(final String[] args) {
lps.info("Enter phone number\t");
final int ph1=read.nextInt();
lps.info("Enter mobile number\t");
final int mob1=read.nextInt();
lps.info("Enter email\t");
final String eml1=read.next();
final List<Object> contact = new ArrayList<Object>();
contact.add(eml1);
contact.add(ph1);
contact.add(mob1);
lps.info(ph1+"\t"+mob1+"\t"+eml1);
read.close();
}

}
