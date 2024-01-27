package es.studium.PracticaTema2ED;

public class Cuenta {

	//Atributos
    private int numero;
    private int saldo;
    private Cliente cliente;
    
    //Constructor vacío
	public Cuenta() {
		numero = 0;
		saldo = 0;
		cliente = new Cliente ();
	}
	
    //constructor por parametros
    public Cuenta(int numero, int saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    //Métodos gett y sett
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}


