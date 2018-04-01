public class Persona implements Comparable<Persona>{

	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	private Direccion direccion;
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Persona(String nombre, String apellidos, String dni, int edad, String calle, int numero, int cp, String provincia) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		this.direccion = new Direccion(calle,numero,cp,provincia);
		
	}
	
	public String toString() {
		
		String mensaje = nombre + ","  + apellidos + "," + dni + ","+ edad + "," + direccion.getCalle() + "," + direccion.getNumero() + "," + direccion.getCp() + "," + direccion.getProvincia();
				
		return mensaje;
		
	}
	
	public int compareTo(Persona o) {
		
		int compare = apellidos.compareTo(o.apellidos);
		
		return compare;
		
	}
	
}
