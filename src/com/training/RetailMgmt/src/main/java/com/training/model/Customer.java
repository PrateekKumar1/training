/**
 * 
 */
package com.training.model;

/**
 * @author PRATEEK KR
 *
 */
/**
 * @author trainee
 *
 */
public class Customer {
	private int custid;
	private String custname;
	private String custaddress;
	private String paymode;

	/**
	 * @return the id
	 */
	public int getId() {
		return custid;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int custid) {
		this.custid = custid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return custname;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String custname) {
		this.custname = custname;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return custaddress;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String custaddress) {
		this.custaddress = custaddress;
	}

	/**
	 * @return the paymode
	 */
	public String getPaymode() {
		return paymode;
	}

	/**
	 * @param paymode
	 *            the paymode to set
	 */
	public void setPaymode(String paymode) {
		this.paymode = paymode;
	}

		/**
		 * @param custid
		 * @param custname
		 * @param custaddress
		 * @param paymode
		 */
		public Customer(int custid, String custname, String custaddress, String paymode) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custaddress = custaddress;
		this.paymode = paymode;
	}

}
