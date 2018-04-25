/**
 * 
 */
package com.training.repo;

import java.util.List;

import com.training.bankspring.Customers;

/**
 * @author PRATEEK KR
 *
 */
public interface CustomerRepo {
	List<Customers> findAll();

}
