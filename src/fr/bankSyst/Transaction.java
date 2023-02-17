package fr.bankSyst;

public class Transaction {

	// attributs
	Integer amount;
	String date;
	String receivingAccount;
	String sendingAccount;
	public int counter;
	
	
	


	public Transaction(Integer amount, String date, String receivingAccount, String sendingAccount) {
		super();
		this.amount = amount;
		this.date = date;
		this.receivingAccount = receivingAccount;
		this.sendingAccount = sendingAccount;
		counter ++;
	}
	
	
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
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
	
	public int getCounter() {
		return counter;
	}
	
}
