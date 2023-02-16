package fr.bankSyst;

public class Current extends Client implements Operation {

	private String currentId;
	private double balance;
	private int overdraft;

	// Constructeur
	public Current(String currentId, double balance, int overdraft) {
		this.currentId = currentId;
		this.balance = balance;
		this.overdraft = overdraft;

	}

	public Current(String idC, String name, String currentId, double balance, int overdraft) {
		super(idC, name);
		this.currentId = currentId;
		this.balance = balance;
		this.overdraft = overdraft;
	}

	public Current() {
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n Current Account :" + currentId + "\n Balance : " + balance
				+ "\n Authorized Overdraft : " + overdraft;
	}

	// setters getters
	public String getCurrentId() {
		return currentId;
	}

	public void setCurrentId(String currentId) {
		this.currentId = currentId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(int overdraft) {
		this.overdraft = overdraft;
	}


}
