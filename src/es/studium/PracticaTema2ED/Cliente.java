package es.studium.PracticaTema2ED;

public class Cliente {

	//Atributos
	    private String dni;
	    private String nombre;
	    private String direccion;

	    //Constructor vacio
		public Cliente() {
			dni = "";
			nombre = "";
			direccion = "";
		}
		
	    //Construcctor por parametros
	    public Cliente(String dni, String nombre, String direccion) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.direccion = direccion;
	    }

	    //Métodos gett y sett
		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}    
}


