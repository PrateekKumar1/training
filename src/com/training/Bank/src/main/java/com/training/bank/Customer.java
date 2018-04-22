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
 * @author PRATEEK KR
 *
 */
class Customer {
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(Customer.class.getName());
private String fname;
private String lname;
private int phone;
private	int mobile;
private String email;
private String Flatno;
private	String address;
private String city;
private String Province_State;
private int pincodes;
/**
 * @param balance
 * @param fname
 * @param lname
 * @param phone
 * @param mobile
 * @param email
 * @param Flatno
 * @param address
 * @param city
 * @param Province_State
 * @param pincodes
 */
public Customer(Double balance,String fname,String lname,int phone,int mobile,String email,final String Flatno,final String address,final String city,final String Province_State,int pincodes)
{

this.fname=fname;
this.lname=lname;
this.phone=phone;
this.mobile=mobile;
this.email=email;
this.Flatno=Flatno;
this.address=address;
this.city=city;
this.Province_State=Province_State;
this.pincodes=pincodes;
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
 * @param Flatno
 */
public void setflat(final String Flatno){  
this.Flatno=Flatno;  
}
/**
 * @return
 */
public String getflat(){  
return Flatno;  
}  
/**
 * @param address
 */
public void setaddress(final String address){  
this.address=address;  
}
/**
 * @return
 */
public String getaddress(){  
return address;  
}    
/**
 * @param city
 */
public void setcity(final String city){  
this.city=city;  
}
/**
 * @return
 */
public String getcity(){  
return city;  
}  
/**
 * @param Province_State
 */
public void setprovince(final String Province_State){  
this.Province_State=Province_State;  
}
/**
 * @return
 */
public String getprovince(){  
return Province_State;  
}  	
/**
 * @param pincodes
 * Takes pincode values
 */
public void setpincode(final int pincodes){  
this.pincodes=pincodes;
}
/**
 * @return
 * pin codes
 */
public int getpincode(){  
return pincodes;  
}  	

/**
* @param args
*/
public static void main(String[] args) throws IOException {
lps.info("Enter first name");
final String fname=read.next();
lps.info("Enter last name");
final String lname=read.next();
lps.info("Enter phone number\t");
final int ph1=read.nextInt();
lps.info("Enter mobile number\t");
final int mob1=read.nextInt();
lps.info("Enter email\t");
final String eml1=read.next();
lps.info("Enter flat number\t");
final int flt=read.nextInt();
lps.info("Enter address\t");
final String adrs=read.next();
lps.info("Enter city\t");
final String ctys=read.next();
lps.info("Enter province/state\t");
final String prv=read.next();
lps.info("Enter pincode\t");
final int pin=read.nextInt();
final List<Object> cust = new ArrayList<Object>();
cust.add(fname);
cust.add(lname);
cust.add(eml1);
cust.add(ph1);
cust.add(mob1);
cust.add(flt);
cust.add(adrs);
cust.add(ctys);
cust.add(prv);
cust.add(pin);
lps.info(fname+"\t"+lname+"\t"+ph1+"\t"+mob1+"\t"+eml1+"\t"+flt+"\t"+adrs+"\t"+ctys+"\t"+prv+"\t"+pin);
read.close();
}
}
