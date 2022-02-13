package grupo7.division;
/** 
 * En esta clase encontraremos 4 métodos relacionados con la <b>DIVISIÓN</b> de una calculadora.
 * <br>
 * Una <b>división</b> consiste en partir/divicir/fraccionar cualquier cosa en partes iguales.
 * <br>
 * Una <u>división</u> se compone de 4 elementos; <i><b>dividendo</b>, <b>divisor</b>, <b>cociente</b> y <b>resto</b></i>. 
 * Este último sera omitido en las siguientes clases. El <i>resto</i> es la cantidad de unidades insuficientes para formar
 * otra parte. Para evitar en minimo error, utilizaremos números reales.
 * 
 * @version v1.0
 * @author Raul M
 * 
 */

public class Division {
	
	// 1. División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula la <b>división</b> de un número real entre otro.
	 *
	 * @param Dividendo número el cual queremos dividir.
	 * @param Divisor número por el cual queremos dividir el dividento
	 * @return <b>Cociente</b> que sera el resutado de la operación.
	 * @throws arithmeticException el divisor nunca puede ser 0 porque dara error.
	 */
	
	public double divisionDosReales (double a, double b) throws ArithmeticException {
		double i = a/b;
		return i; 	
	}
	
	
	
	// 2. División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula la <b>división</b> de un número entero entre otro
	 * Al utilizar números enteros, el resultado seran las unidades completas de la división omitiendo el resto.
	 * 
	 * @param Dividendo número el cual queremos dividir 
	 * @param Divisor número por el cual queremos dividir el dividento
	 * @return <b>Cociente</b> que sera el resutado de la operación.
	 * @throws arithmeticException el divisor nunca puede ser 0 porque dara error.
	 */
	
	public int divisionDosEnteros (int a, int b) throws ArithmeticException {
		int i = a/b;
		return i;
	}
	
	
	// 3. Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula el numero inverso del introducido. 
	 * Un número inverso de otro es aquel que al multiplicarlos da "1" o dicho de otra manera, el resultado de dividir una 
	 * unidad por ese número.
	 * 
	 * @param Número del que queremos averiguar su inverso
	 * @return El <b>resultado</b> de dividir una unidad por el número introducido.
	 */
		
	public int inverso (int a) {
		int i= 1/a;
		return i;
	}

	
	
	// 4. Raíz de un número, tendrá un parámetro de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula la <b>raiz cuadrada</b> de un número. 
	 * <br>
	 * Hallar la raiz cuadrada de un número es hallar <i><b>otro</i></b> que al elevarlo al cuadrado, de como 
	 * resultado el primero.
	 * 
	 * @param Número del que queremos averiguar su raíz cuadrada.
	 * @return <b>Número</b> hallado como resultado del método
	 */
	
	public double raiz (int a) {
		int i = (Math.sqrt(a));
		return i; 	
	}
}
