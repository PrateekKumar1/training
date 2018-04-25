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
public List<Customers> AddAllCustomer() {
List<Customers> cust = new ArrayList<Customers>();
Customers custm = new Customers("ram","dafale","Wardha",545458451,"ramdafale@gmail.com");
custm.add(cust);
return custm;
	}
}
