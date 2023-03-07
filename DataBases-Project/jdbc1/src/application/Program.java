package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;


public class Program {

	public static void main(String[] args) {
		//Connection conn = DB.getConnection();
		//DB.closeConnection();
				
		/*Consulta

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			conn = DB.getConnection();
			
			st = conn.createStatement(); //Instancia do objeto Statement
			
			rs = st.executeQuery("Select * FROM department");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
			DB.closeConnection();
		}
		
		----- Fim Consulta */ 

		/* INSERT
		Connection conn = null;
		PreparedStatement st = null;		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ " VALUES "
					+ "(?, ?, ?, ?, ?)");

			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ " VALUES "
					+ "(?, ?, ?, ?, ?)", 
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1,"Carl Purple");
			st.setString(2,"carl@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1988").getTime()));
			st.setDouble(4,3000.0);
			st.setInt(5,4);
			
			int rowsAffected = st.executeUpdate(); //Para alterar os dados
			
			//System.out.println("Done! Rows Affected: " + rowsAffected);
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys(); //retorna o ID incluido => pode retornar 1 ou mais valores, pode ter incluido mais de um registro
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id: " + id);
				}
			}else {
				System.out.println("No row affected");
			}

		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		*/
				
		/* Atualizar Dados
		Connection conn = null;
		PreparedStatement st = null;		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE seller "
					+ " SET "							
					+ "BaseSalary = BaseSalary + ?"
					+ " WHERE "
					+ "(DepartmentId = ?)");

			st.setDouble(1,200.0);
			st.setInt(2,2);			
			
			int rowsAffected = st.executeUpdate(); 
			
			System.out.println("Done! Rows Affected: " + rowsAffected);			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		*/
		
		//Deletar Registros
		Connection conn = null;
		PreparedStatement st = null;				
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ " WHERE "
					+ "Id = ?");

			st.setInt(1,5);
			int rowsAffected = st.executeUpdate(); 
			
			System.out.println("Done! Rows Affected: " + rowsAffected);			
		}catch(SQLException e) {
			throw new DbIntegrityException(e.getMessage());		
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}		
	}

}
