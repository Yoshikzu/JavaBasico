package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DBException;
import db.DbIntegrityException;


public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;				
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false); //Todas ações ficarão pendentes para confirmar
			
			st = conn.createStatement();

			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090.0 WHERE DepartmentId = 1");
			
			int x = 1;
			if(x < 2) //Simulação de uma exceção
				throw new SQLException("Fake error");
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090.0 WHERE DepartmentId = 2");
			
			conn.commit();
			System.out.println("Done! Rows 1: " + rows1);
			System.out.println("Done! Rows 2: " + rows2);
		}catch(SQLException e) {
			try {
				conn.rollback();
				throw new DBException("Transaction rolled back! Caused by " + e.getMessage());
			} catch (SQLException e1) {			
				throw new DBException("Error try to rolled back! Caused by " + e1.getMessage());
			}
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}		
	}

}
