/**
 * 
 */

package com.training.model;

/**
 * @author PRATEEK KR
 *
 */
public class Account {
	Bank bnks;
	Customers custm;
	int accno;
	int id = 0;

	Account(int accno,Bank bnks, Customers custm) {
		this.accno=accno;
		this.custm=custm;
		id=id++;
	}

	/**
	 * 
	 */
	public Account() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the bnks
	 */
	public Bank getBnks() {
		return bnks;
	}

	/**
	 * @param bnks the bnks to set
	 */
	public void setBnks(Bank bnks) {
		this.bnks = bnks;
	}

	/**
	 * @return the custm
	 */
	public Customers getCustm() {
		return custm;
	}

	/**
	 * @param custm the custm to set
	 */
	public void setCustm(Customers custm) {
		this.custm = custm;
	}

	/**
	 * @return the accno
	 */
	public int getAccno() {
		return accno;
	}

	/**
	 * @param accno the accno to set
	 */
	public void setAccno(int accno) {
		this.accno = accno;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
