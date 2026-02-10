
package dev.kaldiroglu.dp.creational.ch03.account.solution.solution3;

import dev.kaldiroglu.dp.creational.ch03.account.customer.Customer;

public interface Factory {
	
	Account createNormalAccount();
	
	Account createNormalAccount(Customer owner, double balance);
	
	Account createNegativeAccount(Customer owner, double balance);
	
	Account createFrozenAccount(Customer owner, double balance);
	
}
