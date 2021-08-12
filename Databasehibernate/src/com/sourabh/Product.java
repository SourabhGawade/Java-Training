package com.sourabh;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Product {
	
	@Id
	@Column(name = "acc_num")
	private int num;
	
	@Column(name = "acc_name")
	private String name;
	
	@Column(name = "acc_expiry_date")
	private Date expiryDate;

	public Product() {

	}

	public Product( int acc_num, String acc_name, Date expiry_date) {
		this.name = acc_name;
		this.num = acc_num;
		this.expiryDate = expiry_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String acc_name) {
		this.name = acc_name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int acc_num) {
		this.num = acc_num;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}
	
	public void setExpiryDate(Date expiry_date) {
		this.expiryDate = expiry_date;
	}
}
