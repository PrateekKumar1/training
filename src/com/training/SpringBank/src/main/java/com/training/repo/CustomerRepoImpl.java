/**
 * 
 */
package com.training.repo;

import java.util.ArrayList;
import java.util.List;

import com.training.bankspring.Customers;

/**
 * @author PRATEEK KR
 *
 */
public class CustomerRepoImpl implements CustomerRepo {
private CustomerRepoImpl customerRepository = new CustomerRepoImpl();

	
	public List<Customer> findAll()
	{
		return customerRepository.AddAllCustomer();
	}
}
