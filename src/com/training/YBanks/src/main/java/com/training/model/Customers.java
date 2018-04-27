/**
 * 
 */

package com.training.model;

/**
 * @author PRATEEK KR
 *
 */
public class Customers {
	private Contact cntc;
	String fname;
	String lname;
	int id = 0;

	Customers(String fname, String lname,Contact cntc) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.cntc=cntc;
		id = id++;
	}

	/**
	 * @return the cntc
	 */
	public Contact getCntc() {
		return cntc;
	}

	/**
	 * @param cntc the cntc to set
	 */
	public void setCntc(Contact cntc) {
		this.cntc = cntc;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname
	 *            the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname
	 *            the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + fname + ", lastName=" + lname + ", customerId=" + id
				+ ", contact=" + cntc + "]";
	}
}
