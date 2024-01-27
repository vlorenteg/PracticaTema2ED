package es.studium.PracticaTema2ED;
/**
 * 
 * Clase TestBanco
 * @author Valentín Lorente Gómez
 */
public class TestBanco 
{
	/**
	 * Declaramos la constante dineroRetirado
	 */
	public static final int dineroRetirado = 30;
	/**
	 * Declaramos la constante dineroGanado
	 */
	public static final int dineroGanado = 100;

	/**
	 * Método de la clase Principal por el que empieza la ejecución del programa.
	 * @param args Parámetro del método main
	 */
	public static void main(String[] args)
	{
		
	/* Antonio y Beatriz se hacen clientes del banco */
	Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av.Pueblo Saharaui, s/n");
	Cliente beatriz = new Cliente("987654321A", "Beatriz BenÃ­tez","Calle Sol, 4");
	
	/* Por defecto, todas las cuentas nuevas tienen 100*/
	Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
	Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
	
	/* Antonio y Beatriz consultan el saldo */
	mostrarSaldo(cuentaAntonio, cuentaBeatriz);
	
	/* Beatriz transfiere 50 a Antonio */
	transferirDinero(cuentaAntonio, cuentaBeatriz);
	
	/* Antonio y Beatriz vuelven a consultar su saldo para comprobar que todo ha ido bien */
	mostrarSaldo(cuentaAntonio, cuentaBeatriz);
			
	/* Antonio gana 100 en una rifa y lo ingresa en su cuenta */
	cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + dineroGanado);
			
	/* Beatriz tiene que pagar 30 a hacienda y retira el dinero */
	cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - dineroRetirado);
	
	/* Antonio y Beatriz consultan de nuevo el saldo de su cuenta. */
	mostrarSaldo(cuentaAntonio, cuentaBeatriz);
			
	/* Antonio transfiere 50 a Beatriz y vuelven a consultar el saldo de su cuenta */
	transferirDinero(cuentaBeatriz, cuentaAntonio);
	mostrarSaldo(cuentaAntonio, cuentaBeatriz);
			}

	/**
	 * 
	 * @param destino se asigna al atributo destino
	 * @param origen se asigna al atributo origen
	 */
	public static void transferirDinero(Cuenta destino, Cuenta origen) {
		origen.setSaldo(origen.getSaldo() - 50);
		destino.setSaldo(destino.getSaldo() + 50);
	}

	/**
	 * 
	 * @param cuentaAntonio se asigna al atributo cuentaAntonio
	 * @param cuentaBeatriz se asigna al atributo cuentaBeatriz
	 */
	public static void mostrarSaldo(Cuenta cuentaAntonio, Cuenta cuentaBeatriz) {
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + " tiene " + cuentaAntonio.getSaldo() + "euros.");
		System.out.println("La cuenta de " + cuentaBeatriz.getCliente().getNombre() + " tiene " + cuentaBeatriz.getSaldo() + "euros.");
	} 
}




    



