package grupo7.suma;

/**
 * 
 * @author Davas
 * @version 1.0
 */

public class Suma {
	// Variables - Atributos
	private static double acumuladoSuma;
	
	// Constructores
	public Suma() {
		super();
	}
	
	
	
	public double getAcumuladoSuma() {
		return acumuladoSuma;
	}



	public void setAcumuladoSuma(double acumuladoSuma) {
		Suma.acumuladoSuma = acumuladoSuma;
	}

	


	/* 1.Suma de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n. */ 
	/**
	 * M�todo que calcula la suma de dos n�meros reales de tipo Double.
	 * @param a es el primer n�mero de la suma.
	 * @param b es el segundo n�mero de la suma.
	 * @return Devuelve la suma de dos n�meros reales como un Double.
	 */
	public double calculoSumaDosReales (double a, double b){
		double i = a + b;
		acumuladoSuma = acumuladoSuma + i;
		return i;
	}



	/* 2.Suma de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n. */
	/**
	 * M�todo que calcula la suma de dos n�meros enteros de tipo Int.
	 * @param a es el primer n�mero de la suma.
	 * @param b es el segundo n�mero de la suma.
	 * @return Devuelve la suma de dos n�meros enteros como un Int.
	 */
	public int calculoSumaDosEnteros (int a, int b){
		int i = a + b;
		acumuladoSuma = acumuladoSuma + (double)i;
		return i;
	}
	
	/* 3.Suma de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n. */
	/**
	 * M�todo que calcula la suma de tres n�meros reales de tipo Float.
	 * @param a es el primer valor de la suma.
	 * @param b es el segundo valor de la suma.
	 * @param c es el tercer valor de la suma.
	 * @return Devuelve la suma de los tres n�meros como un Float.
	 */
	public float calculoSumaTresFloat (float a, float b, float c) {
		float i = a + b + c;
		acumuladoSuma = acumuladoSuma + (double)i;
		return i;
	}
	
	/* 4. Suma con valor acumulado, tendr� un par�metro de entrada y la clase deber� de guardar el valor acumulado. */
	/**
	 * M�todo que asigna el valor acumulado de una suma al atributo acumuladoSuma como tipo entero.
	 * @param a es el valor acumulado de una suma
	 * @return el valor introducido por par�metro (a) lo almacena en la variable acumuladoSuma en la clase Suma.java.
	 */
	public double valorAcumulado (double a) {
		acumuladoSuma = a;
		return acumuladoSuma;
	}
	
}

