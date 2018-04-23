/**
 * 
 */
package com.training.UBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author PRATEEK KR
 *
 */
class Address {
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(Address.class.getName());
private String Flatno;
private	String address;
private String city;
private String Province_State;
private int pincodes;
public Address(final String Flatno,final String address,final String city,final String Province_State,final int pincodes )
{
this.Flatno=Flatno;
this.address=address;
this.city=city;
this.Province_State=Province_State;
this.pincodes=pincodes;
}
/**
 * @return
 */
public String getflat(){  
return Flatno;  
}  
/**
 * @return
 */
public String getaddress(){  
return address;  
}    
/**
 * @return
 */
public String getcity(){  
return city;  
}  
/**
 * @return
 */
public String getprovince(){  
return Province_State;  
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
public static void main(final String[] args) {
//lps.info("Enter flat no.\t");
final String fltn="Ba123";
//lps.info("Enter address\t");
final String addr="Victors";
//lps.info("Enter city\t");
final String city="Mumbai";
//lps.info("Enter province\t");
final String prov="Maharashtra";
//lps.info("Enter pincode\t");
final int pinc=4056789;
final List<Object> adrs = new ArrayList<Object>();
adrs.add(fltn);
adrs.add(addr);
adrs.add(city);
adrs.add(prov);
adrs.add(pinc);
System.out.println(adrs);
read.close();
}

}
