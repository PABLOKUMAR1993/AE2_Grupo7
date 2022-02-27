package tests.grupo7.producto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import grupo7.producto.*;

class TestProducto {

	private Producto p;
	
	// No seria necesario pero por utilizar el beforeall
	@BeforeAll
	public static void antesDeTodo() {
		System.out.println("COMIENZAN LOS TEST SOBRE LA CLASE PRODUCTO");
	}	
	
	
	// Se creara un objeto nuevo para cada test que vayamos a realizar
	@BeforeEach
	void setUp() throws Exception {
		p = new Producto();	
		}
	
	
	//No seria necerario pero así limpiaremos el objeto después de cada procedimiento.
	@AfterEach
	void finaltest() {
		p = null;
		}
	
	
	//Para indicar el final, crearemos un afterAll y asi lo usamos.
	
	@AfterAll
	public static void alFinal() {

		System.out.println("TERMINAN LOS TEST SOBRE LA CLASE PRODUCTO");
	}

	
			// TEST METODO PRODUCTO NUMEROS REALES
	
	@Test
	@DisplayName ("Test producto de dos números reales positivos")
	public void testReales1 () {
		double resultadoObtenido= p.reales(1.5, 2.5);
		double resultadoEsperado = 3.75;
		assertEquals (resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	@DisplayName ("Test producto de dos números reales negativos")
	public void testReales2 () {
		double resultadoObtenido= p.reales(-1.5, -2.5);
		double resultadoEsperado = 3.75;
		assertEquals (resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	@DisplayName ("Test producto de dos números reales de diferente signo")
	public void testReales3 () {
		double resultadoObtenido= p.reales(1.5, -2.5);
		double resultadoEsperado = -3.75;
		assertEquals (resultadoObtenido, resultadoEsperado);		
	}
	
	
			// TEST METODO PRODUCTO NUMEROS ENTEROS
	
	@Test
	@DisplayName ("Test producto de dos números enteros positivos")
	public void testEnteros1 () {
		int resultadoObtenido= p.enteros(3, 5);
		int resultadoEsperado = 15;
		assertEquals (resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	@DisplayName ("Test producto de dos números enteros negativos")
	public void testEnteros2 () {
		int resultadoObtenido= p.enteros(-3, -5);
		int resultadoEsperado = 15;
		assertEquals (resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	@DisplayName ("Test producto de dos números enteros de diferente signo")
	public void testEnteros3 () {
		int resultadoObtenido= p.enteros(3, -5);
		int resultadoEsperado = -15;
		assertEquals (resultadoObtenido, resultadoEsperado);		
	}
	
	@Test
	@DisplayName ("Test producto de dos números enteros siendo uno 0")
	public void testEnteros4 () {
		int resultadoObtenido= p.enteros(3, 0);
		int resultadoEsperado = 0;
		assertEquals (resultadoObtenido, resultadoEsperado);		
	}
		
	// TEST METODO PRODUCTO 3 NUMEROS REALES
	
	@Test
	@DisplayName ("Test producto de 3 números reales positivos")
	public void testrealesDos1 () {
		double resultadoObtenido= p.realesDos(1, 2, 3);
		double resultadoEsperado = 6;
		assertEquals (resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	@DisplayName ("Test producto de dos números reales positivos y uno negativo")
	public void testRealesDos2 () {
		double resultadoObtenido= p.realesDos(1, 2, -3);
		double resultadoEsperado = -6;
		assertEquals (resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	@DisplayName ("Test producto de un números real por dos negativos")
	public void testRealesDos3 () {
		double resultadoObtenido= p.realesDos(1, -2, -3);
		double resultadoEsperado = 6;
		assertEquals (resultadoObtenido, resultadoEsperado);		
	}
	
	@Test
	@DisplayName ("Test producto de tres números reales negativos")
	public void testRealesDos4 () {
		double resultadoObtenido= p.realesDos(-1, -2, -3);
		double resultadoEsperado = -6;
		assertEquals (resultadoObtenido, resultadoEsperado);		
	}
	
	
	// TEST METODO POTENCIA
	
	@Test
	@DisplayName ("Test potencia de un numero positivo")
	public void testpotencia1 () throws Exception {
		int resultadoObtenido= p.potencia(3, 2);
		int resultadoEsperado = 9;
		assertEquals (resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	@DisplayName ("Test potencia de un numero negativo")
	public void testpotencia2 () throws Exception {
		int resultadoObtenido= p.potencia(-3, 2);
		int resultadoEsperado = 9;
		assertEquals (resultadoObtenido, resultadoEsperado);
	}

}
