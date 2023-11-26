package com.controller;

import java.util.Scanner;

import com.dao.PersonCrud;
import com.dto.Person;

public class PersonController {

	public static void main(String[] args) {
		
		Person obj1=new Person();
		
		PersonCrud pcrud=new PersonCrud();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1 for insert  Data");
		System.out.println("2 for Upadate phone number");
		System.out.println("3. for fetch email");
		System.out.println("4 . for delete");
		System.out.println( "5. for fetch by identifier");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name= sc.next();
			System.out.println("Enter phone");
			long phone= sc.nextLong();
			System.out.println("Enter Email");
			String email=sc.next();
			System.out.println("Enter password");
			String  password=sc.next();
			System.out.println("Enter age");
			int age  =sc.nextInt();
			System.out.println("Enter job");
			String job=sc.next();
			System.out.println("Enter Adress");
			String address=sc.next();
			
			Person person=new Person(id,name,phone,email,password, age,job,address);
			
			pcrud.insert(person);
				
		}
		break;
		case 2:{
			System.out.println("Enter email");
			String email=sc.next();
			System.out.println("Enter new Phone number");
			long phone =sc.nextLong();
			Person obj2=new Person();
			PersonCrud pc=new PersonCrud();
			
			obj2.setEmail(email);
			obj2.setPhone(phone);
			pc.updatePhone(obj2);
			
			
			
		}
		break;
		case 3:{
			System.out.println("Enter email");
			String email=sc.next();
			Person obj2=new Person();
			PersonCrud pc=new PersonCrud();
			pc.fetchByEmail(email);
			
		}
		break;
		case 4:{
			System.out.println("Enter Email(pk) to delete");
			String email=sc.next();
			Person obj2=new Person();
			PersonCrud pc=new PersonCrud();
			obj2.setEmail(email);
			pc.delete(obj2);

			
		}
		break;
		case 5:{
			System.out.println("enter email");
			String email=sc.next();
			Person obj2=new Person();
			PersonCrud pc=new PersonCrud();
			obj2.setEmail(email);
			pc.fetchByIdentifer(obj2);

			
		}
		
		}

	}

}
