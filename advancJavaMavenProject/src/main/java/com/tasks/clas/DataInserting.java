package com.tasks.clas;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DataInserting {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("loding done");
			}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter mail");
			String mail=sc.next();
			System.out.println("enter phone");
			long phone=sc.nextLong();
			System.out.println("enter password");
			String pass=sc.next();
		
		
		String url="jdbc:mysql://localhost:3306/studentdb";
		String username="root";
		String pwd="root";
		
		try {
			Connection con =DriverManager.getConnection(url, username, pwd);
			System.out.println("connection established sucessfully");
			PreparedStatement sta = con.prepareStatement("insert into student values(?,?,?,?,?)");
			sta.setInt(1, id);
			sta.setString(2, name);
			sta.setString(3, mail);
			sta.setLong(4,phone);
			sta.setString(5, pass);
			sta.execute();
			System.out.println("ok");
			sta.close();
			con.close();
			sc.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
