/**
 * 
 */

package com.training.model;

/**
 * @author PRATEEK KR
 *
 */
public class Address {
	private String Flatno;
	private String address;
	private String city;
	private String Province_State;
	private int pincodes;
	/**
	 * @param Flatno
	 * @param address
	 * @param city
	 * @param Province_State
	 * @param pincodes
	 */
	public Address(String Flatno, String address, String city, String Province_State, int pincodes) {
		this.Flatno=Flatno;
		this.address = address;
		this.city = city;
		this.Province_State=Province_State;
		this.pincodes = pincodes;
	}
	/**
	 * @return the flatno
	 */
	public String getFlatno() {
		return Flatno;
	}
	/**
	 * @param flatno the flatno to set
	 */
	public void setFlatno(String flatno) {
		Flatno = flatno;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the province_State
	 */
	public String getProvince_State() {
		return Province_State;
	}
	/**
	 * @param province_State the province_State to set
	 */
	public void setProvince_State(String province_State) {
		Province_State = province_State;
	}
	/**
	 * @return the pincodes
	 */
	public int getPincodes() {
		return pincodes;
	}
	/**
	 * @param pincodes the pincodes to set
	 */
	public void setPincodes(int pincodes) {
		this.pincodes = pincodes;
	}
	
}
