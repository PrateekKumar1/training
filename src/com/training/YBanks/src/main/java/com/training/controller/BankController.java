package com.training.controller;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Bank;

/**
 * @author PRATEEK KR
 *
 */
class BankController 
{
	final Logger lps = Logger.getLogger(BankController.class.getName());
	static Bank banky;
	public static void main(final String[] args) {
		final ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		banky.displaybank();
	}
}
