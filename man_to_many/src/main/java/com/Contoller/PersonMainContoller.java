package com.Contoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Persistence;

import com.dao.PersonCrud;
import com.dao.ProductsCrud;
import com.dto.Person;
import com.dto.Products;

public class PersonMainContoller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person person = new Person();

		PersonCrud personCrud = new PersonCrud();

		Products product = new Products();

		ProductsCrud productCrud = new ProductsCrud();

		System.out.println("1 to Perfrom CRUD operation on Person");
		System.out.println("2 to Perfrom CRUD operation on Produtcts");
		System.out.println("3 to Perfrom CRUD operation on BUY Product");

		int mainchoice = sc.nextInt();

		switch (mainchoice) {
		case 1: {
			System.out.println("1 to insert person");
			System.out.println("2 to update person");
			System.out.println("3 to fetch person");
			System.out.println("4 to delete person");
			int personchoice = sc.nextInt();
			switch (personchoice) {
			case 1: {
				System.out.println("enter person name");
				String name = sc.next();
				person.setName(name);
				System.out.println("Enter person phone");
				long phone = sc.nextLong();
				person.setPhone(phone);
				System.out.println("enter person email");
				String email = sc.next();
				person.setEmail(email);

				personCrud.insertPerson(person);

			}
				break;
			case 2: {
				System.out.println("enter person id");
				int id = sc.nextInt();
				person.setId(id);
				System.out.println("enter phone no ");
				long phone = sc.nextLong();
				person.setPhone(phone);
				personCrud.updatePerson(person);
			}
				break;
			case 3: {
				System.out.println("Enter person id");
				int id = sc.nextInt();
				personCrud.fetchPerson(id);
			}
				break;
			case 4: {
				System.out.println("enter person id");
				int id = sc.nextInt();
				personCrud.deletePerson(id);
			}
				break;

			}

		}
			break;
		case 2: {
			System.out.println("1 to insert product");
			System.out.println("2 to update product");
			System.out.println("3 to delete product");
			System.out.println("4 to fetch  product");
			int productchoice = sc.nextInt();
			switch (productchoice) {
			case 1: {
				System.out.println("enter product name");
				String name = sc.next();
				product.setName(name);

				System.out.println("enter product price");
				double price = sc.nextDouble();
				product.setPrice(price);

				System.out.println("enter product type");
				String type = sc.next();
				product.setType(type);

				productCrud.insertProduct(product);

			}
				break;
			case 2: {
				System.out.println("Enter product id");
				int id = sc.nextInt();
				product.setId(id);
				System.out.println("Enter product price");
				double price = sc.nextDouble();
				product.setPrice(price);
				productCrud.updateProductPrice(product);

			}
				break;
			case 3: {
				System.out.println("enter delete product");
				int id = sc.nextInt();
				productCrud.deleteProduct(id);

			}
				break;
			case 4: {
				System.out.println("enter fetch product");
				int id = sc.nextInt();
				productCrud.fetchProduct(id);
			}
				break;

			}

		}
			break;
		case 3: {
			System.out.println("Enter person id");
			int id = sc.nextInt();
			System.out.println("pelese select the below itms based on numbes");
			System.out.println(" 1.shirt");
			System.out.println(" 2.pant");
			System.out.println(" 3.belt ");
			System.out.println(" 4.perfume");
			System.out.println(" 5.shooee");
			System.out.println(" 6 wallet ");
			System.out.println("7 for completed shoping");

			List<Integer> plist = new ArrayList<>();

			int selecteditem = sc.nextInt();
			int a = 1;
			int b = 2;
			int c = 3;
			int d = 4;
			int e = 5;
			int f = 6;

			boolean flag = true;
			while (flag) {
				switch (selecteditem) {
				case 1: {
					plist.add(a);
					System.out.println("1 added");
					flag = false;

				}
					break;
				case 2: {
					plist.add(b);
					flag = false;

				}
					break;
				case 3: {
					plist.add(c);
					flag = false;

				}
					break;
				case 4: {
					plist.add(d);
					flag = false;

				}
					break;
				case 5: {
					plist.add(e);
					flag = false;

				}
					break;
				case 6: {
					plist.add(f);
					flag = false;

				}
					break;
				case 7: {
					flag = false;
				}
				break;

				}
			}
			personCrud.buyProduct(id, plist);

		}

		}

	}
}
