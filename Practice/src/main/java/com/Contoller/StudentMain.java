package com.Contoller;

import java.util.Scanner;

import com.dao.StudentCrud;
import com.dao.StudentHackerCrud;
import com.dto.Student;
import com.dto.StudentHackerRank;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StudentHackerCrud stuHackercd = new StudentHackerCrud();
		System.out.println("Enter Name");
		String hname = sc.next();
		System.out.println("Enter Email");
		String hemail = sc.next();
		System.out.println("Enter no of probles sloved");
		int slovedprobs = sc.nextInt();
		
		StudentHackerRank stuRank1 = new StudentHackerRank(hname, hemail, slovedprobs);

		stuHackercd.insertHackerRankDeatils(stuRank1);

		System.out.println("Enter name");
		String name = sc.next();

		System.out.println("Enter email");
		String email = sc.next();

		System.out.println("Enter phone");
		long phone = sc.nextLong();
		
		System.out.println("Enter password");
		String pass = sc.next();
		
		
		Student student = new Student(name, email, phone, pass);

		StudentCrud stucd = new StudentCrud();

		stucd.insertStudent(student, stuRank1.getId());

	}

}
