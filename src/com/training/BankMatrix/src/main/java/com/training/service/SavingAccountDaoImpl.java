/**
 * 
 */
package com.training.service;

import java.util.HashMap;
import java.util.Map;

import com.training.model.SavingsAccount;


/**
 * @author PRATEEK KR
 *
 */
public class SavingAccountDaoImpl {
Map<String, SavingsAccount> smap = new HashMap<String, SavingsAccount>();
public void AddSavingAccount(SavingsAccount sa) {
smap.put(sa.getAccnumb(),sa);
	}
}
