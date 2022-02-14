import grupo7.division.Division;
import grupo7.producto.Producto;
import grupo7.resta.Resta;
import grupo7.suma.Suma;

public class Main {

        public static void main(String[] args) throws Exception {

            final String SEPARADOR = "***************************************************";

            //Llamadas a procedimientos de la Clase Producto.
            productoReales(SEPARADOR);
            productoEnteros(SEPARADOR);
            productoRealesDos(SEPARADOR);
            productoPotencia(SEPARADOR);
            
            //Llamadas a procedimientos de la Clase Suma.
            sumaDosReales(SEPARADOR);
            sumaDosEnteros(SEPARADOR);
            sumaTresFloat(SEPARADOR);
            sumaAcumulado(SEPARADOR);

            //Llamadas a procedimientos de la Clase Resta.
            restaDosReales(SEPARADOR);
            restaDosEnteros(SEPARADOR);
            restaUnoOtro(SEPARADOR);
            restaValorAcumulado(SEPARADOR);
            
            //Llamadas a procedimientos de la Clase Division.
            divisionDosReales(SEPARADOR);
            divisionDosEnteros(SEPARADOR);
            inverso(SEPARADOR);
            raiz(SEPARADOR);
        }

        /*
        * CLASE PRODUCTO:
        */

        public static void productoReales(String SEPARADOR) {
            System.out.println(" ");
            System.out.println("------------------------------PRODUCTO-----------------------------------");
            System.out.println(" ");

            //Variables.
            double a, b, resultado;
            a = 10;
            b = 5;

            //Creación de Objeto.
            Producto p = new Producto();
            resultado = p.reales(a, b);

            //Mostrar por la terminal.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Primer método de Producto (reales).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
        }

        public static void productoEnteros(String SEPARADOR) {

            //Variables.
            int a, b, resultado;
            a = 10;
            b = 5;

            //Creación de Objeto.
            Producto p = new Producto();
            resultado = p.enteros(a, b);

            //Mostrar por terminal.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Segundo método de Producto (enteros).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
        }

        public static void productoRealesDos(String SEPARADOR) {

            //Variables.
            double a, b, c, resultado;
            a = 3;
            b = 5;
            c = 7;

            //Creación de objeto.
            Producto p = new Producto();
            resultado = p.realesDos(a, b, c);

            //Mostrar por terminal.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Tercer método de Producto (realesDos).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
        }

        public static void productoPotencia(String SEPARADOR) throws Exception {

            //Variables.
            int base, exponente, resultado;
            base = 2;
            exponente = 3;

            //Creación de Objeto.
            Producto p = new Producto();
            resultado = p.potencia(base, exponente);

            //Mostrar por pantalla.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Cuarto método de Producto (potencia).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
        }

    /*
     * CLASE SUMA:
     */
        
        public static void sumaDosReales (String SEPARADOR) {
        	System.out.println();
        	System.out.println("------------------------------SUMA-----------------------------------");
            //Variables 
        	double resultado;
        	double a, b;
            a = 1.0;
            b = 3.0;
            
            //Creacion de Objeto que recibe el método calculoSumaDosReales
            Suma s = new Suma();
            resultado = s.calculoSumaDosReales(a, b);
            
          
            //Mostrar por la terminal.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Primer método de Suma dos Reales (calculoSumaDosReales).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
            
        }
        
        public static void sumaDosEnteros (String SEPARADOR) {

        	//Variables
        	double resultado;
            int a, b;
            a = 25;
            b = 10;

            //Creacion de Objeto que recibe el método calculoSumaDosEnteros
            Suma s = new Suma();
            resultado = s.calculoSumaDosEnteros(a, b);
            
          
            //Mostrar por la terminal.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Segundo método de Suma dos Enteros (calculoSumaDosEnteros).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((double)resultado);
               
        }
        
