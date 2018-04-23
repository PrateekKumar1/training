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
String fname;
String lname;
long mobile;
String email;
String flatno;
String address;
String city;
int zip;

/**
 * @param fname
 * @param lname
 * @param mobile
 * @param email
 * @param flatno
 * @param address
 * @param city
 * @param zip
 */
public Customer(final String fname, final String lname,final long mobile,final String email, final String flatno,final String address,final String city,final int zip ) {
this.fname = fname;
this.lname = lname;
this.mobile=mobile;
this.email = email;
this.flatno=flatno;
this.address = address;
this.city=city;
this.zip=zip;
}
/**
* @param fname
*
*/
public void setfname(final String fname) {
this.fname = fname;
}
/**
* @return fname
*/
public String getfname() {
return fname;
}
/**
* @param lname
*    
*/
public void setLname(final String lname) {
this.lname = lname;
}
/**
 * @return 
 */
public String getlname() {
return lname;
}
/**
 * @return the mobile
 */
public long getMobile() {
return mobile;
}
/**
 * @param mobile the mobile to set
 */
public void setMobile(final long mobile) {
this.mobile = mobile;
}
/**
 * @return the email
 */
public String getEmail() {
return email;
}
/**
 * @param email
 *            the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the flatno
 */
public String getFlatno() {
return flatno;
}
/**
 * @param flatno the flatno to set
 */
public void setFlatno(final String flatno) {
this.flatno = flatno;
}
/**
 * @return the address
 */
public String getAddress() {
return address;
}
/**
 * @param address
 *            the address to set
 */
public void setAddress(String address) {
this.address = address;
}

/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(final String city) {
this.city = city;
}
/**
 * @return the zip
 */
public int getZip() {
return zip;
}
/**
 * @param zip the zip to set
 */
public void setZip(final int zip) {
this.zip = zip;
}

}