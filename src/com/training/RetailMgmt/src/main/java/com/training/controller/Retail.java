package com.training.controller;

import java.util.logging.Logger;

import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Retailer;
import com.training.model.Supplier;

/**
 * @author PRATEEK KR
 *
 */
public class Retail 
{
	final static Logger lps = Logger.getLogger(Retail.class.getName());
	Customer cust;
	Goods gds;
	Supplier supl;
	Retailer rtl;
    public static void main( String[] args )
    {
    	lps.info("-------------------------\n\t\tMarket\t\t\n-------------------------");
    	lps.info("\n1>Add customer\n2>Add Goods\3>Add supplier\4>Search Customer\n5>");
    }
}
