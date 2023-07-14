package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_ {
	
	public void delete_member()
	{
		String url = "jdbc:mysql://127.0.0.1:3306/musical_instruments";
		String user = "root";
		String password = "root123";
		
		Scanner scanner = new Scanner(System.in);
		String deleteQuery = "delete from member_base where member_id = ?";
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pst = conn.prepareStatement(deleteQuery);
			
			System.out.print("Enter the member_id to delete a row: ");
			int id = scanner.nextInt();
			
			pst.setInt(1, id);
			pst.execute();
			conn.close();
			System.out.println("A row was successfully deleted");
		}
		catch (SQLException e) {
			System.out.println("Deleting a row failed!");
			e.printStackTrace();
		}
		System.out.println("DB was successfully disconnected");
		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Delete_ del = new Delete_();
		del.delete_member();
		

	}

}
