package test.grupo7.division;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import grupo7.division.*;


class TestDivision {

	// Creamos el atributo div de tipo Division para invocar a los métodos de la clase Division.
		private Division div;
		
		@BeforeEach
		void setUp() throws Exception {
		//Creado este objeto antes de cada test para que esté siempre vacío
		div = new Division();	
		}
		
		/********************************** 
		 * TEST MÉTODO DivisionDosReales
		 **********************************/
		
		@Test
		@DisplayName ("Test Division dos numeros reales positivos")
		public void TestDivisionDosReales() {	
			// Resultados esperados método
			double resultadoEsperado = 2.23;		
			double resultadoObtenidoCompleto = div.divisionDosReales(5.25, 2.35);
			//Resultado obtenido redondeado a dos decimales para test
			double resultadoObtenido = Math.round(resultadoObtenidoCompleto*100.0)/100.0;
			assertEquals(resultadoEsperado, resultadoObtenido);	
		}
		
		
		@Test
		@DisplayName ("Test Division a un número positivo uno negativo")
		public void TestDivisionDosReales2() {	
			// Resultados esperados método
			double resultadoEsperado = -3.16;
			double resultadoObtenidoCompleto = div.divisionDosReales(10.33, -3.27);
			//Resultado obtenido redondeado a dos decimales para test
			double resultadoObtenido = Math.round(resultadoObtenidoCompleto*100.0)/100.0;
			assertEquals(resultadoEsperado, resultadoObtenido);
		}
		
		
		@Test
		@DisplayName ("Test Division dos numeros Reales iguales")
		public void TestDivisionDosReales3() {	
			// Resultados esperados método
			double resultadoEsperado = 1.0;
			double resultadoObtenidoCompleto = div.divisionDosReales(7.0, 7.0);
			//Resultado obtenido redondeado a dos decimales para test
			double resultadoObtenido = Math.round(resultadoObtenidoCompleto*100.0)/100.0;
			assertEquals(resultadoEsperado, resultadoObtenido);
		}
		
		
		/********************************** 
		 * TEST MÉTODO DivisionDosEnteros
		 **********************************/	
		
		@Test
		@DisplayName ("Test Division dos numeros enteros positivos")
		public void TestDivisionDosEnteros() {	
			// Resultados esperados método
			int resultadoEsperado = 2;		
			int resultadoObtenido = div.divisionDosEnteros(5, 2);
			assertEquals(resultadoEsperado, resultadoObtenido);		
		}
		
		
		@Test
		@DisplayName ("Test Division a un número enteros uno negativo")
		public void TestDivisionDosEnteros2() {	
			// Resultados esperados método
			int resultadoEsperado = -3;
			int resultadoObtenido = div.divisionDosEnteros(10, -3);		
			assertEquals(resultadoEsperado, resultadoObtenido);	
		}
		
		
		@Test
		@DisplayName ("Test Division dos numeros enteros iguales")
		public void TestDivisionDosEnteros3() {	
			// Resultados esperados método
			int resultadoEsperado = 1;
			int resultadoObtenido = div.divisionDosEnteros(7, 7);
			assertEquals(resultadoEsperado, resultadoObtenido);	
		
		}
		
		
		/********************************** 
		 * TEST MÉTODO inverso
		 **********************************/
		
		@Test
		@DisplayName ("Test Division inverso con un positivo")
		public void TestDivisionInverso() {	
			// Resultados esperados método
			double resultadoEsperado = 0.2;		
			double resultadoObtenido = div.inverso(5);
			assertEquals(resultadoEsperado, resultadoObtenido);		
		}
		
		
		@Test
		@DisplayName ("Test Division inverso con un negativo")
		public void TestDivisionInverso2() {	
			// Resultados esperados método
			double resultadoEsperado = -0.2;		
			double resultadoObtenido = div.inverso(-5);
			assertEquals(resultadoEsperado, resultadoObtenido);		
		}
		
		
		/********************************** 
		 * TEST MÉTODO raiz
		 **********************************/
		
		@Test
		@DisplayName ("Test Division inverso con un positivo")
		public void TestDivisionRaiz() {	
			// Resultados esperados método
			int resultadoEsperado = 3;		
			double resultadoObtenido = div.raiz(14);
			assertEquals(resultadoEsperado, resultadoObtenido);		
		}
		
		
		@Test
		@DisplayName ("Test Division inverso con un negativo")
		public void TestDivisionRaiz2() {	
			// Resultados esperados método
			double resultadoEsperado = 0;		
			double resultadoObtenido = div.raiz(-64);
			assertEquals(resultadoEsperado, resultadoObtenido);		
		}
		
}
