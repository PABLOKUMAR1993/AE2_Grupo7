package tests.grupo7.suma;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import grupo7.suma.*;

class TestsSuma {
	
	//añadir before each, after each y todo lo relacionado.
	//Comprobar testValorAumulado().
	

	@Test
	public void testSumaDosReales() {
		
		Suma s = new Suma();
		
		double valorEsperado = 0;
		double valorObtenido = s.calculoSumaDosReales(5, -5);
		
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void testSumaDosEnteros() {
		
		Suma s = new Suma();
		
		int valorEsperado = 10;
		int valorObtenido = s.calculoSumaDosEnteros(5, 5);
		
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void testSumaTresFloat() {
		
		Suma s = new Suma();
		
		float valorEsperado = 15;
		float valorObtenido = s.calculoSumaTresFloat(5, 5, 5);
		
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void testValorAumulado() {
		
		//Este método no funciona bien
		
		Suma s = new Suma();
		
		double valorUno = s.valorAcumulado(5);
		double valorDos = s.valorAcumulado(7);
		
		double valorRecibido = s.getAcumuladoSuma();
		
		System.out.println(valorRecibido);
		
	}

}
