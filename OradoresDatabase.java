import java.sql.*;

public class OradoresDatabase {
	
	// Conexión
	public Connection mysql; 
	
	// Campos
	private final String campId = "id_orador"; 
	private final String campNombre = "nombre"; 
	private final String campApellido = "apellido";
	private final String campMail = "mail";
	private final String campTema = "tema"; 
	private final String campFecha = "fecha_alta"; 
	
	// Consultas
	private final String buscoNombre = "SELECT * FROM " + Databases.oradores + "WHERE " + campNombre + "= ?"; 
	private final String buscoId = "SELECT * FROM" + Databases.oradores + "WHERE" + campId " = ?"; 
	
	public OradoresDatabase() {
		try {
			mysql = new MySql(Databases.oradores).getConnection();
		} catch (SQLException error) {
			error.printStackTrace(); 
		}
	}
	
	public Orador buscarNombre(String nombre) throws SQLException {
		PreparedStatement hojaVirtual = mysql.prepareStatement(buscoNombre);
		hojaVirtual.setString(2, nombre);
		ResultSet data = hojaVirtual.executeQuery(); 
		Orador orador = null; 
		
		while(data.next()) {
			orador = new Orador(data.getInt(campId), data.getString(campNombre), 
								data.getString(campApellido), data.getString(campTema), 
								data.getString(campMail), data.getString(campFecha)); 
		}
		
		return orador; 
	}
	
	public Orador buscarId(int Id) throws SQLException {
		PreparedStatement hojaVirtual = mysql.prepareStatement(buscoId); 
		hojaVirtual.setInt(1, Id);
		ResultSet data = hojaVirtual.executeQuery(); 
		Orador orador = null; 
		
		while (data.next()) {
			orador = new Orador(data.getInt(campId), data.getString(campNombre), 
					data.getString(campApellido), data.getString(campTema), 
					data.getString(campMail), data.getString(campFecha)); 
		}
		return orador; 
	}
}
