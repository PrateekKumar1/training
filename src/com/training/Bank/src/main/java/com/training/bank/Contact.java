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
class Contact {
//Adding logger lps for capturing logging information
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(Contact.class.getName());
private int phone;
private	int mobile;
private String email;
public Contact(int phone,int mobile,String email)
{
super();
this.phone=phone;
this.mobile=mobile;
this.email=email;
}
public void setphone(int phone){  
this.phone=phone;  
}
public int getphone(){  
return phone;  
}  
public void setMobile(int mobile){  
this.mobile=mobile;  
}
public int getMobile(){  
return mobile;  
}    
public void setEmail(String email){  
this.email=email;  
}
public String getEmail(){  
return email;  
}  
public static void main(String[] args) {
lps.info("Enter phone number\t");
int ph1=read.nextInt();
lps.info("Enter mobile number\t");
int mob1=read.nextInt();
lps.info("Enter email\t");
String eml1=read.next();
List<Object> contact = new ArrayList<Object>();
contact.add(eml1);
contact.add(ph1);
contact.add(mob1);
}

}
