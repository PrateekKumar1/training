/**
 * 
 */
package com.training.service;
import java.util.ArrayList;
import java.util.List;

import com.training.bankspring.SavingAccount;
/**
 * @author PRATEEK KR
 *
 */
public class SavingAccountImpl implements Account {
public List Withdraw(double amount) {
final SavingAccount savingAccount = new SavingAccount();
double balance = savingAccount.getBalance();
balance = balance - amount;
final List list = new ArrayList();
list.add(amount);
System.out.println("Amount withdraw from saving account is" + amount);
return list;
}

public List Deposit(final double amount) {
final SavingAccount sva = new SavingAccount();
double balance = sva.getBalance();
balance = balance + amount;
final List list = new ArrayList();
list.add("Amount Deposit from saving account is" + amount);
System.out.println("Amount Deposit from saving account is" + amount);
return list;
	}
}
