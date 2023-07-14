package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class create_table {

	public void create_class()
	{
		String url = "jdbc:mysql://127.0.0.1:3306/gaming_club";
		String user = "root";
		String password = "Venu@8368";
		Connection connection = null;
		String createQuery = "create table demo(id int ,name varchar(50))";

		try {
			connection = DriverManager.getConnection(url, user, password);
			Statement st = connection.createStatement();
			st.execute(createQuery);
			System.out.println("Connected to DB successfully");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("We successfully connected and disconnected to DB");
	}

}
