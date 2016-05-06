
public class Usuario {

	private int 			  cuenta;
	private String			  nombre;
	private String 			  contra;
	private String			  grupo;
	
	// Constructor vacío que previene crear un usuario nulo //
	public Usuario( ){
		
		cuenta = 0;
		nombre = "";
		contra = "";
		grupo  = "";
	}
	
	// Contructor que recibe los datos incluídos // 
	public Usuario( int i_cuenta, String i_nombre, String i_contra, String i_grupo  ){
		
	cuenta = i_cuenta;
	nombre = i_nombre;
	contra = i_contra;
	grupo  = i_grupo;
	}
	
	// Constructor que recibe otro usuario y copia sus valores //
	public Usuario( Usuario reference ){
		
		this.cuenta = reference.cuenta;
		this.nombre = reference.nombre;		
		this.contra = reference.contra;		
		this.grupo  = reference.grupo;
	}

	// Getters //
	public int getCuenta() {
		return cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getContra() {
		return contra;
	}

	public String getGrupo() {
		return grupo;
	}

	// Setters // 
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	// Imprime los datos del usuario que lo ejecuta //
	public void printUser( ){
		
		System.out.println( "Cuenta: " + this.getCuenta( ) );
		System.out.println( "Nombre: " + this.getNombre( ) );
		System.out.println( "Contra: " + this.getContra( ) );
		System.out.println( "Grupo: " + this.getGrupo( ) );
	}
	
	
	
	
	
	
}
