package fr.bankSyst;

public interface Operation {
	
/** transfer of an amount
 * @param idAccount withdrawal from this account
 * @param idAccount2 deposit from this account
 * @param amount moved
 * @param balance original balance
 * @return balance after operation
 */
	static double transfer(String idAccount , String idAccount2, double amount, double balance) {
		
		return balance;
	}
	/** withdrawal operation
	 * @param idAccount to withdraw from
	 * @param balance 
	 * @param amount
	 * @return
	 */
	static double withdrawal(double balance, double amount) {
		
		return balance-amount;
	}
	/** deposit operation
	 * @param x ID du compte
	 * @param y solde avant ajout 
	 * @return balance after operation
	 */
	static double deposit(double balance, double amount) {
		
		return balance+amount;
	}
	/**
	 * @param balance of the account
	 * @return string to print 
	 */
	static String balance(double balance) {
		return "Balance of your account : "+ balance;
	}
}
