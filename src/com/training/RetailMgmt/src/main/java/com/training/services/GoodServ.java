/**
 * 
 */

package com.training.services;

/**
 * @author PRATEEK KR
 *
 */
public interface GoodServ {
	public int addgood( int id,String name,int qty,double price);
	public String rmvgood(int id);
	public String updgood(int id);
	
}
