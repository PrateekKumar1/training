/**
 * 
 */

package com.training.service;

import java.util.ArrayList;
import java.util.List;

import com.training.model.SavingsAccount;

/**
 * @author PRATEEK KR
 *
 */
public class SavingAccountImpl implements Account {
public List Withdraw(double amount) {
final SavingsAccount savingAccount = new SavingsAccount();
double balance = savingAccount.getBalance();
balance = balance - amount;
final List list = new ArrayList();
list.add(amount);
System.out.println("Amount withdraw from saving account is" + amount);
return list;
}

public List Deposit(final double amount) {
final SavingsAccount sva = new SavingsAccount();
double balance = sva.getBalance();
balance = balance + amount;
final List list = new ArrayList();
list.add("Amount Deposit from saving account is" + amount);
System.out.println("Amount Deposit from saving account is" + amount);
return list;
	}
}
