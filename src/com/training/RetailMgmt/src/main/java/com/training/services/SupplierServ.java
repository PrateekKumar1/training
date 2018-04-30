/**
 * 
 */
package com.training.services;

/**
 * @author PRATEEK KR
 *
 */
public interface SupplierServ {
	public int addSupplier(int id, String name,	String address, int ordqty, int orderid,double amt);
	public String rmvSupplier(int id);
	public String updSupplier(int id);
}
