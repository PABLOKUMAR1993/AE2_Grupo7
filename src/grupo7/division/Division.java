package grupo7.division;
/** 
 * En esta clase encontraremos 4 m�todos relacionados con la <b>DIVISI�N</b> de una calculadora.
 * <br>
 * Una <b>divisi�n</b> consiste en partir/dividir/fraccionar cualquier cosa en partes iguales.
 * <br>
 * Una <u>divisi�n</u> se compone de 4 elementos; <i><b>dividendo</b>, <b>divisor</b>, <b>cociente</b> y <b>resto</b></i>. 
 * Este �ltimo ser� omitido en las siguientes clases. �l <i>resto</i> es la cantidad de unidades insuficientes para formar
 * otra parte. Para evitar en m�nimo error, utilizaremos n�meros reales.
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
	 * @param dividendo n�mero el cual queremos dividir.
	 * @param divisor n�mero por el cual queremos dividir el dividendo.
	 * @return <b>Cociente</b> que ser� el resutado de la operaci�n.
	 */
	
	public double divisionDosReales (double dividendo, double divisor) {
		double i = dividendo/divisor;
		return i;
	}
	
	
	
	// 2. Divisi�n de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula la <b>divisi�n</b> de un n�mero entero entre otro
	 * Al utilizar n�meros enteros, el resultado ser�n las unidades completas de la divisi�n omitiendo el resto.
	 * 
	 * @param dividendo n�mero el cual queremos dividir
	 * @param divisor n�mero por el cual queremos dividir el dividendo.
	 * @return <b>Cociente</b> que ser� el resutado de la operaci�n.
	 */
	
	public int divisionDosEnteros (int dividendo, int divisor) {
		int i = dividendo/divisor;
		return i;
	}
	
	
	// 3. Inverso de un n�mero real, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula el n�mero inverso del introducido.
	 * Un n�mero inverso de otro es aquel que al multiplicarlos da "1" o dicho de otra manera, el resultado de dividir una 
	 * unidad por ese n�mero.
	 * 
	 * @param numero del que queremos averiguar su inverso
	 * @return El <b>resultado</b> de dividir una unidad por el n�mero introducido.
	 */
		
	public double inverso (double numero) {
		double i= 1/numero;
		return i;
	}

	
	
	// 4. Ra�z de un n�mero, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * M�todo que calcula la <b>ra�z cuadrada</b> de un n�mero.
	 * <br>
	 * Hallar la ra�z cuadrada de un n�mero es hallar <i><b>otro</i></b> que al elevarlo al cuadrado, de como
	 * resultado el primero.
	 * 
	 * @param numero del que queremos averiguar su ra�z cuadrada.
	 * @return <b>N�mero</b> hallado como resultado del m�todo
	 */
	
	public double raiz (int numero) {
		int i = (int) (Math.sqrt(numero));
		return i; 	
	}
}
