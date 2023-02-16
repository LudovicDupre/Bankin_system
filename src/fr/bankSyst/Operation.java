package fr.bankSyst;

public interface Operation {
	


	/** withdrawal operation
	 * @param idAccount to withdraw from
	 * @param balance 
	 * @param amount
	 * @return
	 */
	static double withdrawal(double balance, double amount, double overdraft) {
		
		if(balance-amount < overdraft) {
			System.out.println("You cannot withdraw cause your overdraft is riched");
			
			return balance;
		}else {
			return balance-amount;
		}
		
	}
	/** deposit operation
	 * @param x ID du compte
	 * @param y solde avant ajout 
	 * @return balance after operation
	 */
	static double deposit(int idCompte, double balance, double amount) {

		
		
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
