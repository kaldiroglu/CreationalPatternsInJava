
package dev.kaldiroglu.dp.creational.ch03.account.staticFactory;

import dev.kaldiroglu.dp.creational.ch03.account.customer.Customer;

public class Test {

	public static void main(String[] args) {
		// Normal credit account
		Account accountInNormalState = Account.createNormalAccount("1", 1000, 1000, new Customer("Ali"));
		System.out.println("Account in frozen state: " + accountInNormalState);

		// Negative credit account
		Account accountInNegativeState = Account.createNegativeAccount("2", -500, 1000, new Customer("Zeynep"));
		System.out.println("Account in frozen state: " + accountInNegativeState);

		// Frozen account
		Account accountInFrozenState =  Account.createFrozenAccount("3", -1000, 1000, new Customer("Metin"));
		System.out.println("Account in frozen state: " + accountInFrozenState);
	}
}