        public static void sumaTresFloat (String SEPARADOR) {

        	//Variables
        	double resultado;
            float a, b, c;
            a = 25.8558F;
            b = 4.258F;
            c = 1.52665F;
            		

            //Creacion de Objeto que recibe el método calculoSumaTresFloat
            Suma s = new Suma();
            resultado = s.calculoSumaTresFloat(a, b, c);
            
          
            //Mostrar por la terminal.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Tercer método de Suma tres Float (calculoTresFloat).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((double)resultado);
               
        }
        
        public static void sumaAcumulado (String SEPARADOR) {

        	//Variable que imprime el resultado
        	double resultado;
        	
        	//Creacion de Objeto que recibe el método getAcumuladoSuma
            Suma s = new Suma();
            resultado = s.getAcumuladoSuma();
            	
            
            //Mostrar por la terminal el valor acumulado.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Cuarto método. Valor Acumulado de las sumas (valorAcumulado).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((double) resultado);
               
        }
        
    /*
     * CLASE RESTA:
     */

        public static void restaDosReales (String SEPARADOR) {
        	System.out.println("\n");
        	System.out.println("------------------------------RESTA-----------------------------------");
            System.out.println("\n");
            
            //Variables
            double a, b, resultado;
            a=4.2;
            b=2.2;
            		
            //Creacion de objeto
            Resta r = new Resta();
            resultado = r.restaDosReales(a,b);
            
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Primer método de Resta dos Reales (restaDosReales).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
        	}
        
    	public static void restaDosEnteros (String SEPARADOR) {
    		int a, b, resultado;
            a=4;
            b=2;
            		
            //Creacion de objeto
            Resta r = new Resta();
            resultado = r.restaDosEnteros(a,b);
            
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Segundo método de Resta dos Enteros (restaDosEnteros).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((int)resultado);
        	}
    	
    	
    	public static void restaUnoOtro (String SEPARADOR) {
    		double a, b, c,resultado;
            a=8;
            b=2;
            c=3;
            		
            //Creacion de objeto
            Resta r = new Resta();
            resultado = r.restaUnoOtro(a,b,c);
            
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Tercer método de Resta un número y luego otro (restaUnoOtro).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
        	}

    	public static void restaValorAcumulado (String SEPARADOR) {
        	//Variable
        	double resultado;
        	
        	//Creacion de Objeto 
            Resta r = new Resta();
            resultado = r.getAcumuladoResta();
            	
            
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Valor Acumulado de las restas (restaValorAcumulado)");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
        }

    /*
     * CLASE DIVISION:
     */

    	public static void divisionDosReales (String SEPARADOR) throws ArithmeticException {
    		System.out.println(" ");
        	System.out.println("------------------------------DIVISION-----------------------------------");
            System.out.println(" ");
    		
    		//Variables
            double a, b, resultado;
            a=2.5;
            b=1.3;            		
    		
            //Creacion de objeto
            Division d = new Division();
            resultado = d.divisionDosReales(a, b);
    		
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Primer método de Division entre dos Reales (DivisionDosReales).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
    	}
        
    	public static void divisionDosEnteros (String SEPARADOR) throws ArithmeticException {
    		//Variables
            int a, b, resultado;
            a=10;
            b=2;            		
    		
            //Creacion de objeto
            Division d = new Division();
            resultado = d.divisionDosEnteros(a, b);
    		
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Segundo método de Division entre dos enteros (DivisionDosEnteros).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
    		}
    	
    	public static void inverso (String SEPARADOR) {
    		//Variables
            int a, resultado;
            a = 10;
    		
            //Creación de objeto
            Division d = new Division();
            resultado = d.inverso(a);
    		
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Tercer método de Inverso de un número entero (inverso).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
    		}
        
    	public static void raiz (String SEPARADOR) {
    		//Variables
            int a, resultado;
            a = 9;
    		
            //Creacion de objeto
            Division d = new Division();
            resultado = (int) d.raiz(a);
    		
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Cuarto método raíz cuadrada (raíz).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
    		}	
  }
