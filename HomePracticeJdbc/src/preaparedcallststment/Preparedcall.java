package preaparedcallststment;

import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Preparedcall {

	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		System.out.println("loading is done");

		String url = "jdbc:mysql://localhost:3306/hosteldb";

		FileInputStream f = new FileInputStream("app.properties");
		Properties p = new Properties();
		p.load(f);
		Connection con = DriverManager.getConnection(url, p);
		System.out.println("connection established");
		System.out.println("Inserting date into hostel table");
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("age");
		int age = sc.nextInt();
		System.out.println("enter gender");
		String gender = sc.next();
		System.out.println("Enter phone");
		long phone = sc.nextLong();

		CallableStatement pcl = con.prepareCall("call datainsert(?,?,?,?,?)");
		
		pcl.setInt(1, id);
		pcl.setString(2, name);
		pcl.setInt(3, age);
		pcl.setString(4, gender);
		pcl.setLong(5, phone);
		
		int res = pcl.executeUpdate();
		System.out.println(res+"row inseted");

	

	}

}
