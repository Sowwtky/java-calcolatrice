package jana60;

public class CalcoliHelper {

	private CalcoliHelper() {
		
	}
	
	public static int somma (int primoNumero, int secondoNumero) {
		return primoNumero+secondoNumero;
	}
	
	public static int differenza (int primoNumero, int secondoNumero) {
		return primoNumero - secondoNumero;
	}
	
	public static int moltiplicazione (int primoNumero, int secondoNumero) {
		return primoNumero * secondoNumero;
	} 
	
	public static int valoreAssoluto (int primoNumero) {
		if (primoNumero >= 0) {
			return primoNumero;
		} else {
			return primoNumero * -1;
		}
	}
	
	public static int numeroMassimo (int primoNumero, int secondoNumero) {
		if (primoNumero > secondoNumero) {
			return primoNumero;
		} else {
			return secondoNumero;
		}
	}
	
	public static int numeroMinimo(int primoNumero, int secondoNumero) {
		if (primoNumero < secondoNumero) {
			return primoNumero;
		} else {
			return secondoNumero;
		}
	}
}
