package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class demo {
	
	
	 

	public static void main(String[] args)  {
		 String url="jdbc:mysql://localhost:3306/employee";
		 String user= "root";
		 String pwd= "Venu@8368";
		 Connection con =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			
			
			 con=DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection successfully established");
			
			
			//String query="Select * from emp where empid=?";
			String query="insert into emp(`empid`,`empnamel`,`dsig`,`salary`)values(?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(query);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of rows");
			int rows=sc.nextInt();
			con.setAutoCommit(false);
			for(int i=1;i<=rows;i++) {
			System.out.println("Enter ID");
			int id= sc.nextInt();
			System.out.println("Enter employee name");
			String name =sc.next();
			System.out.println("Enter Designation");
			String dsig=sc.next();
			System.out.println("Enter salary");
			int Salary=sc.nextInt();
			
			stmt.setInt(1,id);
			stmt.setString(2, name);
			stmt.setString(3, dsig);
			stmt.setInt(4,Salary);
			
			stmt.execute();
			}
			con.commit();
			System.out.println("Row added successfully");
			
			
			
			
			
			
			
			
			
			//ResultSet res=stmt.executeQuery(query);
//			System.out.println("Query executed");)
			
			/*while(res.next()==true) {
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4));
			}*/
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
