package batchexction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PeoplesUpadatePhone {

	public static void main(String[] args) throws Throwable {
	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldb?user=root&password=root");
		Statement stat = con.createStatement();
		stat.addBatch("update hostel set name='riyan' where  id=2");
		stat.addBatch("update hostel set name='farooq' where  id=3");
		
			stat.executeBatch();
		
		

	}

}
