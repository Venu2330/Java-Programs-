package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect_dbms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://127.0.0.1:3306/gaming_club";
		String user="root";
		String password="Venu@8368";
		Connection connection=null;
		try
		{
			connection =DriverManager.getConnection(url, user,password);
			System.out.println("Connected succefully");
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("We succefull connected and disconnetd the databse");
	}

}
