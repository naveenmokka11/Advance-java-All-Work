package com.Controller;

import java.util.Scanner;

import com.dao.ScholarshipCrud;
import com.dao.StudentCrud;
import com.dto.Scholarship;
import com.dto.Student;

public class StudentSchollership {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student s1 = new Student();
		StudentCrud stucd=new StudentCrud();

		Scholarship ship = new Scholarship();

		ScholarshipCrud scd = new ScholarshipCrud();

		System.out.println("1 to  Perform Crud operatins on Scholarship");
		System.out.println("2. for perfrom crud operation on Student");
		int mainchoice = sc.nextInt();

		switch (mainchoice) {
		case 1: {
			System.out.println("1 for insert ");
			System.out.println("2 for update");
			System.out.println("3. for delete");
			System.out.println("4 for fetch");
			int sshipchoice = sc.nextInt();
			switch (sshipchoice) {
			case 1: {
				System.out.println("enter Scholership type");
				String type = sc.next();
				System.out.println("Enter year");
				int year = sc.nextInt();

				ship.setType(type);
				ship.setYear(year);

				scd.InsetScholerShip(ship);

			}
				break;
			case 2: {
				System.out.println("enter scholership id");

				int id = sc.nextInt();
				ship.setId(id);

				System.out.println("Enter year");

				int year = sc.nextInt();
				ship.setYear(year);

				scd.UpdateScholarship(ship);

			}
				break;
			case 3: {
				System.out.println("Enter id to perfrom update operation");

				int id = sc.nextInt();
				ship.setId(id);
				System.out.println("enter student id");
				int studentid = sc.nextInt();

				scd.deleteScholerShip(id, studentid);

			}
				break;
			case 4: {
				System.out.println("enter id to perfrom fetch operation");
				int id = sc.nextInt();
				ship.setId(id);
				scd.fetchScholership(id);

			}
			break;
			default :{
				System.out.println("enter valid input");
			}
			break;

			}
		}
		case 2:{
			
			System.out.println("1 for insert ");
			System.out.println("2 for update");
			System.out.println("3. for delete");
			System.out.println("4 for fetch");
			
			int studentchoice=sc.nextInt();
			switch(studentchoice) {
			case 1:{
				System.out.println("EnterName");
				String name=sc.next();
				s1.setName(name);
				System.out.println("Enter Class");
				int cls=sc.nextInt();
				s1.setClas(cls);
				stucd.insertIntoStudent(s1, ship.getId());
				
			}
			break;
			case 2:{
				System.out.println("enter student id");
				int id=sc.nextInt();
				s1.setId(id);
				System.out.println("enter new class");
				int cls=sc.nextInt();
				s1.setClas(cls);
				stucd.updateStudent(s1);
			}
			break;
			case 3:{
				System.out.println("Enter id to delete student record");
				int id=sc.nextInt();
				stucd.deleteStudent(id);
			}
			case 4:{
				System.out.println("enter id to fetch the record from the table");
				int id=sc.nextInt();
				stucd.fetch(id);
			}
			break;
			default:{
				System.out.println("enter valid input");
			}
			
			}
			
			
		}
		break;
		default:{
			System.out.println("enter valid input");
		}

		}

	}

}
