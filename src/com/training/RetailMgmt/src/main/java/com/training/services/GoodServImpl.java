/**
 * 
 */

package com.training.services;

/**
 * @author PRATEEK KR
 *
 */
public class GoodServImpl implements GoodServ {

	/* (non-Javadoc)
	 * @see com.training.services.GoodServ#addgood(int, java.lang.String, int, double)
	 */
	public int addgood(int id, String name, int qty,double price) {
		GoodsRepo goodrp = null;
		int adddata = goodrp.addgood(id,name, qty,price);
		return addData;
	}
	/* (non-Javadoc)
	 * @see com.training.services.GoodServ#updgood(int)
	 */
	public String updgood(int id) {
		GoodsRepo goodrpupd = null;
		String upddata = goodrpupd.updgood(id);
		return upddata;
	}
	/* (non-Javadoc)
	 * @see com.training.services.GoodServ#rmvgood(int)
	 */
	public String rmvgood(int id) {
		GoodsRepo goodrpdel = null;
		String rmvdata = goodrpdel.rmvgood(id);
		return rmvdata;
	}

	
}
