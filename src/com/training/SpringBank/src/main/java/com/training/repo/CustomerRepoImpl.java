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
public List<Customers> addCustomer(final Customers custm) {
		// TODO Auto-generated method stub
final List<Customers> list = new ArrayList();
list.add(custm);
return list;
}

/* (non-Javadoc)
 * @see com.training.repo.CustomerRepo#findAll()
 */
public List<Customers> findAll() {
	// TODO Auto-generated method stub
	return null;
}
}
