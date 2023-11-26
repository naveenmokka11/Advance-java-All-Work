package com.hibernate.contoller;

import java.util.Scanner;

import javax.persistence.Persistence;

import com.hibernate.dao.UserCrud;
import com.hibernate.dto.User;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		 int id=sc.nextInt();
		 System.out.println("enter first name");
		 String firstname=sc.next();
		 System.out.println("enter last name");
		 String lastname =sc.next();
		 System.out.println("enter email");
		 String email=sc.next();
		 System.out.println("enter password");
		 String password=sc.next();
		 System.out.println("enter gender");
		 String gender=sc.next();
		 System.out.println("enter country");
		 String country=sc.next();
		 System.out.println("enter phone");
		 long phone=sc.nextLong();
		 System.out.println("enter DOB");
		 String DOB=sc.next();
		 System.out.println("enter wallet");
		 double wallet=sc.nextDouble();
		 System.out.println("enter account_created_Date");
		 String account_created_Date=sc.next();
		 System.out.println("enter adress");
		 String adress =sc.next();
		 System.out.println("enter pincode");
		 long pincode=sc.nextLong();
		 System.out.println("enter state");
		 String state=sc.next();
		 System.out.println("enter petname");
		 String petname=sc.next();
		 
		
		User user=new  User(id,firstname,lastname,email,password,gender,country,phone,DOB, wallet,account_created_Date,adress, pincode, state, petname);
		UserCrud usercrud= new UserCrud();
		
			usercrud.saveUser(user);
	
		

	}

}
