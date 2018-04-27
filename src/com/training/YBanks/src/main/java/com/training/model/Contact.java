/**
 * 
 */
package com.training.model;

/**
 * @author PRATEEK KR
 *
 */
public class Contact {
	int mobile;
	String email;
	int id = 0;
	Address adress;
	Contact(int mobile, String email,Address adress) {
		this.mobile = mobile;
		this.email = email;
		id = id++;
		this.adress=adress;
	}

	/**
	 * @return the mobile
	 */
	public int getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	
}
