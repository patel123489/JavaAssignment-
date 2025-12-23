package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Student;

public class StudentDao {
	
	Connection cn = null;
	public StudentDao(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","om@1611");
			
		} catch (ClassNotFoundException | SQLException e) {
			
		}
	}
	public int addStudent(Student st) {
		int i =0;
		try {
			PreparedStatement ps = cn.prepareStatement("insert into java values (?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, st.getName());
			ps.setString(3, st.getEmail());
			ps.setString(4, st.getPhone());
			
			i = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
}