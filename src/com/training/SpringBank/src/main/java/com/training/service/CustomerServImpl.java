/**
 * 
 */
package com.training.service;
import java.util.List;
import com.training.bankspring.Customers;
import com.training.repo.CustomerRepo;
import com.training.repo.CustomerRepoImpl;

/**
 * @author PRATEEK KR
 *
 */
public class CustomerServImpl implements CustomerServ {
private CustomerRepo custRepo = (CustomerRepo) new CustomerRepoImpl();
/* (non-Javadoc)
 * @see com.training.service.CustomerServ#findAll()
 */
public List<Customers> findAll()
{
		return custRepo.AddAllCustomer();
}
}
