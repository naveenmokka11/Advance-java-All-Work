package com.Contollers;

import com.dto.Employee;
import com.dao.AdressCrud;
import com.dao.EmpCrud;
import com.dto.Adress;

import java.util.Scanner;

import javax.persistence.Persistence;

public class EmpController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		EmpCrud ecd = new EmpCrud();

		Adress ad = new Adress();

		AdressCrud adcd = new AdressCrud();
		System.out.println("1 to perfrom CRUD opertaion on Employyee");
		System.out.println("1 to perfrom CRUD opertaion on  Adresss");
		int mainchoice = sc.nextInt();
		switch (mainchoice) {
		case 1: {
			System.out.println("1 for insert ");
			System.out.println("2 for update ");
			System.out.println("3 for fetch ");
			System.out.println("4 for delete");

			int empchoice = sc.nextInt();
			switch (empchoice) {
			case 1:{
				System.out.println("enter  employee name");
				String name=sc.next();
				emp.setName(name);
				System.out.println("enter  employee gender");
				String gender=sc.next();
				emp.setGender(gender);
				System.out.println("enter  employee phone");
				long phone=sc.nextLong();
				emp.setPhone(phone);
				System.out.println("enter  employee job");
				String job=sc.next();
				emp.setRole(job);
				ecd.InsertIntoEmp(emp);
				
			}

			}

		}
		case 2: {
			System.out.println("1 for insert ");
			System.out.println("2 for update ");
			System.out.println("3 for fetch ");
			System.out.println("4 for delete");

			int adchoice = sc.nextInt();

			switch (adchoice) {
			case 1:{
				System.out.println("Enter State");
				String state=sc.next();
				ad.setState(state);
				System.out.println("Enter district");
				String district=sc.next();
				ad.setDistrict(district);
				System.out.println("enter Street");
				String street=sc.next();
				ad.setStreet(street);
				System.out.println("Enter door no");
				String dono=sc.next();
				ad.setD_no(dono);
				System.out.println("Enter emp id");
				int empid=sc.nextInt();
				
				adcd.insertAdress(ad, empid);
				
				
				
			}

			}

		}

		}

	}

}
