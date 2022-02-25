package tests.grupo7.resta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import grupo7.resta.*;


class TestResta {

	// Creamos el atributo rest de tipo Resta para invocar a los métodos de la clase Resta.
	private Resta rest;
	private Resta restAcum = new Resta();	

	@BeforeEach
	void setUp() throws Exception {
	//Creado este objeto antes de cada test para que esté siempre vacío
	rest = new Resta();	
	}
	
	/********************************** 
	 * TEST MÉTODO restaDosReales
	 **********************************/
	
	@Test
	@DisplayName ("Test Resta dos numeros reales positivos")
	public void TestRestaDosReales() {	
		// Resultados esperados método
		double resultadoEsperado = 2.9;		
		double resultadoObtenido = rest.restaDosReales(5.25, 2.35);		
		assertEquals(resultadoEsperado, resultadoObtenido);	
	}
	
	
	@Test
	@DisplayName ("Test Resta a un número positivo uno negativo")
	public void TestRestaDosReales2() {	
		// Resultados esperados método
		double resultadoEsperado = 13.6;
		double resultadoObtenido = rest.restaDosReales(10.33, -3.27);		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	@Test
	@DisplayName ("Test Resta dos numeros Reales iguales")
	public void TestRestaDosReales3() {	
		// Resultados esperados método
		double resultadoEsperado = 0.0;
		double resultadoObtenido = rest.restaDosReales(7.0, 7.0);		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	/********************************** 
	 * TEST MÉTODO restaDosEnteros
	 **********************************/	
	
	@Test
	@DisplayName ("Test Resta dos numeros enteros positivos")
	public void TestRestaDosEnteros() {	
		// Resultados esperados método
		int resultadoEsperado = 3;		
		int resultadoObtenido = rest.restaDosEnteros(5, 2);		
		assertEquals(resultadoEsperado, resultadoObtenido);		
	}
	
	
	@Test
	@DisplayName ("Test Resta a un número enteros uno negativo")
	public void TestRestaDosEnteros2() {	
		// Resultados esperados método
		int resultadoEsperado = 13;
		int resultadoObtenido = rest.restaDosEnteros(10, -3);		
		assertEquals(resultadoEsperado, resultadoObtenido);	
	}
	
	
	@Test
	@DisplayName ("Test Resta dos numeros enteros iguales")
	public void TestRestaDosEnteros3() {	
		// Resultados esperados método
		int resultadoEsperado = 0;
		int resultadoObtenido = rest.restaDosEnteros(7, 7);		
	
	}

	
	/********************************** 
	 * TEST MÉTODO restaUnoOtro
	 **********************************/	
	
	@Test
	@DisplayName ("Test Resta tres numeros reales positivos")
	public void TestRestaTresReales() {	
		// Resultados esperados método
		double resultadoEsperado = 24.8;		
		double resultadoObtenido = rest.restaUnoOtro(40.7, 5.7, 10.2);	
		assertEquals(resultadoEsperado, resultadoObtenido);		
	}
	
	@Test
	@DisplayName ("Test Resta tres numeros reales el primero positivo y los dos siguientes negativos")
	public void TestRestaTresReales2() {	
		// Resultados esperados método
		double resultadoEsperado = 55.5;		
		double resultadoObtenido = rest.restaUnoOtro(40.1, -5.2, -10.2);	
		assertEquals(resultadoEsperado, resultadoObtenido);	
	}
	
	@Test
	@DisplayName ("Test Resta tres numeros reales todos negativos")
	public void TestRestaTresReales3() {	
		// Resultados esperados método
		double resultadoEsperado = -24.8;		
		double resultadoObtenido = rest.restaUnoOtro(-40.7, -5.7, -10.2);	
		assertEquals(resultadoEsperado, resultadoObtenido);			
	}
	
	
	/********************************** 
	 * TEST MÉTODO valorAcumulado
	 **********************************/		
	@Test
	@DisplayName ("Test Valor Acumulado Resta")
	public void TestValorAcumulado() {	
		
		// Resultados esperados Acumulados
		double resultadoAcuEsperado =82.10000000000001;
		double resultadoAcuObtenido = restAcum.getAcumuladoResta();
		assertEquals(resultadoAcuEsperado, resultadoAcuObtenido);			
	}
	
	
}
