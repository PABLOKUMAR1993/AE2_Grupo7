package tests.grupo7.resta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import grupo7.resta.*;
import programa.Persona;

class TestResta {

	// Creamos el atributo rest de tipo Resta para invocar a los m�todos de la clase Resta.
	private Resta rest;
	
	/* 
	 * Comprobamos el m�todo restaDosReales
	 * */
	
	@BeforeEach
	void setUp() throws Exception {
		//Creado este objeto antes de cada test para que est� siempre vac�o 
		Resta rest =  new Resta();

	}
	
	
	@Test
	public void restaDosReales() {
		rest.restaDosReales(0, 0)
		
		
	}

}
