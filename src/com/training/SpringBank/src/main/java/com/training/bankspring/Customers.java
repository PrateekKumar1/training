/**
 * 
 */
package com.training.bankspring;

import java.util.Scanner;
import java.util.logging.Logger;


/**
 * @author PRATEEK KR
 *
 */
public class Customers {
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(Customers.class.getName());
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
public Customers(final String fname,final String lname,final int phone,final int mobile,final String email,final String Flatno,final String address,final String city,final String Province_State,int pincodes)
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
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
return "Customer fname=" + fname + ", lname=" + lname + "phone "+phone+",mobile"+mobile+",email"+email+",Flat no."+Flatno+", address=" + address + ",city=" +city+",province"+Province_State+ ",zip code=" +pincodes + "";
}


}
