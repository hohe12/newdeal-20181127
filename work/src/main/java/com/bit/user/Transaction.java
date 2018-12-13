package com.bit.user;

import java.sql.Date;

public class Transaction {
	private Date transDate;
	private Date transHour;
	private String status;
	private int transmoney;
	private int balance;
	
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public Date getTransHour() {
		return transHour;
	}
	public void setTransHour(Date transHour) {
		this.transHour = transHour;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTransmoney() {
		return transmoney;
	}
	public void setTransmoney(int transmoney) {
		this.transmoney = transmoney;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
