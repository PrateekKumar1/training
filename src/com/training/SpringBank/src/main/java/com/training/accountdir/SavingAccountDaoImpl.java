/**
 * 
 */
package com.training.accountdir;

import java.util.HashMap;
import java.util.Map;
import com.training.bankspring.SavingAccount;

/**
 * @author PRATEEK KR
 *
 */
public class SavingAccountDaoImpl {
Map<String, SavingAccount> smap = new HashMap<String, SavingAccount>();
public void AddSavingAccount(SavingAccount sa) {
smap.put(sa.getAccountNumber(),sa);
	}
}
