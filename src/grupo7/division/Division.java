package grupo7.division;
/** 
 * En esta clase encontraremos 4 métodos relacionados con la <b>DIVISIÓN</b> de una calculadora.
 * <br>
 * Una <b>división</b> consiste en partir/dividir/fraccionar cualquier cosa en partes iguales.
 * <br>
 * Una <u>división</u> se compone de 4 elementos; <i><b>dividendo</b>, <b>divisor</b>, <b>cociente</b> y <b>resto</b></i>. 
 * Este último será omitido en las siguientes clases. Él <i>resto</i> es la cantidad de unidades insuficientes para formar
 * otra parte. Para evitar en mínimo error, utilizaremos números reales.
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
	 * @param dividendo número el cual queremos dividir.
	 * @param divisor número por el cual queremos dividir el dividendo.
	 * @return <b>Cociente</b> que será el resutado de la operación.
	 */
	
	public double divisionDosReales (double dividendo, double divisor) {
		double i = dividendo/divisor;
		return i;
	}
	
	
	
	// 2. División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula la <b>división</b> de un número entero entre otro
	 * Al utilizar números enteros, el resultado serán las unidades completas de la división omitiendo el resto.
	 * 
	 * @param dividendo número el cual queremos dividir
	 * @param divisor número por el cual queremos dividir el dividendo.
	 * @return <b>Cociente</b> que será el resutado de la operación.
	 */
	
	public int divisionDosEnteros (int dividendo, int divisor) {
		int i = dividendo/divisor;
		return i;
	}
	
	
	// 3. Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula el número inverso del introducido.
	 * Un número inverso de otro es aquel que al multiplicarlos da "1" o dicho de otra manera, el resultado de dividir una 
	 * unidad por ese número.
	 * 
	 * @param numero del que queremos averiguar su inverso
	 * @return El <b>resultado</b> de dividir una unidad por el número introducido.
	 */
		
	public double inverso (double numero) {
		double i= 1/numero;
		return i;
	}

	
	
	// 4. Raíz de un número, tendrá un parámetro de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula la <b>raíz cuadrada</b> de un número.
	 * <br>
	 * Hallar la raíz cuadrada de un número es hallar <i><b>otro</i></b> que al elevarlo al cuadrado, de como
	 * resultado el primero.
	 * 
	 * @param numero del que queremos averiguar su raíz cuadrada.
	 * @return <b>Número</b> hallado como resultado del método
	 */
	
	public double raiz (int numero) {
		int i = (int) (Math.sqrt(numero));
		return i; 	
	}
}
