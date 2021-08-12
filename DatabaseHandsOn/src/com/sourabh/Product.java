package com.sourabh;

import java.sql.Date;

public class Product {
	
	private String name;
	private int num;
	private Date expiryDate;

	public Product() {

	}

	public Product(String acc_name, int acc_num, Date expiry_date) {
		super();
		this.name = acc_name;
		this.num = acc_num;
		this.expiryDate = expiry_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}
	
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
}
