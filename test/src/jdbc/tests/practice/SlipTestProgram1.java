package jdbc.tests.practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.ldap.BasicControl;

public class SlipTestProgram1 {

	public static void main(String[] args) throws Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/studentdb";
		String uname="root";
		String pwd="root";
	
		Connection con = DriverManager.getConnection(url, uname, pwd);
		// delete a record where name ends with 'a'
		
				PreparedStatement ps = con.prepareStatement("select * from student where name like '%a%'");
				ResultSet res = ps.executeQuery();
				
				while(res.next()) {
				System.out.println(res.getInt("id"));
				System.out.println(res.getString("name"));
				System.out.println(res.getString("email"));
				System.out.println(res.getLong("phone"));
				System.out.println(res.getString("password"));
				System.out.println("--------------completed----------");
				}
				
	}

}
