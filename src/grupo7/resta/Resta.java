package grupo7.resta;

/** 
 * En esta clase encontraremos 4 métodos relacionados con la <b>RESTA</b> de una calculadora.
 * <br>
 * <b>Restar</b> Consiste en quitar una cantidad a otra.
 * <br>
 * Una <u>resta</u> se compone de 3 elementos; <b>minuendo</b>, <b>sustraendo</b> y <b>diferencia</b>. 
 * 
 * @version v1.0
 * @author Raul M
 * 
 */

public class Resta {
	
	// Variables 
	private static double acumuladoResta;
	
	public double getAcumuladoResta() {
		return acumuladoResta;
	}
	public void setAcumuladoResta(double acumuladoResta) {
		Resta.acumuladoResta = acumuladoResta;
	}	
		
	// 1. Resta de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula la <b>Diferencia</b> de dos números reales.
	 *  
	 * @param minuendo Será el número al que queramos restar otra cantidad
	 * @param sustraendo Será la cantidad que queramos restar al minuendo
	 * @return <b>Diferencia</b> como su propio nombre indica, será la diferencia del <u>minuendo</u> y él <u>sustraendo</u>.
	 */
	
	public double restaDosReales (double minuendo, double sustraendo) {
		double i = minuendo - sustraendo;
		acumuladoResta = acumuladoResta + i;
		return i;
	}
	
	
	// 2. Resta de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula la <b>Diferencia</b> de dos números enteros. 
	 * 
	 * @param minuendo Será el número al que queramos restar otra cantidad
	 * @param sustraendo será la cantidad que queramos restar al minuendo
	 * @return <b>Diferencia</b> como su propio nombre indica, será la diferencia del <u>minuendo</u> y él <u>sustraendo</u>.
	 */
	
	public int restaDosEnteros (int minuendo, int sustraendo) {
		int i = minuendo - sustraendo;
		acumuladoResta = acumuladoResta + i;
		return i; 
	}
	
	
	
	// 3. Resta de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
	
	/**
	 * Método que calcula la <b>cantidad restante</b> del minuendo tras haber restado 2 números.
	 * <br>
	 * Paso a paso seria restar el sustraendo al minuendo, esa diferencia pasaría a ser el nuevo minuendo al que
	 * volveríamos a restar el segundo sustraendo y obteniendo el resultado final.
	 * 
	 * @param minuendo Será el número al que queramos restar otras cantidades.
	 * @param sustraendo1 será la cantidad que queramos restar al minuendo.
	 * @param sustraendo2 será la cantidad que queremos restar al minuendo.
	 * @return <b>Diferencia</b> como su propio nombre indica, será la diferencia del <u>minuendo</u> y los <u>sustraendos</u>.
	 */
		
	public double restaUnoOtro (double minuendo, double sustraendo1, double sustraendo2) {
		double i = minuendo-sustraendo1-sustraendo2;
		acumuladoResta = acumuladoResta + i;
		return i; 	
	}

	
	
	// 4. Resta con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado.
	
	/**
	 * Método que va <b>actualizando la diferencia resultante</b> de una acumulación de restas.
	 * En esta operación, el minuendo será el valor en este momento de la acumulación de restas.
	 * 
	 * @param sustraendo será la cantidad que queramos restar al valor acumulado tras "x" operaciones.
	 * @return <b>Diferencia</b> como su propio nombre indica, será la diferencia del <u>valor acumulado</u> y él <u>sustraendo</u>.
	 */
	
	public double restaValorAcumulado (double sustraendo) {
		acumuladoResta = sustraendo;
		return acumuladoResta;
	}
		
}

