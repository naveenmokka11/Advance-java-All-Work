package com.contoller;

import java.util.Scanner;

import javax.persistence.Persistence;

import com.dao.CountryCrud;
import com.dao.StateCrud;
import com.dto.Country;
import com.dto.State;

public class CountryMainContoller {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Country c=new Country();
		
		CountryCrud ccd=new CountryCrud();
		
		
		State s=new State();
		
		StateCrud scd=new StateCrud();
		
		System.out.println("1 for perfrom crud operations on counry");
		System.out.println("2 for perfrom crud operations on state ");
		
		
		int mainchoice=sc.nextInt();
		
		switch(mainchoice) {
		case 1:{
			System.out.println("1 for insert data into  country table");
			System.out.println("2 for update data country table");
			System.out.println("3 for delete data from country table");
			System.out.println("4 for fetch data from country table");
			int c_choice=sc.nextInt();
			switch(c_choice) {
			case 1:{
				
				System.out.println("enter country name");
				String cname=sc.next();
				c.setName(cname);
				System.out.println("enter prime minister name");
				String pmname=sc.next();
				c.setPrimeMinister(pmname);
				System.out.println("Enter country captial");
				String captial=sc.next();
				c.setCapital(captial);
				
				ccd.insertCountry(c);
			}
			break;
			case 2:{
				System.out.println("Enter country id");
				int cid=sc.nextInt();
				System.out.println("Enter new prime minister name");
				String pmname=sc.next();
				c.setId(cid);
				c.setPrimeMinister(pmname);
				ccd.updateCountry(c);
			}
			break;
			case 3:{
				System.out.println("enter country id");
				int cid=sc.nextInt();
				ccd.deleteCountry(cid);
				}
			break;
			case 4:{
				System.out.println("enter country id");
				int id=sc.nextInt();
				ccd.fetchCountry(id);
			}
			break;
			
			}
		}
		case 2:{
			
			System.out.println("1 for insert data into  state table");
			System.out.println("2 for update data state table");
			System.out.println("3 for delete data from state table");
			System.out.println("4 for fetch data from state table");
			int cchoice=sc.nextInt();
			switch(cchoice) {
			case 1:{
				System.out.println("enter state name");
				String name=sc.next();
				
				s.setName(name);
				System.out.println("Enter language");
				String lang=sc.next();
				s.setLanguage(lang);
				System.out.println("Enter chief minisiter name");
				String cm=sc.next();
				s.setChiefMinister(cm);
				System.out.println("Enter country id");
				
				int cid=sc.nextInt();
				
				scd.insertIntoSate(s, cid);
			
				
			}
			break;
			case 2:{
				System.out.println("your  updating state cm ");
				
				System.out.println("Enter state id");
				int id=sc.nextInt();
				s.setId(id);

				System.out.println("new cm name");
				String name=sc.next();
				s.setChiefMinister(name);
				scd.upadteState(s);
				
			}
			break;
			case 3:{
				System.out.println("Enter state id");
				int id=sc.nextInt();
				scd.deleteState(id);
				
			}
			break;
			case 4:{
				System.out.println("Enter sate id");
				int id=sc.nextInt();
				scd.fetchState(id);
			}
			
			
			}
		
		}
		
		}
			
		
		
	}

}
