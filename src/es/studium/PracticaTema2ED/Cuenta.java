package es.studium.PracticaTema2ED;

/**
 * 
 * Clase POJO Cuenta
 * @author Valentín Lorente Gómez
 */
public class Cuenta {

	//Atributos
    private int numero;
    private int saldo;
    private Cliente cliente;
    
    /**
     * Constructor vacío Cuenta
     */
    //Constructor vacío
	public Cuenta() {
		numero = 0;
		saldo = 0;
		cliente = new Cliente ();
	}
	
	/**
	 * Constructor por parámetros Cuenta
	 * @param numero se asigna al atributo numero
	 * @param saldo se asigna al atributo saldo
	 * @param cliente se asigna al atributo cliente
	 */
    //constructor por parámetros
    public Cuenta(int numero, int saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    //Métodos gett y sett
    
    /**
     * Método get del atributo numero
     * @return devuelve el atributo numero
     */
	public int getNumero() {
		return numero;
	}

    /**
     * Método set del atributo numero
     * @param numero se asigna al atributo numero
     */
	public void setNumero(int numero) {
		this.numero = numero;
	}

    /**
     * Método get del atributo saldo
     * @return devuelve el atributo saldo
     */
	public int getSaldo() {
		return saldo;
	}

    /**
     * Método set del atributo saldo
     * @param saldo se asigna al atributo saldo
     */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

    /**
     * Método get del atributo cliente
     * @return devuelve el atributo cliente
     */
	public Cliente getCliente() {
		return cliente;
	}

    /**
     * Método set del atributo cliente
     * @param cliente se asigna al atributo cliente
     */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}


