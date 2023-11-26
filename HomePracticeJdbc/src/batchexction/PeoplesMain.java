package batchexction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class PeoplesMain {

	public static void main(String[] args) throws Throwable {
		Peoples p1=new Peoples();
		p1.setId(4);
		p1.setName("pavan");
		p1.setAge(20);
		p1.setGender("male");
		p1.setPhone(12345);
		
		Peoples p2=new Peoples();
		p2.setId(5);
		p2.setName("akash");
		p2.setAge(22);
		p2.setGender("male");
		p2.setPhone(34511);
		
		Peoples p3=new Peoples();
		p3.setId(6);
		p3.setName("pranay");
		p3.setAge(30);
		p3.setGender("male");
		p3.setPhone(6345);
		
		
		List<Peoples> li=new ArrayList();
		
		li.add(p1);
		li.add(p2);
		li.add(p3);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldb?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("insert into hostel values(?,?,?,?,?)");
		
		for(Peoples p:li) {
			ps.setInt(1, p.getId());
			ps.setString(2,p.getName());
			ps.setInt(3, p.getAge());
			ps.setString(4, p.getGender());
			ps.setLong(5, p.getPhone());
			ps.addBatch();
			
		}
		ps.executeBatch();
		
		
		
		

	}

}
