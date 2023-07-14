package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Display {

	public void products() {
		String url = "jdbc:mysql://127.0.0.1:3306/musical_instruments";
		String user = "root";
		String password = "root123";
		String Selectall = "Select * from products";
		PreparedStatement pst = null;
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			pst = connection.prepareStatement(Selectall);
			pst.execute();
			ResultSet rs = pst.executeQuery();
			int i = 1;
			if (!rs.next()) {
				System.out.println("There were no rows for the given query");
			} else {
				System.out.printf("\n%9s  %-20s %s", "Product_Id", "Product_name", "Rental_price");
				System.out.println("\n---------------------------------------");
				while (rs.next()) {
					System.out.print("Row-" + i + ": ");
					System.out.printf("%02d  %-15s  %d \n", rs.getInt(1), rs.getString(2), rs.getInt(3));
					i++;
				} // end of while
			} // end of else
			rs.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("There was an issue in displaying");
			e.printStackTrace();
		}
	}

	public void member_base() {
		String url = "jdbc:mysql://127.0.0.1:3306/musical_instruments";
		String user = "root";
		String password = "root123";
		String Selectall = "Select * from member_base";
		PreparedStatement pst = null;
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			pst = connection.prepareStatement(Selectall);
			pst.execute();
			ResultSet rs = pst.executeQuery();
			int i = 1;
			if (!rs.next()) {
				System.out.println("There were no rows for the given query");
			} else {
				System.out.printf("\n%9d  %-20s %s   %s", "ID", "member_name", "product_Id", "Days_for_rent");
				System.out.println("\n---------------------------------------");
				while (rs.next()) {
					System.out.print("Row-" + i + ": ");
					System.out.printf("%02d  %-15s  %d  %d \n", rs.getInt(1), rs.getString(2), rs.getInt(3),
							rs.getInt(4));
					i++;
				} // end of while
			} // end of else
			rs.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("There was an issue in displaying");
			e.printStackTrace();
		}
	}

	public void transaction_rental_table() {
		String url = "jdbc:mysql://127.0.0.1:3306/musical_instruments";
		String user = "root";
		String password = "root123";
		String Selectall = "Select * from transaction_rental_table";
		PreparedStatement pst = null;
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			pst = connection.prepareStatement(Selectall);
			pst.execute();
			ResultSet rs = pst.executeQuery();
			int i = 1;
			if (!rs.next()) {
				System.out.println("There were no rows for the given query");
			} else {
				System.out.printf("\n%9s  %-20s %s  %s", "Record_ID", "Member_id", "Transaction_date", "Amount");
				System.out.println("\n---------------------------------------");
				while (rs.next()) {
					System.out.print("Row-" + i + ": ");
					System.out.printf("%02d  %-15d  %s  %d\n", rs.getInt(1), rs.getInt(2), rs.getString(3),
							rs.getInt(4));
					i++;
				} // end of while
			} // end of else
			rs.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("There was an issue in displaying");
			e.printStackTrace();
		}
	}

	public void collection_club() {
		String url = "jdbc:mysql://127.0.0.1:3306/musical_instruments";
		String user = "root";
		String password = "root123";
		String Selectall = "Select * from collection_club";
		PreparedStatement pst = null;
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			pst = connection.prepareStatement(Selectall);
			pst.execute();
			ResultSet rs = pst.executeQuery();
			int i = 1;
			if (!rs.next()) {
				System.out.println("There were no rows for the given query");
			} else {
				System.out.printf("\n%9s  %-20s %s ", "Collection_ID", "Club_Collection_Date", "Total_Amount");
				System.out.println("\n---------------------------------------");
				while (rs.next()) {
					System.out.print("Row-" + i + ": ");
					System.out.printf("%02d  %-15d  %d\n", rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4));
					i++;
				} // end of while
			} // end of else
			rs.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("There was an issue in displaying");
			e.printStackTrace();
		}
	}

	public void transaction_method() {
		String url = "jdbc:mysql://127.0.0.1:3306/musical_instruments";
		String user = "root";
		String password = "root123";
		String Selectall = "Select * from transaction_method";
		PreparedStatement pst = null;
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			pst = connection.prepareStatement(Selectall);
			pst.execute();
			ResultSet rs = pst.executeQuery();
			int i = 1;
			if (!rs.next()) {
				System.out.println("There were no rows for the given query");
			} else {
				System.out.printf("\n%9s  %-20s ", "Transaction_ID", "Transaction_method");
				System.out.println("\n---------------------------------------");
				while (rs.next()) {
					System.out.print("Row-" + i + ": ");
					System.out.printf("%02d  %s\n", rs.getInt(1), rs.getString(2));
					i++;
				} // end of while
			} // end of else	
			rs.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("There was an issue in displaying");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1 = new Display();

		d1.member_base();
		d1.transaction_method();
		d1.transaction_rental_table();
		d1.collection_club();
		d1.products();
	}

}
