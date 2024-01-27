package es.studium.PracticaTema2ED;
/**
 * 
 * Clase POJO Cliente
 *  @author Valentín Lorente Gómez
 */
public class Cliente {

	//Atributos
	    private String dni;
	    private String nombre;
	    private String direccion;

	    /**
	     * Constructor vacío Cliente
	     */
	    //Constructor vacío
		public Cliente() {
			dni = "";
			nombre = "";
			direccion = "";
		}
		
		/**
		 * Constructor por parámetros Cliente
		 * @param dni se asigna al atributo dni
		 * @param nombre se asigna al atributo nombre
		 * @param direccion se asugna al atributo direccion
		 */
	    //Construcctor por parámetros
	    public Cliente(String dni, String nombre, String direccion) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.direccion = direccion;
	    }

	    //Métodos gett y sett
	    
	    /**
	     * Método get del atributo dni
	     * @return devuelve el atributo dni
	     */
		public String getDni() {
			return dni;
		}

		/**
		 * Método set del atributo dni
		 * @param dni se asigna al atriobuto dni
		 */
		public void setDni(String dni) {
			this.dni = dni;
		}

	    /**
	     * Método get del atributo nombre
	     * @return devuelve el atributo nombre
	     */
		public String getNombre() {
			return nombre;
		}

	    /**
	     * Método set del atributo nombre
	     * @param nombre se asigna al atributo nombre
	     */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

	    /**
	     * Método get del atributo direccion
	     * @return devuelve el atributo direccion
	     */
		public String getDireccion() {
			return direccion;
		}

	    /**
	     * Método set del atributo direccion
	     * @param direccion se asigna al atributo direccion
	     */
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}    
}


