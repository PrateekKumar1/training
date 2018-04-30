/**
 * 
 */
package com.training.model;

/**
 * @author PRATEEK KR
 *
 */
public class Supplier {
	private int supplid;
	private String supplname;
	private String suppladdress;
	private int qty;
	private int orderid;
	private double amt;


	public Supplier(int supplid, String supplname, String suppladdress, int qty, int orderid, double amt) {
		super();
		this.supplid = supplid;
		this.supplname = supplname;
		this.suppladdress = suppladdress;
		this.qty = qty;
		this.orderid = orderid;
		this.amt = amt;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return supplid;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.supplid = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return supplname;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.supplname = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return suppladdress;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.suppladdress = address;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}

	/**
	 * @param qty
	 *            the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	/**
	 * @return the orderid
	 */
	public int getOrderid() {
		return orderid;
	}

	/**
	 * @param orderid
	 *            the orderid to set
	 */
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	/**
	 * @return the amt
	 */
	public double getAmt() {
		return amt;
	}

	/**
	 * @param amt
	 *            the amt to set
	 */
	public void setAmt(double amt) {
		this.amt = amt;
	}
}
