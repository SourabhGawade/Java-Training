package com.sourabh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBOperations {

	void insertData(Product prod, String tableName, Connection conn) throws SQLException {
		String query = "INSERT INTO " + tableName + " VALUES(?,?,?)";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, prod.getNum());
		statement.setString(2, prod.getName());
		statement.setDate(3, prod.getExpiryDate());
		statement.executeUpdate();
	}

	void retriveData(String tableName, Connection conn) throws SQLException {
		PreparedStatement statement = conn.prepareStatement("select * from " + tableName);
		ResultSet rs = statement.executeQuery();
		ArrayList<Product> data = new ArrayList<Product>();
		while (rs.next()) {
				data.add(new Product(rs.getString(2), rs.getInt(1),rs.getDate(3)));
		}
		displayData(data);
	}
	
	void displayData(ArrayList<Product> data) {
		data.forEach( row -> {
			System.out.print(row.getNum());
			System.out.print("\t"+row.getName());
			System.out.print("\t"+row.getExpiryDate());
			System.out.println();
		});
	}
}
