package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			// local
			//return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "user", "myUser");
			// remoto
			return DriverManager.getConnection("jdbc:mysql://www.owyeahgames.com.br/owyea276_fj21", "owyea276_user", "myUser");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
