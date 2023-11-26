package com.Contoller;

import java.util.Scanner;

import com.dao.PassportCrud;
import com.dao.PersonCrud;
import com.dto.Passport;
import com.dto.Person;

public class PersonContoller {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// passport details
//		System.out.println("passport name");
//		String passname = sc.next();
//		System.out.println("passport phone");
//		long passphone = sc.nextLong();
//		System.out.println("passport adress");
//		String adress = sc.next();
//
//		Passport pass = new Passport(passname, passphone, adress);
//		PassportCrud passcd = new PassportCrud();
//
//		passcd.insertPassport(pass);
//
//		// person
//		System.out.println("Enter Name");
//		String name = sc.next();
//		System.out.println("Enter phone");
//		long phone = sc.nextLong();
//		System.out.println("Enter Email");
//		String email = sc.next();
//		System.out.println("Enter Gender");
//		String gender = sc.next();
//
//		Person person = new Person(name, email, phone, gender);
//
//		person.setPassport(pass);
//
		//PersonCrud personcd=new PersonCrud();
//		
//		personcd.InsertPerson(person,pass.getPass_no());
//	
		//personcd.retrive(1);
		
		Person person=new Person();
		PersonCrud personcd=new PersonCrud();
		Passport passport=new Passport();
		PassportCrud passcd=new PassportCrud();

	}

}
