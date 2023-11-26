package batchexction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteExcuteBatch {

	public static void main(String[] args) throws Throwable {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldb?user=root&password=root");
	Statement cs = con.createStatement();

	cs.addBatch("delete from hostel where id=6");
	cs.addBatch("delete from hostel where name='akash' ");
		cs.executeBatch();
		System.out.println("ok");
	}

}
