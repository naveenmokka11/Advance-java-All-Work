package com.hibernate.contoller;

import com.hibernate.dao.EmpCrud;
import com.hibernate.dto.Employee;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 for insert operation");
		System.out.println("2 for delete operation");
		System.out.println("3 for retrive operation");
		System.out.println("4 for update operation");

		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter job");
			String job = sc.next();
			System.out.println("Enter phone");
			long phone = sc.nextLong();
			System.out.println("Enter password");
			String pass = sc.next();

			Employee emp = new Employee(id, name, job, phone, pass);
			EmpCrud cd = new EmpCrud();
			cd.inset(emp);
		}
		break;
		case 2: {
			System.out.println("enter primary key");
			int id = sc.nextInt();
			Employee emp = new Employee();
			EmpCrud cd = new EmpCrud();
			cd.delete(id);
		}
		break;
		case 3: {
			System.out.println("1 Fetch record based on id");
			System.out.println("2 Fetch record based on name");
			System.out.println("3 Fetch record based on job");
			System.out.println("4 Fetch record based on phone");
			System.out.println("5 Fetch record based on Password");

			int retrivechoice = sc.nextInt();
			switch (retrivechoice) {
			case 1: {
				Employee emp = new Employee();
				EmpCrud cd = new EmpCrud();
				System.out.println("Enter id");
				int id = sc.nextInt();
				cd.fetch(id);
			}
			break;
			case 2: {
				System.out.println("Enter Name");
				String name = sc.next();
				Employee emp = new Employee();
				EmpCrud cd = new EmpCrud();
				try {
					cd.getRecordByName(name);
				} catch (Exception e) {
					System.out.println("Data not found");
				}

			}
			break;
			case 3:{
				System.out.println("Enter job");
				String job=sc.next();
				Employee emp = new Employee();
				EmpCrud cd = new EmpCrud();
				try {
					cd.getRecordByJob(job);
				} catch (Throwable e) {
					System.out.println("Data not found");				}

				
				
			}
			break;
			case 4:{
				System.out.println("Enter Phone");
				long phone=sc.nextLong();
				Employee emp = new Employee();
				EmpCrud cd = new EmpCrud();
				try {
					cd.getRecordByPhone(phone);
				} catch (Throwable e) {
					System.out.println("Data not Found");
				}
				
				
			}
			break;
			case 5:{
				System.out.println("Enter Password");
				String password=sc.next();
				Employee emp = new Employee();
				EmpCrud cd = new EmpCrud();
				try {
					cd.getRecordByPassword(password);
				} catch (Throwable e) {
					System.out.println("Data not found");				
					}
			}
			

			}

		}
		break;
		case 4: {
			System.out.println("1 for change name");
			System.out.println("2 for change password");
			System.out.println("3 for change phone");
			System.out.println("4 for change job");

			int changechoice = sc.nextInt();

			switch (changechoice) {
			case 1: {

				Employee emp = new Employee();
				EmpCrud cd = new EmpCrud();
				System.out.println("enter id");
				int id = sc.nextInt();
				emp.setId(id);
				System.out.println("Enter name");
				String name = sc.next();
				emp.setName(name);
				cd.updateName(emp);

			}
			break;
			case 2: {

				Employee emp = new Employee();
				EmpCrud cd = new EmpCrud();
				System.out.println("enter id");
				int id = sc.nextInt();
				emp.setId(id);
				System.out.println("Enter password");
				String pass = sc.next();
				emp.setPassword(pass);
				cd.updatePassword(emp);

			}
			break;
			case 3: {
				Employee emp = new Employee();
				EmpCrud cd = new EmpCrud();
				System.out.println("enter id");
				int id = sc.nextInt();
				emp.setId(id);
				System.out.println("Enter Phone");
				long phone = sc.nextLong();
				emp.setPhone(phone);
				cd.updatePhone(emp);

			}
			break;
			case 4:{
				Employee emp = new Employee();
				EmpCrud cd = new EmpCrud();
				System.out.println("enter id");
				int id = sc.nextInt();
				emp.setId(id);
				System.out.println("Enter job");
				String job = sc.next();
				emp.setJob(job);
				cd.updatePhone(emp);

				
			}
			break;

			}

		}

		}
	}
}
