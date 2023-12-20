
public class Orador {
	
	private int id_orador; 
	private String nombre; 
	private String apellido; 
	private String tema; 
	private String mail; 
	private String fecha_alta; 
	
	public Orador(int id_orador, String nombre, String apelllido, String tema, String mail, String fecha_alta) {
		this.id_orador = id_orador; 
		this.apellido = apellido; 
		this.nombre = nombre; 
		this.tema = tema; 
		this.mail = mail; 
		this.fecha_alta = fecha_alta; 
	}
	
	public int getId() {
		return this.id_orador; 
	}
	
	public void setId(int idNuevo) {
		this.id_orador = idNuevo; 
	}
}
