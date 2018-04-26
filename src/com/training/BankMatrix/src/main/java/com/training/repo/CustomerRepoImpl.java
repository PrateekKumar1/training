/**
 * 
 */

package com.training.repo;

import com.training.model.Customers;
import java.util.ArrayList;
import java.util.List;

/**
 * @author PRATEEK KR
 *
 */
public class CustomerRepoImpl implements CustomerRepo {
	public List<Customers> addCustomer(final Customers custm) {
		final List<Customers> list = new ArrayList();
		list.add(custm);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.training.repo.CustomerRepo#findAll()
	 */
	public List<Customers> findAll() {
		return null;
	}
}
