package com.dxctraining.entities;


public class Account {
	private double balance;
	private String pancard;
	
	 public Account(double balance,String Pancard) {
		this.balance=balance;
		this.pancard=Pancard;
		
	}
	
	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public double getBalance() {
		return balance;
	}

	void setBalance( double balance){
		this.balance=balance;		
	}
	
	double getbalance() {
		return balance;
		
	}
	
}
