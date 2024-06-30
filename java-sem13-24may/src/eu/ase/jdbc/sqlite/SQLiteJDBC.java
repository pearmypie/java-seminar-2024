package eu.ase.jdbc.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteJDBC {

	public static void main(String[] args) {
		
		Connection c;
		
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			c.setAutoCommit(false);
			
			createDBTable(c);
			insertData(c);
			selectData(c);
			
			c.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void selectData(Connection c) throws SQLException {
		Statement stmt = c.createStatement();
		String sqlSelectData = "SELECT * FROM EMPLOYEE WHERE SALARY > 15000";		
		
		ResultSet result = stmt.executeQuery(sqlSelectData);
		
		while (result.next()) {
			int id = result.getInt("ID");
			String name = result.getString("NAME");
			int age = result.getInt("AGE");
			String addr = result.getString("ADDRESS");
			float salary = result.getFloat("SALARY");
			
			System.out.printf("%-10d %-10s %-10d %-5s %-8.2f\n", id, name, age, addr, salary);
		}
		
		stmt.close();
		c.commit();
	}

	private static void insertData(Connection c) throws SQLException {
		Statement stmt = c.createStatement();
		String sqlInsertData = "INSERT INTO EMPLOYEE(ID, NAME, AGE, ADDRESS, SALARY) "
				+ "VALUES(1, 'JOHN', 25, 'B', 10000)";
		
		stmt.executeUpdate(sqlInsertData);
		stmt.close();
		
		// previne sql injection
		PreparedStatement pstmt = c.prepareStatement("INSERT INTO EMPLOYEE(ID, NAME, AGE, ADDRESS, SALARY) "
				+ "VALUES(?, ?, ?, ?, ?)");
		
		pstmt.setInt(1, 2);
		pstmt.setString(2, "Mark");
		pstmt.setInt(3, 30);
		pstmt.setString(4, "CJ");
		pstmt.setFloat(5, 20000.0f);
		
		pstmt.executeUpdate();
		
		pstmt.setInt(1, 3);
		pstmt.setString(2, "Luke");
		pstmt.setInt(3, 30);
		pstmt.setString(4, "CJ");
		pstmt.setFloat(5, 30000.0f);
		
		pstmt.executeUpdate();
		
		c.commit();
	}

	private static void createDBTable(Connection c) throws SQLException {
		Statement stmt = c.createStatement();
		
		String sqlDropTable = "DROP TABLE IF EXISTS EMPLOYEE";
		String sqlCreateTable="CREATE TABLE EMPLOYEE("
				+ "ID INT PRIMARY KEY NOT NULL, "
				+ "NAME TEXT NOT NULL, "
				+ "AGE INT, "
				+ "ADDRESS CHAR(50), "
				+ "SALARY REAL)";
		
		stmt.executeUpdate(sqlDropTable);
		stmt.executeUpdate(sqlCreateTable);
		
		stmt.close();		
		c.commit();
	}

	
}
