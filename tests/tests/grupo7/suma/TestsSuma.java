/**
 * TESTEO SOBRE LA CLASE SUMA DE LA APLICACIÓN CALCULADORA.
 * 
 * @author Pavlo Dudnyk Petrenko
 */


package tests.grupo7.suma;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import grupo7.suma.*;

class TestsSuma {
		
	//Variables de la Clase.
	
	static final String SEPARADOR = ("************************************************************");
	static final String INTRO = ("\n");
	private Suma s;
	
	//
	//Anotaciones & Aserciones.
	//
	
	@BeforeAll
	public static void antesTodo() {
		System.out.println(INTRO);
		System.out.println(SEPARADOR);
		System.out.println("EMPEZAMOS LAS PRUEBAS SOBRE LA CLASE SUMA");
		System.out.println(SEPARADOR);
		System.out.println(INTRO);
	}
	
	//Creamos un objeto nuevo al empezar cada procedimiento.
	@BeforeEach
	void empezar() {
		s = new Suma();
	}

	//Aunque no haría falta, por ágilidad limpiamos el objeto después de cada procedimiento.
	@AfterEach
	void terminar() {
		s = null;
	}
	
	@AfterAll
	public static void despuesTodo() {
		System.out.println(INTRO);
		System.out.println(SEPARADOR);
		System.out.println("TERMINAMOS LAS PRUEBAS SOBRE LA CLASE SUMA");
		System.out.println(SEPARADOR);
		System.out.println(INTRO);
	}

	//
	//Primer Método.
	//
	
	@Test
	public void testSumaDosReales() {
		
		double valorEsperado = 0;
		double valorObtenido = s.calculoSumaDosReales(5, -5);
		
		assertEquals(valorEsperado, valorObtenido);
		
		System.out.println(SEPARADOR);
		System.out.println("PRIMER TEST SOBRE LA CLASE SUMA (calculoSumaDosReales)");
		System.out.println(SEPARADOR);
		System.out.println(INTRO);
		System.out.println("VALOR ESPERADO: " + valorEsperado);
		System.out.println(INTRO);
		System.out.println("VALOR OBTENIDO: " + valorObtenido);
		System.out.println(INTRO);
	}
	
	//
	//Segundo Método.
	//
	
	@Test
	public void testSumaDosEnteros() {
		
		int valorEsperado = 10;
		int valorObtenido = s.calculoSumaDosEnteros(5, 5);
		
		assertEquals(valorEsperado, valorObtenido);
		
		System.out.println(SEPARADOR);
		System.out.println("SEGUNDO TEST SOBRE LA CLASE SUMA (calculoSumaDosEnteros)");
		System.out.println(SEPARADOR);
		System.out.println(INTRO);
		System.out.println("VALOR ESPERADO: " + valorEsperado);
		System.out.println(INTRO);
		System.out.println("VALOR OBTENIDO: " + valorObtenido);
		System.out.println(INTRO);
	}
	
	//
	//Tercer Método.
	//
	
	@Test
	public void testSumaTresFloat() {
		
		float valorEsperado = 15;
		float valorObtenido = s.calculoSumaTresFloat(3, 7, 5);
		
		assertEquals(valorEsperado, valorObtenido);
		
		System.out.println(SEPARADOR);
		System.out.println("TERCER TEST SOBRE LA CLASE SUMA (calculoSumaTresFloat)");
		System.out.println(SEPARADOR);
		System.out.println(INTRO);
		System.out.println("VALOR ESPERADO: " + valorEsperado);
		System.out.println(INTRO);
		System.out.println("VALOR OBTENIDO: " + valorObtenido);
		System.out.println(INTRO);
	}
	
	//
	//Cuarto Método.
	//
	
	@Test
	public void testValorAumulado() {
		
		s.valorAcumulado(5);
		s.valorAcumulado(7);
				
		double valorEsperado = 12;
		double valorObtenido = s.getAcumuladoSuma();
		
		assertEquals(valorEsperado, valorObtenido);
		
		System.out.println(SEPARADOR);
		System.out.println("CUARTO TEST SOBRE LA CLASE SUMA (valorAcumulado)");
		System.out.println(SEPARADOR);
		System.out.println(INTRO);
		System.out.println("VALOR ESPERADO: " + valorEsperado);
		System.out.println(INTRO);
		System.out.println("VALOR OBTENIDO: " + valorObtenido);
		System.out.println(INTRO);
	}

}
