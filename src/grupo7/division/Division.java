package grupo7.division;
/** 
 * En esta clase encontraremos 4 m�todos relacionados con la <b>DIVISI�N</b> de una calculadora.
 * <br>
 * Una <b>divisi�n</b> consiste en partir/divicir/fraccionar cualquier cosa en partes iguales.
 * <br>
 * Una <u>divisi�n</u> se compone de 4 elementos; <i><b>dividendo</b>, <b>divisor</b>, <b>cociente</b> y <b>resto</b></i>. 
 * Este �ltimo sera omitido en las siguientes clases. El <i>resto</i> es la cantidad de unidades insuficientes para formar
 * otra parte. Para evitar en minimo error, utilizaremos n�meros reales.
 * 
 * @version v1.0
 * @author Raul M
 * 
 */

public class Division {
	
	// 1. Divisi�n de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula la <b>divisi�n</b> de un n�mero real entre otro.
	 *
	 * @param Dividendo n�mero el cual queremos dividir.
	 * @param Divisor n�mero por el cual queremos dividir el dividento
	 * @return <b>Cociente</b> que sera el resutado de la operaci�n.
	 * @throws arithmeticException el divisor nunca puede ser 0 porque dara error.
	 */
	
	public double divisionDosReales (double a, double b) throws ArithmeticException {
		double i = a/b;
		return i; 	
	}
	
	
	
	// 2. Divisi�n de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula la <b>divisi�n</b> de un n�mero entero entre otro
	 * Al utilizar n�meros enteros, el resultado seran las unidades completas de la divisi�n omitiendo el resto.
	 * 
	 * @param Dividendo n�mero el cual queremos dividir 
	 * @param Divisor n�mero por el cual queremos dividir el dividento
	 * @return <b>Cociente</b> que sera el resutado de la operaci�n.
	 * @throws arithmeticException el divisor nunca puede ser 0 porque dara error.
	 */
	
	public int divisionDosEnteros (int a, int b) throws ArithmeticException {
		int i = a/b;
		return i;
	}
	
	
	// 3. Inverso de un n�mero real, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula el numero inverso del introducido. 
	 * Un n�mero inverso de otro es aquel que al multiplicarlos da "1" o dicho de otra manera, el resultado de dividir una 
	 * unidad por ese n�mero.
	 * 
	 * @param N�mero del que queremos averiguar su inverso
	 * @return El <b>resultado</b> de dividir una unidad por el n�mero introducido.
	 */
		
	public int inverso (int a) {
		int i= 1/a;
		return i;
	}

	
	
	// 4. Ra�z de un n�mero, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula la <b>raiz cuadrada</b> de un n�mero. 
	 * <br>
	 * Hallar la raiz cuadrada de un n�mero es hallar <i><b>otro</i></b> que al elevarlo al cuadrado, de como 
	 * resultado el primero.
	 * 
	 * @param N�mero del que queremos averiguar su ra�z cuadrada.
	 * @return <b>N�mero</b> hallado como resultado del m�todo
	 */
	
	public double raiz (int a) {
		int i = (Math.sqrt(a));
		return i; 	
	}
}
