package com.Contollers;

import java.util.Scanner;

import javax.persistence.Persistence;

import com.dao.PassportCrud;
import com.dao.PersonCrud;
import com.dto.Passport;
import com.dto.Person;

public class PersonController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		Passport pass = new Passport();
		PersonCrud pcd = new PersonCrud();
		PassportCrud passcd = new PassportCrud();
		System.out.println(" 1 fo perfom CRUD OPerations on Person");
		System.out.println(" 2 fo perfom CRUD OPerations on Passport");
		System.out.println(" 3 fo perfom fetch OPerations on Passport");

		
		int mainchoice = sc.nextInt();
		switch (mainchoice) {
		case 1: {
			//int personchoice = sc.nextInt();
			//switch (personchoice) {
			//case 1: {
				System.out.println("enter person name");
				String name=sc.next();
				
				p.setName(name);
				System.out.println("enter phone");
				long phone=sc.nextLong();
				p.setPhone(phone);
				System.out.println("enter email");
				String email=sc.next();
				p.setEmail(email);
				System.out.println("Enter gender");
				String gender=sc.next();
				p.setGender(gender);
				pcd.insertintoPerson(p);
			//}

			}
		//}
		case 2: {
			System.out.println("Enter pass name");
			String name=sc.next();
			pass.setName(name);
			System.out.println("Enter phone");
			long phone=sc.nextLong();
			pass.setPhone(phone);
			System.out.println("Enter Adress");
			String adress=sc.next();
			pass.setAddress(adress);
			System.out.println("Enter person id for mapping");
			int id=sc.nextInt();
			passcd.insertIntoPassport(pass,id);
		

		}
		case 3:{
			System.out.println("Enter passport no");
			int id=sc.nextInt();
			passcd.fetchPassport(id);
		}

		}

	}

}
