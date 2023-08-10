package model.entities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) {
		if(withDrawLimit < amount) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if(balance < amount) {
			throw new DomainException("Withdraw error: Not enough balance");
		}

		this.balance -= amount;
	}
	
	@Override
	public String toString() {
		return "New balance: " +
				String.format("%.2f", balance);
	}
}
	