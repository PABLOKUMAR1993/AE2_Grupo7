package grupo7.resta;

/** 
 * En esta clase encontraremos 4 m�todos relacionados con la <b>RESTA</b> de una calculadora.
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
		
	// 1. Resta de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula la <b>Diferencia</b> de dos n�meros reales.
	 *  
	 * @param minuendo Ser� el n�mero al que queramos restar otra cantidad
	 * @param sustraendo Ser� la cantidad que queramos restar al minuendo
	 * @return <b>Diferencia</b> como su propio nombre indica, ser� la diferencia del <u>minuendo</u> y �l <u>sustraendo</u>.
	 */
	
	public double restaDosReales (double minuendo, double sustraendo) {
		double i = minuendo - sustraendo;
		acumuladoResta = acumuladoResta + i;
		return i;
	}
	
	
	// 2. Resta de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula la <b>Diferencia</b> de dos n�meros enteros. 
	 * 
	 * @param minuendo Ser� el n�mero al que queramos restar otra cantidad
	 * @param sustraendo ser� la cantidad que queramos restar al minuendo
	 * @return <b>Diferencia</b> como su propio nombre indica, ser� la diferencia del <u>minuendo</u> y �l <u>sustraendo</u>.
	 */
	
	public int restaDosEnteros (int minuendo, int sustraendo) {
		int i = minuendo - sustraendo;
		acumuladoResta = acumuladoResta + i;
		return i; 
	}
	
	
	
	// 3. Resta de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula la <b>cantidad restante</b> del minuendo tras haber restado 2 n�meros.
	 * <br>
	 * Paso a paso seria restar el sustraendo al minuendo, esa diferencia pasar�a a ser el nuevo minuendo al que
	 * volver�amos a restar el segundo sustraendo y obteniendo el resultado final.
	 * 
	 * @param minuendo Ser� el n�mero al que queramos restar otras cantidades.
	 * @param sustraendo1 ser� la cantidad que queramos restar al minuendo.
	 * @param sustraendo2 ser� la cantidad que queremos restar al minuendo.
	 * @return <b>Diferencia</b> como su propio nombre indica, ser� la diferencia del <u>minuendo</u> y los <u>sustraendos</u>.
	 */
		
	public double restaUnoOtro (double minuendo, double sustraendo1, double sustraendo2) {
		double i = minuendo-sustraendo1-sustraendo2;
		acumuladoResta = acumuladoResta + i;
		return i; 	
	}

	
	
	// 4. Resta con valor acumulado, tendr� un par�metro de entrada y la clase deber� de guardar el valor acumulado.
	
	/**
	 * M�todo que va <b>actualizando la diferencia resultante</b> de una acumulaci�n de restas.
	 * En esta operaci�n, el minuendo ser� el valor en este momento de la acumulaci�n de restas.
	 * 
	 * @param sustraendo ser� la cantidad que queramos restar al valor acumulado tras "x" operaciones.
	 * @return <b>Diferencia</b> como su propio nombre indica, ser� la diferencia del <u>valor acumulado</u> y �l <u>sustraendo</u>.
	 */
	
	public double restaValorAcumulado (double sustraendo) {
		acumuladoResta = sustraendo;
		return acumuladoResta;
	}
		
}

