package jdbc.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaHSQLDB {

	public static void main(String[] args) {

		// DriverManager.getConnection("jdbc:hsqldb:file:/Banco/HSQLDB;hsqldb.lock_file=false","user","myUser");
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:hsqldb:file:/Banco/dbtest", "user", "myUser");

			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM contatos");

			while (rs.next()) {
				String nome = rs.getString("nome");
				String email = rs.getString("email");

				System.out.println(nome + " - " + email);
			}
			stm.execute("SHUTDOWN");
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar o driver JDBC. ");
		} catch (SQLException e) {
			System.out.println("Erro de SQL: " + e);
			e.printStackTrace();
		}
	}

}
