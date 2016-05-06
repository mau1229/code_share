public class Materia {
	
	private String nombre_profesor;
	private String salon;
	private String dia;
	private String hora_inicio;
	private String hora_final;
	
	public Materia( ){
		
		nombre_profesor = "";
		salon 			= "";		
		dia 			= "";
		hora_inicio 	= "";
		hora_final 		= "";
	}
	
	public Materia ( String iprofesor, String isalon, String idia, String ihorai, String ihoraf ){
		
		nombre_profesor = iprofesor;
		salon 			= isalon;		
		dia 			= idia;
		hora_inicio 	= ihorai;
		hora_final 		= ihoraf;		
	}
	
	// Getters //
	public String getNombre_profesor() {
		return nombre_profesor;
	}

	public String getSalon() {
		return salon;
	}

	public String getDia() {
		return dia;
	}

	public String getHora_inicio() {
		return hora_inicio;
	}

	public String getHora_final() {
		return hora_final;
	}

	// Setters //
	public void setNombre_profesor(String nombre_profesor) {
		this.nombre_profesor = nombre_profesor;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public void setHora_final(String hora_final) {
		this.hora_final = hora_final;
	}
	
	
	
	
}
