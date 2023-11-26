package com.Contollers;

import java.util.Scanner;

import com.dao.ScShipCrud;
import com.dao.StudentCrud;
import com.dto.ScShip;
import com.dto.Student;

public class StudentScholarController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student s = new Student();

		ScShip sship = new ScShip();

		StudentCrud stcd = new StudentCrud();

		ScShipCrud sshipcd = new ScShipCrud();

		System.out.println("1 to perfrom CRUD opeartions on ScholarShip");
		System.out.println("2 to perfrom crud operations on Student");
		int mainChoice = sc.nextInt();
		switch (mainChoice) {
		case 1: {
			System.out.println(" 1 for insert");
			System.out.println(" 2 for update");
			System.out.println(" 3 for fetch");
			System.out.println(" 4 for delete");
			int shipchoice = sc.nextInt();
			switch (shipchoice) {
			case 1: {
				// insert
				System.out.println("Enter schoolarship year");
				int year = sc.nextInt();
				sship.setScShipYear(year);
				System.out.println("enter scholarship type");
				String type = sc.next();
				sship.setType(type);

				System.out.println("enter phone");
				long phone = sc.nextLong();
				sship.setPhone(phone);

				sshipcd.scShipInsert(sship);

			}
				break;
			case 2: {
				// update
				System.out.println("enter scholarship id ");
				int id = sc.nextInt();
				System.out.println("Enter new phone number");
				long phone = sc.nextLong();
				sship.setScship_no(id);
				sship.setPhone(phone);
				sshipcd.scShipUpadte(sship);

			}
				break;
			case 3: {
				// fetch
				System.out.println("enter scholarship id ");
				int id = sc.nextInt();
				sshipcd.scShipfetch(id);

			}
				break;
			case 4: {
				// delete
				System.out.println("enter scholarship id");

				int id = sc.nextInt();
				System.out.println("studnet Student id");
				int sid = sc.nextInt();
				sshipcd.scShipDelete(id, sid);

			}

			}

		}
		case 2: {

			System.out.println(" 1 for insert");
			System.out.println(" 2 for update");
			System.out.println(" 3 for fetch");
			System.out.println(" 4 for delete");
			int studentchoice = sc.nextInt();
			switch (studentchoice) {
			case 1: {
				// insert
				System.out.println("Enter Student name");
				String name = sc.next();

				s.setName(name);
				System.out.println("Enter phone");
				long phone = sc.nextLong();
				s.setPhone(phone);
				System.out.println("Enter Student class");
				int cls = sc.nextInt();
				s.setStandard(cls);
				System.out.println("Enter schollership id");
				int id = sc.nextInt();

				stcd.insetStudent(s, id);

			}
				break;
			case 2: {
				// upadte
				System.out.println("Enter Student id");
				int id = sc.nextInt();
				s.setId(id);
				System.out.println("enter new phone number");
				long phone = sc.nextLong();
				s.setPhone(phone);
				stcd.upadteStudent(s);

			}
				break;
			case 3: {
				// fetch
				System.out.println("enter Student id");
				int id = sc.nextInt();
				stcd.fetchStudent(id);

			}
				break;
			case 4: {
				// delete
				System.out.println("enter Student id");
				int id = sc.nextInt();
				stcd.deleteStudent(id);

			}
				break;
			}

		}

		}

	}

}
