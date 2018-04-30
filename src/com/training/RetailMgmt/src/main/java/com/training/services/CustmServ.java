/**
 * 
 */

package com.training.services;

/**
 * @author PRATEEK KR
 *
 */
public interface CustmServ {
	public int addCustmr(int custid, String custname,String custaddress ,String paymode);
	public String rmvCustmr(int custid);
	public String updCustmr(int custid);
}
