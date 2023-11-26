package com.hibarnate.demo.Controller;

import javax.persistence.Persistence;

import com.hibarnate.demo.Dao.StudentCrud;
import com.hibarnate.demo.dto.Student;
import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		// Student st=new Student(2,"akash@gmail.com","aksh", 87567523, "a@123");

		Student st = new Student();
		//st.setId(2);
		//st.setName("pranay");
//
		StudentCrud crud = new StudentCrud();

		// crud.saveStudent(st);
		//crud.updateStudent(st);
		// crud.fatchStudent(3);
		// crud.removeStudent(3);
		 //crud.getAllRecord();
	try {
		System.out.println("Enter email");
		Scanner sc=new Scanner(System.in);
		String email=sc.next();
		crud.getRecordByEmail(email);
	} catch (Exception e) {
			System.out.println("data not found");
	}
		//crud.getRecordByName("vikram0");

	}

}
