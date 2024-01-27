package es.studium.PracticaTema2ED;

/**
 * 
 * Clase POJO Cuenta
 * @author Valent�n Lorente G�mez
 */
public class Cuenta {

	//Atributos
    private int numero;
    private int saldo;
    private Cliente cliente;
    
    /**
     * Constructor vac�o Cuenta
     */
    //Constructor vac�o
	public Cuenta() {
		numero = 0;
		saldo = 0;
		cliente = new Cliente ();
	}
	
	/**
	 * Constructor por par�metros Cuenta
	 * @param numero se asigna al atributo numero
	 * @param saldo se asigna al atributo saldo
	 * @param cliente se asigna al atributo cliente
	 */
    //constructor por par�metros
    public Cuenta(int numero, int saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    //M�todos gett y sett
    
    /**
     * M�todo get del atributo numero
     * @return devuelve el atributo numero
     */
	public int getNumero() {
		return numero;
	}

    /**
     * M�todo set del atributo numero
     * @param numero se asigna al atributo numero
     */
	public void setNumero(int numero) {
		this.numero = numero;
	}

    /**
     * M�todo get del atributo saldo
     * @return devuelve el atributo saldo
     */
	public int getSaldo() {
		return saldo;
	}

    /**
     * M�todo set del atributo saldo
     * @param saldo se asigna al atributo saldo
     */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

    /**
     * M�todo get del atributo cliente
     * @return devuelve el atributo cliente
     */
	public Cliente getCliente() {
		return cliente;
	}

    /**
     * M�todo set del atributo cliente
     * @param cliente se asigna al atributo cliente
     */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}


