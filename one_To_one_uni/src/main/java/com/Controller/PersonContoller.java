package com.Controller;

import java.util.Scanner;

import com.dao.PassportCrud;
import com.dao.PersonCrud;
import com.dto.Passport;
import com.dto.Person;

public class PersonContoller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Passport passport = new Passport();

		Person person = new Person();

		System.out.println("1 To Perform CRUD Operation On Passport");
		System.out.println("2 TO Perfrom CRUD Operation On Person");

		int tableschoice = sc.nextInt();
		boolean flag=true;
		while(flag) {
			switch (tableschoice) {
			case 1: {
				System.out.println("1. To insert data into Passport");
				System.out.println("2. To Update phoneNumber of Passport");
				System.out.println("3. To delete Record of Passport");
				System.out.println("4. To Fetch the data from Passport ");
				int passportchoice = sc.nextInt();
				switch (passportchoice) {
				case 1: {
					System.out.println("Enter name");
					String name = sc.next();
					System.out.println("Enter phone");
					long phone = sc.nextLong();
					System.out.println("Enter address");

					String adress = sc.next();

					passport.setName(name);
					passport.setPhone(phone);
					passport.setAddress(adress);

					PassportCrud passcd = new PassportCrud();
					passcd.insertIntoPassport(passport);
				}
					break;
				case 2: {
					System.out.println("Enter passport id(pk)");
					int id = sc.nextInt();
					passport.setPass_no(id);
					System.out.println("Enter phone number");
					long phone = sc.nextLong();
					passport.setPhone(phone);
					PassportCrud passcd = new PassportCrud();
					passcd.updatePhone(passport);
					flag=false;

				}
					break;
				case 3: {
					System.out.println("Enter passno");
					int id = sc.nextInt();
					System.out.println("Enter Parson id");
					int personid=sc.nextInt();
					
					PassportCrud passcd = new PassportCrud();
					passcd.deleteFromPassport(id,personid);
					flag=false;
				}
					break;
				case 4: {
					System.out.println("Enter Passport no");
					int id = sc.nextInt();
					PassportCrud passcd = new PassportCrud();
					passcd.fetch(id);
					flag=false;
				}

				}

			}

			case 2: {
				System.out.println("1 to Insert Data into Person ");
				System.out.println("2 to update phone Number");
				System.out.println("3 to Delete Record Based on id");
				System.out.println("4 to Fetch Record Based on id");
				System.out.println("5 to Fetch Record Based on name");
				System.out.println("6 to Fetch Record Based on email");
				System.out.println("7 to Fetch Record Based on phone");
				System.out.println("8 to Fetch Record Based on gender");

				int personchoice = sc.nextInt();
				switch (personchoice) {
				case 1: {
					System.out.println("You are Inserting the data in to Person table ");
					System.out.println("Enter name");
					String name = sc.next();
					System.out.println("Enter Email");
					String email = sc.next();
					System.out.println("Enter Phone Number");
					long phone = sc.nextLong();
					System.out.println("Enter gender");
					String gender = sc.next();
					person.setName(name);
					person.setEmail(email);
					person.setPhone(phone);
					person.setGender(gender);
					person.setPassport(passport);

					PersonCrud personcd = new PersonCrud();

					personcd.insertPersondata(person, passport.getPass_no());
					flag=false;
				}
					break;
				case 2: {
					System.out.println("Your changing the phone number");
					System.out.println("Enter id");
					int id = sc.nextInt();
					System.out.println("Enter new phone number");
					long phone = sc.nextLong();

					person.setId(id);
					person.setPhone(phone);

					PersonCrud personcd = new PersonCrud();
					personcd.updatePersonPhone(person);
					flag=false;
				}
					break;
				case 3: {
					System.out.println("Your Deleting the Record");
					System.out.println("Enter id");
					int id = sc.nextInt();
					person.setId(id);
					PersonCrud personcd = new PersonCrud();
					personcd.deletePerson(id);
					flag=false;
				}
					break;
				case 4: {
					System.out.println("Your fetching the data from Person basen Id");
					System.out.println("Enter id");
					int id = sc.nextInt();
					person.setId(id);
					PersonCrud personcd = new PersonCrud();
					personcd.fetchPersonById(id);
					flag=false;
				}
					break;
				case 5: {
					System.out.println("Your fetching the data from Person basen name");
					System.out.println("Enter Name");
					String name = sc.next();
					person.setName(name);
					PersonCrud personcd = new PersonCrud();
					personcd.fetchPersonByName(name);
					flag=false;
				}
					break;
				case 6: {
					System.out.println("Your fetching the data from Person basen Email");
					System.out.println("Enter Email");
					String email = sc.next();
					person.setEmail(email);
					PersonCrud personcd = new PersonCrud();
					personcd.fetchPersonByemail(email);
					flag=false;

				}
					break;
				case 7: {
					System.out.println("Your fetching the data from Person basen Phone");
					System.out.println("Enter Phone");
					long phone = sc.nextLong();
					person.setPhone(phone);
					PersonCrud personcd = new PersonCrud();
					personcd.fetchPersonPhone(phone);
					flag=false;

				}
					break;
				case 8: {
					System.out.println("Your fetching the data from Person basen gender");
					System.out.println("Enter Gender");
					String gender = sc.next();
					person.setGender(gender);
					PersonCrud personcd = new PersonCrud();
					personcd.fetchPersongender(gender);
					
					flag=false;

				}
					break;

				}

			}

			}

		}
	}
}


