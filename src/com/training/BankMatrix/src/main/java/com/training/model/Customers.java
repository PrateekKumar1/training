/**
 * 
 */
package com.training.model;

import java.util.logging.Logger;
/**
 * @author PRATEEK KR
 *
 */
public class Customers {
final static Logger lps=Logger.getLogger(Customers.class.getName());
private String fname;
private String lname;
private	int mobile;
private String email;
private String Flatno;
private	String address;
private String city;
private String Province_State;
private int pincodes;
/**
 * @return the fname
 */
public String getFname() {
	return fname;
}
/**
 * @param fname the fname to set
 */
public void setFname(final String fname) {
	this.fname = fname;
}
/**
 * @return the lname
 */
public String getLname() {
	return lname;
}
/**
 * @param lname the lname to set
 */
public void setLname(final String lname) {
	this.lname = lname;
}
/**
 * @return the mobile
 */
public int getMobile() {
	return mobile;
}
/**
 * @param mobile the mobile to set
 */
public void setMobile(final int mobile) {
	this.mobile = mobile;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(final String email) {
	this.email = email;
}
/**
 * @return the flatno
 */
public String getFlatno() {
	return Flatno;
}
/**
 * @param flatno the flatno to set
 */
public void setFlatno(final String flatno) {
	Flatno = flatno;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(final String address) {
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
 * @return the province_State
 */
public String getProvince_State() {
	return Province_State;
}
/**
 * @param province_State the province_State to set
 */
public void setProvince_State(final String province_State) {
	Province_State = province_State;
}
/**
 * @return the pincodes
 */
public int getPincodes() {
	return pincodes;
}
/**
 * @param pincodes the pincodes to set
 */
public void setPincodes(final int pincodes) {
	this.pincodes = pincodes;
}
/**
 * displaying data
 */
void display() {
lps.info(fname+"\t"+lname+"\t"+mobile+"\t"+email+"\t"+Flatno+"\t"+address+"\t"+city+"\t"+Province_State+"\t"+pincodes+"");	
}
}
