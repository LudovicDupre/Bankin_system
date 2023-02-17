package fr.bankSyst;

public class Transaction {

	// attributs
	double amount;
	String date;
	String receivingAccount;
	String sendingAccount;

	
	
	public Transaction(double amount, String date, String receivingAccount, String sendingAccount) {
		super();
		this.amount = amount;
		this.date = date;
		this.receivingAccount = receivingAccount;
		this.sendingAccount = sendingAccount;

	}
	public Transaction(double amount, String date, String receivingAccount) {
		super();
		this.amount = amount;
		this.date = date;
		this.receivingAccount = receivingAccount;

	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getReceivingAccount() {
		return receivingAccount;
	}
	public void setReceivingAccount(String receivingAccount) {
		this.receivingAccount = receivingAccount;
	}
	public String getSendingAccount() {
		return sendingAccount;
	}
	public void setSendingAccount(String sendingAccount) {
		this.sendingAccount = sendingAccount;
	}
	
	
	@Override
	public String toString() {
		return "[amount=" + amount + ", date=" + date + ", receivingAccount=" + receivingAccount
				+ ", sendingAccount=" + sendingAccount +" ]";
	}
	
}
