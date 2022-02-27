package tests.grupo7.producto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import grupo7.producto.*;

class TestProducto {

	private Producto p;
	
	// No seria necesario pero por utilizarlo el beforeall
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
	
	
	//Para indicar el final, crearemos un afterAll 
	
	@AfterAll
	public static void alFinal() {

		System.out.println("TERMINAN LOS TEST SOBRE LA CLASE PRODUCTO");
	}

	
	
	
	
	
	
	
	
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
