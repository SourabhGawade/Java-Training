package com.sourabh;
import java.sql.*;


public class DBMain {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		new DBConnection("localhost","tcs_training","root","root");
		Connection conn = DBConnection.getConnection();
		DBOperations dbo = new DBOperations();
		
		//Insert Records in account table
		/*Product prod = new Product("Saving Account", 456, new Date(System.currentTimeMillis()));
		dbo.insert(prod, "account", conn);
		System.out.println("Data Saved..");*/
		
		
		//Insert Records in credit_card table
		/*Product prod1 = new Product("Peminum card", 159357, new Date(System.currentTimeMillis()));
		dbo.insertData(prod1, "credit_card", conn);
		System.out.println("Data Saved..");*/
		
		dbo.retriveData("account", conn);
		
		dbo.retriveData("credit_card", conn);
	}

}