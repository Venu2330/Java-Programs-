package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update1 {
	public void product_update()
	{
		String url = "jdbc:mysql://127.0.0.1:3306/musical_instruments";
		String user = "root";
		String password = "root123";
		Scanner scanner = new Scanner(System.in);
		int new_product_id ;
		int member_id;
		String updateQuery = "update member_base set product_id = ? where member_id = ?";
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement st = conn.prepareStatement(updateQuery);
			
			System.out.print("Enter the new product id ");
			new_product_id = scanner.nextInt();
			System.out.println("Enter the member id");
			member_id=scanner.nextInt();
			st.setInt(1, new_product_id);
			st.setInt(2, member_id);
			st.execute();
			conn.close();
		}
		catch(SQLException e) {
			System.out.println("There was some error in updating row");
		}
		scanner.close();
	}
	
	public void days_for_rent()
	{
		String url = "jdbc:mysql://127.0.0.1:3306/musical_instruments";
		String user = "root";
		String password = "root123";
		
		Scanner scanner = new Scanner(System.in);
		int new_product_id ;
		int member_id;
		String updateQuery = "update member_base set days_for_rent = ? where member_id = ?";
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement st = conn.prepareStatement(updateQuery);
			
			System.out.print("Enter the new product id ");
			new_product_id = scanner.nextInt();
			System.out.println("Enter the member id");
			member_id=scanner.nextInt();
			st.setInt(1, new_product_id);
			st.setInt(2, member_id);
			st.execute();
			conn.close();
		}
		catch(SQLException e) {
			System.out.println("There was some error in updating row");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		update1 up1=new update1();
		up1.product_update();
		up1.days_for_rent();
		
	}

}
