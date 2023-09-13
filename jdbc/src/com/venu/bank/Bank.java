package com.venu.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/venu_bank";
		String user = "root";
		String pwd = "Venu@8368";
		PreparedStatement pstmt, pstmt1, pstmt2, pstmt3, pstmt4 = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Database connected Successfully");

			System.out.println("<----Welcome to Venu Bank---->");
			System.out.println("Enter Account Number");
			Scanner sc = new Scanner(System.in);
			int ac_no = sc.nextInt();

			System.out.println("Enter Pin:");
			int pin = sc.nextInt();

			String query = "Select * from bank where Acc_no=? and Pin=?";

			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, ac_no);
			pstmt.setInt(2, pin);
			ResultSet res = pstmt.executeQuery();
			res.next();

			System.out.println("Welcome " + res.getString(2));
			System.out.println("Available Balance = " + res.getInt(4));

			// ---------------- Transfer details------

			System.out.println("<--------Transfer Details-------->");

			System.out.println("Enter the Beneficiary Account number");
			int rec_acc = sc.nextInt();

			System.out.println("Enter the transfer amount");
			int tf_amount = sc.nextInt();

			con.setAutoCommit(false);
			Savepoint s = con.setSavepoint();

			String query1 = "update bank set Balance=Balance-?" + " where Acc_no=?";
			pstmt1 = con.prepareStatement(query1);

			pstmt1.setInt(1, tf_amount);
			pstmt1.setInt(2, ac_no);

			pstmt1.executeUpdate();

			System.out.println("<-----Incoming credit request----->");
			System.out.println(res.getString(2) + " account number " + ac_no + " wants to transfer " + tf_amount);

			System.out.println("Press Y to recieve");
			System.out.println("Press N to reject");
			String choice = sc.next();

			if (choice.equals("Y") || choice.equals("y")) {

				String query2 = "update bank set Balance=Balance+?" + " where Acc_no=?";
				pstmt2 = con.prepareStatement(query2);

				pstmt2.setInt(1, tf_amount);
				pstmt2.setInt(2, rec_acc);

				pstmt2.executeUpdate();

				String query3 = "select * from bank where Acc_no=?";
				pstmt3 = con.prepareStatement(query3);

				pstmt3.setInt(1, rec_acc);

				ResultSet res1 = pstmt3.executeQuery();

				res1.next();

				System.out.println("Upadated Balance=" + res1.getInt(4));
			} else {

				String query4 = "select * from bank where Acc_no=?";
				pstmt4 = con.prepareStatement(query4);

				pstmt4.setInt(1, rec_acc);

				ResultSet res2 = pstmt4.executeQuery();

				res2.next();

				System.out.println("Existing Balance=" + res2.getInt(4));
				con.rollback(s);

			}
			con.commit();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

} 
