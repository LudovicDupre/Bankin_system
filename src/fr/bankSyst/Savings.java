package fr.bankSyst;

public class Savings extends Client implements Operation {

	private String savingsId;
	private double balance;
	private int interestsRate;

	// constructeur
	public Savings(String epargneId, double balance, int interestsRate) {
		this.savingsId = epargneId;
		this.balance = balance;
		this.interestsRate = interestsRate;
	}
	
	public Savings(String idC, String name, String epargneId, double balance, int interestsRate) {
		super(idC, name);
		this.savingsId = epargneId;
		this.balance = balance;
		this.interestsRate = interestsRate;
	}

	public Savings() {
	}
	
	@Override
	public String toString() {
		return  super.toString() + "\\n Savings Accounts : \n Balance : " + balance + "\n Interests rate: " + interestsRate;
	}

	// setters getters
	public String getSavingsId() {
		return savingsId;
	}

	public void setSavingsId(String savingsId) {
		this.savingsId = savingsId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getInterestsRate() {
		return interestsRate;
	}

	public void setTauxInteret(int interestsRate) {
		this.interestsRate = interestsRate;
	}


}
