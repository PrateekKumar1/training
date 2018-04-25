/**
 * 
 */
package com.training.model;
/**
 * @author PRATEEK KR
 *
 */
public class Customer {
private String fname;
private String lname;
public Customer(final String fname, final String lname) {
super();
this.fname = fname;
this.lname = lname;
}
/**
 * @return 
 */
public String getfname() {
return fname;
}
/**
 *  @param 
 */
public void setfname(final String fname) {
this.fname = fname;
}
/**
 * @return 
 */
public String getlname() {
return lname;
}
/**
 * @param
 */
public void setlname(final String lname) {
this.lname = lname;
}
public Customer() {
}
}
