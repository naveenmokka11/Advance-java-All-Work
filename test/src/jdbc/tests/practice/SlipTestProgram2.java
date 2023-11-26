package jdbc.tests.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SlipTestProgram2 {
    public static void main(String[] args) throws Throwable {
        

    	Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/studentdb";
		String uname="root";
		String pwd="root";
	
		Connection con = DriverManager.getConnection(url, uname, pwd);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name");
			String namnamesToDelete=sc.next();
			//String[] namesToDelete = {"divya", "bittu"};

            // Create a PreparedStatement for batch processing
           PreparedStatement ps = con.prepareStatement("DELETE FROM student WHERE name = ?");

            
            // Add DELETE statements to the batch for each name
            for (String string : args) {
            	 ps.setString(1, namnamesToDelete);
                 ps.addBatch();
			}
            // Execute the batch
            ps.executeBatch();
            }
        }         
    
    

