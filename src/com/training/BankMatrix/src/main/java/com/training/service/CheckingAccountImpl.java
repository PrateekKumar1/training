/**
 * 
 */
package com.training.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.training.model.CheckingAccount;

/**
 * @author PRATEEK KR
 *
 */
public class CheckingAccountImpl implements Account {

public List Withdraw(double amount) {
final CheckingAccount savingAccount = new CheckingAccount();
double balance = savingAccount.getBalance();
balance = balance - amount;
final Date date = new Date();
final List list = new ArrayList();
list.add(date);
list.add("Amount withdraw from current account  is" + amount);
return list;
}

public List Deposit(double amount) {
final CheckingAccount savingAccount = new CheckingAccount();
double balance = savingAccount.getBalance();
balance = balance + amount;
final Date date = new Date();
List list = new ArrayList();
list.add(date);
list.add("Amount Deposit from current account is" + amount);
return list;
}
}
