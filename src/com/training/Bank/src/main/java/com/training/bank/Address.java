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
 *Class 'Address' contains scanner,logger classes.
 *Contains flatno number, address, city, province and pincode.
 */
class Address extends Contact{
final static Scanner read=new Scanner(System.in);
final static Logger lps=Logger.getLogger(Address.class.getName());
private String Flatno;
private	String address;
private String city;
private String Province_State;
private int pincodes;
/**
 * @param Flatno
 * @param address
 * @param city
 * @param Province_State
 * @param pincodes
 */
public Address(final String Flatno,final String address,final String city,final String Province_State,int pincodes)
{
//super(pincodes, pincodes, Province_State);
this.Flatno=Flatno;
this.address=address;
this.city=city;
this.Province_State=Province_State;
this.pincodes=pincodes;
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
public static void main(final String[] args) throws IOException {
lps.info("Enter flat number\t");
final int ph1=read.nextInt();
lps.info("Enter address\t");
final String adrs=read.next();
lps.info("Enter city\t");
final String ctys=read.next();
lps.info("Enter province/state\t");
final String prv=read.next();
lps.info("Enter pincode\t");
final int pin=read.nextInt();
final List<Object> adr = new ArrayList<Object>();
adr.add(ph1);
adr.add(adrs);
adr.add(ctys);
adr.add(prv);
adr.add(pin);
	}

}
