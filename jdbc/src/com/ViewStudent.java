package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewStudent {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver loaded");

			String url = "jdbc:mysql://localhost:3306/Student";
			String username = "root";
			String password = "om@1611";

			Connection cn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established");

			Statement st = cn.createStatement();

			ResultSet rs = st.executeQuery("select*from Java");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString("email");

				System.out.println(id + " " + name + " " + email);
			}

			cn.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}