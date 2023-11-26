package preparedstatment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PreparestStatment {

	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("load and rigester is done");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/hosteldb?createDatabaseIfNotExist=true&user=root&password=root");
		System.out.println("connection established properly:");

//		System.out.println("Enter details to insert into hostel table");
//		System.out.println("enter id");
//		int id = sc.nextInt();
//		System.out.println("enter name");
//		String name=sc.next();
//		System.out.println("Enter age");
//		int age=sc.nextInt();
//		System.out.println("Enter gender");
//		String gender=sc.next();
//		System.out.println("enter phone");
//		 long phone=sc.nextLong();
		// table creation
//		PreparedStatement ps = con.prepareStatement(
//				"create table If Not Exists hostel(id int,name varchar(220),age int,gender varchar(225),phone bigint)");

		// data insertation
//		PreparedStatement presta = con.prepareStatement("insert into hostel values (?,?,?,?,?)");
//		
//			presta.setInt(1, id);
//			presta.setString(2,name);
//			presta.setInt(3, age);
//			presta.setString(4, gender);
//			presta.setLong(5, phone);
//			
//			presta.execute();

		// update
//		System.out.println("Upadting phone based on id");
//		System.out.println("enter phone");
//		long phone = sc.nextLong();
//		System.out.println("Enter id");
//		int id=sc.nextInt();
//		PreparedStatement ps = con.prepareStatement("update hostel set phone=? where id=?");
//		
//		ps.setLong(1, phone);
//		ps.setInt(2, id);
//		ps.execute();
//		System.out.println("upadtion is sucess");
//		
		//delete
//		System.out.println("Enter id to delete record");
//		int id=sc.nextInt();
//		PreparedStatement ps = con.prepareStatement("delete from hostel where id=?");
//		ps.setInt(1, id);
//		ps.execute();
//		System.out.println("sucessfully deleted");
		
		
		//retrive
		
		PreparedStatement ps = con.prepareStatement("select * from hostel")	;	
		ResultSet q = ps.executeQuery();
		while(q.next()) {
			System.out.println(q.getInt("id"));
			System.out.println(q.getString("name"));
			System.out.println(q.getInt("age"));
			System.out.println(q.getString("gender"));
			System.out.println(q.getLong("phone"));
			System.out.println("-------------------------");
			
		}
		ps.execute();

	}

}
