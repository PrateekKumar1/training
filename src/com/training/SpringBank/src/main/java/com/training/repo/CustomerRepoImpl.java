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
Customers custm = new Customers("Azores","Gomes",789,741258963,"Agomes12@xmail.com","D-12","Phallgaum","Jammu","J&K",560019);
custm.add(cust);
}
}
