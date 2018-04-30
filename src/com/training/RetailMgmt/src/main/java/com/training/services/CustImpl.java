/**
 * 
 */

package com.training.services;

import com.training.repo.CustomerRepo;

/**
 * @author PRATEEK KR
 *
 */
public class CustImpl implements CustmServ {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.training.services.CustmServ#addCustmr(int, java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	public int addCustmr(int custid, String custname, String custaddress, String paymode) {
		CustomerRepo custd = null;
		int adddata = custd.addCustmr(custid, custname,custaddress, paymode);
		return adddata;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.training.services.CustmServ#updCustmr(int)
	 */
	public String updCustmr(int goodsId) {
		CustomerRepo custdupd = null;
		String updData = custdupd.updCustmr(custid);
		return updData;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.training.services.CustmServ#rmvCustmr(int)
	 */
	public String rmvCustmr(int goodsId) {
		CustomerRepo custdrmv = null;
		String rmvData = custdrmv.rmvCustmr(custid);
		return rmvData;
	}

	

}
