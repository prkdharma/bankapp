package com.dxctraining.entities;

public class Customer {
	private int id;
	private String name;
	private double balance;
	private Account account;
	
	

	Customer(int id,String name,double balance,Account account){
		this.id=id;
		this.name=name;
		this.balance=balance;
		this.account=account;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
