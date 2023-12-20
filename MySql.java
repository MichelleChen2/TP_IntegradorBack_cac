import java.sql.*;

public class MySql {
	private final Databases database; 
	
	public MySql(Databases database) {
		this.database = database; 
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, "root", "1234"); 
	}
}
