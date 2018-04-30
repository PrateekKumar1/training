/**
 * 
 */

package com.training.model;

/**
 * @author PRATEEK KR
 *
 */
public class Goods {
	private int goodid;
	private String goodname;
	private int qty;
	private double price;
	/**
	 * @param goodid
	 * @param goodname
	 * @param qty
	 * @param price
	 */
	public Goods(int goodid, String goodname, int qty, double price) {
		super();
		this.goodid = goodid;
		this.goodname = goodname;
		this.qty = qty;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return goodid;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.goodid = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return goodname;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.goodname = name;
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
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
