package es.studium.PracticaTema2ED;
/**
 * 
 * Clase POJO Cliente
 *  @author Valent�n Lorente G�mez
 */
public class Cliente {

	//Atributos
	    private String dni;
	    private String nombre;
	    private String direccion;

	    /**
	     * Constructor vac�o Cliente
	     */
	    //Constructor vac�o
		public Cliente() {
			dni = "";
			nombre = "";
			direccion = "";
		}
		
		/**
		 * Constructor por par�metros Cliente
		 * @param dni se asigna al atributo dni
		 * @param nombre se asigna al atributo nombre
		 * @param direccion se asugna al atributo direccion
		 */
	    //Construcctor por par�metros
	    public Cliente(String dni, String nombre, String direccion) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.direccion = direccion;
	    }

	    //M�todos gett y sett
	    
	    /**
	     * M�todo get del atributo dni
	     * @return devuelve el atributo dni
	     */
		public String getDni() {
			return dni;
		}

		/**
		 * M�todo set del atributo dni
		 * @param dni se asigna al atriobuto dni
		 */
		public void setDni(String dni) {
			this.dni = dni;
		}

	    /**
	     * M�todo get del atributo nombre
	     * @return devuelve el atributo nombre
	     */
		public String getNombre() {
			return nombre;
		}

	    /**
	     * M�todo set del atributo nombre
	     * @param nombre se asigna al atributo nombre
	     */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

	    /**
	     * M�todo get del atributo direccion
	     * @return devuelve el atributo direccion
	     */
		public String getDireccion() {
			return direccion;
		}

	    /**
	     * M�todo set del atributo direccion
	     * @param direccion se asigna al atributo direccion
	     */
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}    
}


