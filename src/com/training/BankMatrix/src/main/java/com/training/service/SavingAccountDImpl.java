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
public class SavingAccountDImpl {
Map<String, SavingsAccount> smap = new HashMap<String, SavingsAccount>();
public void AddSavingAccount(SavingsAccount sa) {
smap.put(sa.getaccnumb(),sa);
	}
}
