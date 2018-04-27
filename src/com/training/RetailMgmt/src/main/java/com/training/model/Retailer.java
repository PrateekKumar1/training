/**
 * 
 */

package com.training.model;

/**
 * @author PRATEEK KR
 *
 */
public class Retailer {
	private String retailername;
	private String retaileradd;

	/**
	 * @param retailername
	 * @param retaileradd
	 */
	Retailer(String retailername, String retaileradd) {
		this.retailername = retailername;
		this.retaileradd = retaileradd;
	}

	/**
	 * @return the retailername
	 */
	public String getRetailername() {
		return retailername;
	}

	/**
	 * @param retailername
	 *            the retailername to set
	 */
	public void setRetailername(String retailername) {
		this.retailername = retailername;
	}

	/**
	 * @return the retaileradd
	 */
	public String getRetaileradd() {
		return retaileradd;
	}

	/**
	 * @param retaileradd
	 *            the retaileradd to set
	 */
	public void setRetaileradd(String retaileradd) {
		this.retaileradd = retaileradd;
	}
}
