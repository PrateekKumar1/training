/**
 * 
 */

package com.training.services;

/**
 * @author PRATEEK KR
 *
 */
public class SupplierServImpl implements SupplierServ {

	/* (non-Javadoc)
	 * @see com.training.services.SupplierServ#addSupplier(int, java.lang.String, java.lang.String, int, int, double)
	 */
	public int addSupplier(int id, String name, String address, int ordqty, int orderid, double amt) {
	SupplierRepo supplrp = null;
	int adddata = supplrp.addSupplier(id, name,	address,ordqty, orderid, amt);
		return adddata;
	}
	/* (non-Javadoc)
	 * @see com.training.services.SupplierServ#updSupplier(int)
	 */
	public String updSupplier(int id) {
		SupplierRepo supplupd = null;
		String uddata = supplupd.updSupplier(id);
		return upddata;
	}
	/* (non-Javadoc)
	 * @see com.training.services.SupplierServ#rmvSupplier(int)
	 */
	public String rmvSupplier(int id) {
		SupplierRepo supplrmv = null;
		String rmvda = supplrmv.rmvSupplier(id);
		return rmvda;
	}



}
