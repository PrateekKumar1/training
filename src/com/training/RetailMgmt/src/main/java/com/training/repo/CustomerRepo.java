/**
 * 
 */
package com.training.repo;

/**
 * @author PRATEEK KR
 *
 */
public interface CustomerRepo {

	/**
	 * @param custid
	 * @param custname
	 * @param custaddress
	 * @param paymode
	 * @return
	 */
	int addCustmr(int custid, String custname, String custaddress, String paymode);
	/**
	 * @param custid
	 * @return
	 */
	String updCustmr(int custid);
	/**
	 * @param custid
	 * @return
	 */
	String rmvCustmr(int custid);

	

}
