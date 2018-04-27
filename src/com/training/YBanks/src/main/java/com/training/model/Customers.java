/**
 * 
 */

package com.training.model;

import java.util.List;

/**
 * @author PRATEEK KR
 *
 */
public class Customers {
	private Contact cntc;
	String fname;
	String lname;
	int id = 0;
	private List<Account> accl;
	Customers(String fname, String lname,List<Account> accl,Contact cntc) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.accl=accl;
		this.cntc=cntc;
		id = id++;
	}

	/**
	 * @return the accl
	 */
	public List<Account> getAccl() {
		return accl;
	}

	/**
	 * @param accl the accl to set
	 */
	public void setAccl(List<Account> accl) {
		this.accl = accl;
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
}
