package statment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateDatabase {
	public static void main(String[] args) throws Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("loading is done");
		String url="jdbc:mysql://localhost:3306/hosteldb?createDatabaseIfNotExist=true";
		String uname="root";
		String pass="root";
		Connection con = DriverManager.getConnection(url, uname, pass);
		System.out.println("connectioon is established properly");
		Statement stat = con.createStatement();
		//stat.execute("create table  hostel(id int,name varchar(20),age int,adress varchar(225),gender varchar(225))");
		//stat.execute("insert into hostel values(5,'nakul',24,'nlr', 'male')");
		//System.out.println("data inserted");
		//stat.execute("update hostel set name='naveen' where id=5");
		//stat.execute("insert into hostel values(6,'mohan',20,'gtr','male')");
		stat.execute("delete from hostel where id=6");
		
//		ResultSet qu = stat.executeQuery("select * from hostel");
//		while(qu.next()) {
//			System.out.println(qu.getInt("id"));
//			System.out.println(qu.getString("name"));
//			System.out.println(qu.getInt("age"));
//			System.out.println(qu.getString("adress"));
//			System.out.println(qu.getString("gender"));
//			System.out.println("-----------------------------");
//			
//		}
	}

}
