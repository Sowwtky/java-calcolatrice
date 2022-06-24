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
	
	public static double potenza (int primoNumero, int secondoNumero) {
		double potenza = 1;
		double risultato = 1;
		
		if (primoNumero == 0 && secondoNumero == 0) { 
			return 1;
			
		} else if (secondoNumero < 0) {
			
			for (int i = 1; i <= -secondoNumero; i++) {
				potenza = potenza * primoNumero;
				
		}
			risultato = 1/potenza;
			return risultato;
			
		} else {
			for (int i = 1; i <= secondoNumero; i++) {
				potenza = potenza * primoNumero;
		}
			return potenza;
	    }
	}
	//overload
	
	public static double somma (double primoNumero, double secondoNumero) {
		return primoNumero+secondoNumero;
	}
	
	public static double differenza (double primoNumero, double secondoNumero) {
		return primoNumero - secondoNumero;
	}
	
	public static double moltiplicazione (double primoNumero, double secondoNumero) {
		return primoNumero * secondoNumero;
	} 
	
	public static double valoreAssoluto (double primoNumero) {
		if (primoNumero >= 0) {
			return primoNumero;
		} else {
			return primoNumero * -1;
		}
	}
	
	public static double numeroMassimo (double primoNumero, double secondoNumero) {
		if (primoNumero > secondoNumero) {
			return primoNumero;
		} else {
			return secondoNumero;
		}
	}
	
	public static double numeroMinimo(double primoNumero, double secondoNumero) {
		if (primoNumero < secondoNumero) {
			return primoNumero;
		} else {
			return secondoNumero;
		}
	}
	
}
