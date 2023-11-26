package com.hibernate.contoller;

import com.hibernate.dto.*;
import com.hibernate.dao.*;
import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("1.for inserting data");
				System.out.println("2.for retriving the data");
				System.out.println("3. for updating the data ");
				System.out.println("4. for Delete the data");
				
				int choice=sc.nextInt();
				switch(choice) {
				case 1:{
					System.out.println("enter id");
					int id=sc.nextInt();
					System.out.println("enter name");
					String name=sc.next();
					System.out.println("enter email");
					String email=sc.next();
					System.out.println("enter phone");
					long phone=sc.nextLong();
					System.out.println("enter password");
					String pwd=sc.next();
					Student st=new Student(id,name,email,phone,pwd);
					StudentCrud stucrud=new StudentCrud();
					stucrud.insert(st);
				}
				break;
				case 2:{
					Student st=new Student();
					StudentCrud stcrud=new StudentCrud();
					System.out.println("enter id");
					int id=sc.nextInt();
					stcrud.fetch(id);
					
				}
				break;
				case 3:{
	
					System.out.println("enter id");
					int id=sc.nextInt();
					System.out.println("enter name");
					String name=sc.next();
					System.out.println("enter email");
					String email=sc.next();
					System.out.println("enter phone");
					long phone=sc.nextLong();
					System.out.println("enter password");
					String pwd=sc.next();
					Student stu=new Student(id,name,email,phone,pwd);
					StudentCrud stcrud =new StudentCrud();
				
					stcrud.update(stu);
					}
				break;
				case 4:{
					Student st=new Student();
					StudentCrud stcrud= new StudentCrud();
					System.out.println("enter id");
					int id=sc.nextInt();
					stcrud.delete(id);
					
				}
				break;
				default :{
					System.out.println("please valid option");
					
				}
				break;
				
			}
	
		}

	
	
	
			
	
		

	}


