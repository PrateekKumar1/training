/**
 * 
 */
package com.training.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.training.bankspring.*;
import com.training.repo.CustomerRepo;
import com.training.repo.CustomerRepoImpl;
/**
 * @author PRATEEK KR
 *
 */
public class CheckingAccountImpl implements Account {

public List Withdraw(double amount) {
final CheckingAccount savingAccount = new CheckingAccount(null, amount, amount, 0);
double balance = savingAccount.getBalance();
balance = balance - amount;
final Date date = new Date();
final List list = new ArrayList();
list.add(date);
list.add("Amount withdraw from current account  is" + amount);
return list;
}

public List Deposit(double amount) {
final CheckingAccount savingAccount = new CheckingAccount(null, amount, amount, 0);
double balance = savingAccount.getBalance();
balance = balance + amount;
final Date date = new Date();
List list = new ArrayList();
list.add(date);
list.add("Amount Deposit from current account is" + amount);
return list;
}
}
