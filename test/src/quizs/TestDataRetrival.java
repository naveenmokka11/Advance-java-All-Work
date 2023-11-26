package quizs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.mysql.cj.jdbc.Driver;

public class TestDataRetrival {

	public static void main(String[] args) throws Throwable {
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		System.out.println("loading is done.....");
		// establish the connection
		String url = "jdbc:mysql://localhost:3306/custdb?createDatabaseIfNotExist=true";
		String user = "root";
		String pwd = "root";
		Connection con = DriverManager.getConnection(url, user, pwd);
		System.out.println("established connection....");
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();

		Statement cs = con.createStatement();

		PreparedStatement stat = con.prepareStatement("select wallet from customer where email=? and password=? ");
		

		stat.setString(1,email);
		stat.setString(2,password);
		ResultSet res = stat.executeQuery();		
		while(res.next()) {
			al.add(res.getLong("wallet"));
			
		}
		long b=(long) al.get(0);
		System.out.println("do you want to order any item");
		
		
		System.out.println("enter item");
		System.out.println("1 milk-- 50");
		System.out.println("2 ghee   ---20");
		int choice=sc.nextInt();
		
		long milk=60;
		long ghee=20;
		
		switch(choice) {
		case 1:{
			if(b<milk) {
				System.out.println("low balance");
			}
			else {
			long op=b-milk;	
			System.out.println("your got milk");
			PreparedStatement temp = con.prepareStatement("update  customer set wallet="+op+ " where email="+email );
			temp.execute();
			
			}
		}
		
		
		}
		
		
				
	
		con.close();
		stat.close();
		cs.close();
	
	}
	
}


