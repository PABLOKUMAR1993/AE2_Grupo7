package grupo7.resta;

/** 
 * En esta clase encontraremos 4 m�todos relacionados con la <b>RESTA</b> de una calculadora.
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
	
	// 1. Resta de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula la <b>Diferencia</b> de dos n�meros reales.
	 *  
	 * @param Minuendo Ser� el n�mero al que queramos restar otra cantidad
	 * @param Sustraendo sera la cantidad que queramos restar al minuendo
	 * @return <b>Diferencia</b> como su propio nombre indica, ser� la direfencia del <u>minuendo</u> y el <u>sustraendo</u>.
	 */
	
	public double restaDosReales (double a, double b) {
		//TODO
		return 0; //Devuelve 0 para evitar el error al compilar 	
	}
	
	
	
	// 2. Resta de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula la <b>Diferencia</b> de dos n�meros enteros. 
	 * 
	 * @param Minuendo Ser� el n�mero al que queramos restar otra cantidad
	 * @param Sustraendo ser� la cantidad que queramos restar al minuendo
	 * @return <b>Diferencia</b> como su propio nombre indica, ser� la direfencia del <u>minuendo</u> y el <u>sustraendo</u>.
	 */
	
	public int restaDosEnteros (int a, int b) {
		//TODO
		return 0; //Devuelve 0 para evitar el error al compilar 	
	}
	
	
	
	// 3. Resta de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula la <b>cantidad restante</b> del minuendo tras haber restado 2 n�meros.
	 * <br>
	 * Paso a paso seria restar el sustraendo al minuendo, esa diferencia pasaria a ser el nuevo minuendo al que 
	 * volveriamos a restar el segundo sustraendo y obteniendo el resultado final.
	 * 
	 * @param Minuendo Ser� el n�mero al que queramos restar otras cantidades.
	 * @param Sustraendo1 ser� la cantidad que queramos restar al minuendo.
	 * @param Sustraendo2 ser� la cantidad que queremos restar al minuendo.
	 * @return <b>Diferencia</b> como su propio nombre indica, ser� la direfencia del <u>minuendo</u> y los <u>sustraendos</u>.
	 */
		
	public double restaUnoOtro (double a, double b, double c) {
		//TODO
		return 0; //Devuelve 0 para evitar el error al compilar 	
	}

	
	
	// 4. Resta con valor acumulado, tendr� un par�metro de entrada y la clase deber� de guardar el valor acumulado.
	
	/**
	 * M�todo que va <b>actualizando la diferencia resultante</b> de una acumulaci�n de restas.
	 * En esta operaci�n, el minuendo ser� el valor en este momento de la acumulaci�n de restas.
	 * 
	 * @param Sustraendo ser� la cantidad que queramos restar al valor acumulado tras "x" operaciones.
	 * @return <b>Diferencia</b> como su propio nombre indica, ser� la diferencia del <u>valor acumulado</u> y el <u>sustraendo</u>.
	 */
	
	public double restaValorAcumulado (double a) {
		//TODO
		return 0; //Devuelve 0 para evitar el error al compilar pero deberia devolver la Acumulaci�n de la resta, que seria el siguiente minuendo.	
	}
	
}

