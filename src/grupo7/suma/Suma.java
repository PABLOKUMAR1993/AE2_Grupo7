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

	


	/* 1.Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución. */ 
	/**
	 * Método que calcula la suma de dos números reales de tipo Double.
	 * @param a es el primer número de la suma.
	 * @param b es el segundo número de la suma.
	 * @return Devuelve la suma de dos números reales como un Double.
	 */
	public double calculoSumaDosReales (double a, double b){
		double i = a + b;
		acumuladoSuma = acumuladoSuma + i;
		return i;
	}



	/* 2.Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución. */
	/**
	 * Método que calcula la suma de dos números enteros de tipo Int.
	 * @param a es el primer número de la suma.
	 * @param b es el segundo número de la suma.
	 * @return Devuelve la suma de dos números enteros como un Int.
	 */
	public int calculoSumaDosEnteros (int a, int b){
		int i = a + b;
		acumuladoSuma = acumuladoSuma + (double)i;
		return i;
	}
	
	/* 3.Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución. */
	/**
	 * Método que calcula la suma de tres números reales de tipo Float.
	 * @param a es el primer valor de la suma.
	 * @param b es el segundo valor de la suma.
	 * @param c es el tercer valor de la suma.
	 * @return Devuelve la suma de los tres números como un Float.
	 */
	public float calculoSumaTresFloat (float a, float b, float c) {
		float i = a + b + c;
		acumuladoSuma = acumuladoSuma + (double)i;
		return i;
	}
	
	/* 4. Suma con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado. */
	/**
	 * Método que asigna el valor acumulado de una suma al atributo acumuladoSuma como tipo entero.
	 * @param a es el valor acumulado de una suma
	 * @return el valor introducido por parámetro (a) lo almacena en la variable acumuladoSuma en la clase Suma.java.
	 */
	public double valorAcumulado (double a) {
		acumuladoSuma = a;
		return acumuladoSuma;
	}
	
}

