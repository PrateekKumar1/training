/**
 * 
 */
package com.training.model;

/**
 * @author PRATEEK KR
 *
 */
public class Customer {
	private int id;
	private String name;
	private String address;
	private String paymode;

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
	 * @param id
	 * @param name
	 * @param address
	 * @param paymode
	 */
	public Customer(int id, String name, String address, String paymode) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.paymode = paymode;
	}

}
