package com.Contollers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.FamailyCrud;
import com.dao.RationCrud;
import com.dto.FamilyMember;
import com.dto.RationCard;

public class FamilyContoller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		RationCard ration = new RationCard();

		FamilyMember fm = new FamilyMember();

		RationCrud rcd = new RationCrud();

		FamailyCrud fcd = new FamailyCrud();

		System.out.println("1 To perfrom crud operations on Ration card");
		System.out.println("2 TO  Perfrom crud operation on Family members");
		int mainchoice = sc.nextInt();
		switch (mainchoice) {
		case 1: {
			// insert into ration card

			System.out.println(" 1 for insert operation");
			System.out.println(" 2 for update operation");
			System.out.println(" 3 for Delete operation");
			System.out.println(" 4 for Fetch operation");

			int rationchoice = sc.nextInt();

			switch (rationchoice) {
			case 1: {
				System.out.println("Enter ration card colour");
				String cardclour = sc.next();
				ration.setColor(cardclour);
				System.out.println("Enter phone number");
				long phone = sc.nextLong();
				ration.setPhone(phone);
				System.out.println("Enter state");
				String state = sc.next();
				ration.setState(state);
				System.out.println("Enter pincode");
				int pincode = sc.nextInt();
				ration.setPincode(pincode);
				rcd.insertintorationCard(ration);
			}
				break;
			case 2: {
				// update phone
				System.out.println("Enter Ration card id to Update phone number");
				int id = sc.nextInt();
				ration.setId(id);
				System.out.println("Enter new phone number");
				long phone = sc.nextLong();
				ration.setPhone(phone);
				rcd.updateRationcardPhone(ration);

			}
				break;
			case 3: {
				// delete
				System.out.println("Enter ration card number to delete record");
				int id = sc.nextInt();

				rcd.deleteRationcard(id);
			}
				break;
			case 4: {
				System.out.println("Enter id to fetch record from Ration card");
				int id = sc.nextInt();

				rcd.fetchRationCard(id);

			}
				break;

			}

		}
		case 2: {
			System.out.println(" 1 for insert operation");
			System.out.println(" 2 for update operation");
			System.out.println(" 3 for Delete operation");
			System.out.println(" 4 for Fetch operation");

			int familymemchoice = sc.nextInt();
			switch (familymemchoice) {
			case 1: {
				// insert family member
				System.out.println("enter Name");
				String name = sc.next();
				fm.setName(name);
				System.out.println("enter Age");
				int age = sc.nextInt();
				fm.setAge(age);
				System.out.println("Enter gender");
				String gender = sc.next();
				fm.setGender(gender);
				System.out.println("Enter phone");
				long phone = sc.nextLong();
				fm.setPhone(phone);
				fcd.insertIntoFamily(fm, ration.getId());

			}
				break;
			case 2: {
				// updating phone number
				System.out.println("Enter id to update phoneNO");
				int id = sc.nextInt();
				fm.setId(id);
				System.out.println("Enter New Phone no");
				long phone = sc.nextLong();
				fm.setPhone(phone);
				fcd.updateFamily(fm);

			}
				break;
			case 3: {
				
				System.out.println("Enter Ration card id");
				int rid = sc.nextInt();
				
				System.out.println("Enter Family member id");
				int id = sc.nextInt();
				

				fcd.deletefamilyMember(rid, id);

			}
			break;
			case 4 :{
				System.out.println("enter id to fetch mamber");
				int id=sc.nextInt();
				fcd.fetchFamily(id);
				
			}

			}

		}

		}

	}

}
