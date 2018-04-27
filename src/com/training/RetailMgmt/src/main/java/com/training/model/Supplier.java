/**
 * 
 */
package com.training.model;

/**
 * @author PRATEEK KR
 *
 */
public class Supplier {
	private int id;
	private String name;
	private String address;
	private int qty;
	private int orderid;
	private double amt;

	/**
	 * @param id
	 * @param name
	 * @param address
	 * @param qty
	 * @param orderid
	 * @param amt
	 */
	public Supplier(int id, String name, String address, int qty, int orderid, double amt) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.qty = qty;
		this.orderid = orderid;
		this.amt = amt;
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

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
