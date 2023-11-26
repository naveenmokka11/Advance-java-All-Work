package com.Contoller;

import java.util.Scanner;

import com.dao.FarmerCrud;
import com.dao.FertilizerCrud;
import com.dto.Farmer;
import com.dto.FertilizersStore;

public class FarmerMainContoller {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		FertilizersStore fstore=new FertilizersStore();
//		System.out.println("Enter Deeler Name ");
//		String storeDname=sc.next();
//		System.out.println("Enter Enter Address");
//		String storeAddress=sc.next();
//		fstore.setDeelerName(storeDname);
//		fstore.setAdresss(storeAddress);
//		
		FertilizerCrud frticd=new FertilizerCrud();
		//frticd.insertIntoFertilizer(fstore);
		
		
		//farmer
		
//		 Farmer farmer=new Farmer();
//		 System.out.println("Enter Name");
//		 String fname=sc.next();
//		 System.out.println("Enter land");
//		 double land=sc.nextDouble();
//		 System.out.println("Enter Phone");
//		 long farmerphone=sc.nextLong();
//		 farmer.setName(fname);
//		 farmer.setLand(land);
//		 farmer.setPhone(farmerphone);
//		 
//		 FarmerCrud farmercd=new FarmerCrud();
//		 farmercd.insertIntoFarmer(farmer,fstore.getStoreNumber() );
		
		
		
		System.out.println("enter store id");
		 long sid=sc.nextInt();
		 System.out.println("Enter farmer id");
		 int fid=sc.nextInt();
		
		frticd.deleteStore(sid, fid);
		

	}

}
