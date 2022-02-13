package grupo7.resta;

/** 
 * En esta clase encontraremos 4 métodos relacionados con la <b>RESTA</b> de una calculadora.
 * <br>
 * <b>Restar</b> consiste en quitar una cantidad a otra.
 * <br>
 * Una <u>resta</u> se compone de 3 elementos; <b>minuendo</b>, <b>sustraendo</b> y <b>diferencia</b>. 
 * 
 * @version v1.0
 * @author Raul M
 * 
 */

public class Resta {
	
	// 1. Resta de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula la <b>Diferencia</b> de dos números reales.
	 *  
	 * @param Minuendo Será el número al que queramos restar otra cantidad
	 * @param Sustraendo sera la cantidad que queramos restar al minuendo
	 * @return <b>Diferencia</b> como su propio nombre indica, será la direfencia del <u>minuendo</u> y el <u>sustraendo</u>.
	 */
	
	public double restaDosReales (double a, double b) {
		//TODO
		return 0; //Devuelve 0 para evitar el error al compilar 	
	}
	
	
	
	// 2. Resta de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula la <b>Diferencia</b> de dos números enteros. 
	 * 
	 * @param Minuendo Será el número al que queramos restar otra cantidad
	 * @param Sustraendo será la cantidad que queramos restar al minuendo
	 * @return <b>Diferencia</b> como su propio nombre indica, será la direfencia del <u>minuendo</u> y el <u>sustraendo</u>.
	 */
	
	public int restaDosEnteros (int a, int b) {
		//TODO
		return 0; //Devuelve 0 para evitar el error al compilar 	
	}
	
	
	
	// 3. Resta de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula la <b>cantidad restante</b> del minuendo tras haber restado 2 números.
	 * <br>
	 * Paso a paso seria restar el sustraendo al minuendo, esa diferencia pasaria a ser el nuevo minuendo al que 
	 * volveriamos a restar el segundo sustraendo y obteniendo el resultado final.
	 * 
	 * @param Minuendo Será el número al que queramos restar otras cantidades.
	 * @param Sustraendo1 será la cantidad que queramos restar al minuendo.
	 * @param Sustraendo2 será la cantidad que queremos restar al minuendo.
	 * @return <b>Diferencia</b> como su propio nombre indica, será la direfencia del <u>minuendo</u> y los <u>sustraendos</u>.
	 */
		
	public double restaUnoOtro (double a, double b, double c) {
		//TODO
		return 0; //Devuelve 0 para evitar el error al compilar 	
	}

	
	
	// 4. Resta con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado.
	
	/**
	 * Método que va <b>actualizando la diferencia resultante</b> de una acumulación de restas.
	 * En esta operación, el minuendo será el valor en este momento de la acumulación de restas.
	 * 
	 * @param Sustraendo será la cantidad que queramos restar al valor acumulado tras "x" operaciones.
	 * @return <b>Diferencia</b> como su propio nombre indica, será la diferencia del <u>valor acumulado</u> y el <u>sustraendo</u>.
	 */
	
	public double restaValorAcumulado (double a) {
		//TODO
		return 0; //Devuelve 0 para evitar el error al compilar pero deberia devolver la Acumulación de la resta, que seria el siguiente minuendo.	
	}
	
}

