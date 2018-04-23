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
class Contact {
Address adrs;
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(Contact.class.getName());
private int phone;
private	int mobile;
private String email;
public Contact(final int phone,final int mobile,final String email,final Address adrs)
{
this.phone=phone;
this.mobile=mobile;
this.email=email;
this.adrs=adrs;
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
 * @throws IOException
 */
public static void main(final String[] args) throws IOException {
lps.info("Enter phone number\t");
final int ph1=read.nextInt();
lps.info("Enter mobile number\t");
final int mob1=read.nextInt();
lps.info("Enter email\t");
final String eml1=read.next();
lps.info("Enter flat number\t");
final List<Object> cont = new ArrayList<Object>();
cont.add(eml1);
cont.add(ph1);
cont.add(mob1);
read.close();
}
}
