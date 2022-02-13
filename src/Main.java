
import grupo7.division.ArithmeticException;
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
            restaDosEnteros(SEPARADOR);
            restaDosReales(SEPARADOR);
            restaUnoOtro(SEPARADOR);
            restaValorAcumulado(SEPARADOR);
            
            //Llamadas a procedimientos de la Clase Division.
            divisionDosEnteros(SEPARADOR);
            divisionDosReales(SEPARADOR);
            inverso(SEPARADOR);
            raiz(SEPARADOR);
        }

        /*
        * CLASE PRODUCTO:
        */

        public static void productoReales(String SEPARADOR) {

            //Variables.
            double a, b, resultado;
            a = 10;
            b = 5;

            //Creaci贸n de Objeto.
            Producto p = new Producto();
            resultado = p.reales(a, b);

            //Mostrar por la terminal.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Primer m茅todo de Producto (reales).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
        }

        public static void productoEnteros(String SEPARADOR) {

            //Variables.
            int a, b, resultado;
            a = 10;
            b = 5;

            //Creaci贸n de Objeto.
            Producto p = new Producto();
            resultado = p.enteros(a, b);

            //Mostrar por terminal.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Segundo m茅todo de Producto (enteros).");
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

            //Creaci贸n de objeto.
            Producto p = new Producto();
            resultado = p.realesDos(a, b, c);

            //Mostrar por terminal.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Tercer m茅todo de Producto (realesDos).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println(resultado);
        }

        public static void productoPotencia(String SEPARADOR) throws Exception {

            //Variables.
            int base, exponente, resultado;
            base = 2;
            exponente = 3;

            //Creaci贸n de Objeto.
            Producto p = new Producto();
            resultado = p.producto(base, exponente);

            //Mostrar por pantalla.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Cuarto m茅todo de Producto (potencia).");
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
            
            //Creacion de Objeto que recibe el m閠odo calculoSumaDosReales
            Suma s = new Suma();
            resultado = s.calculoSumaDosReales(a, b);
            
          
            //Mostrar por la terminal.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Primer metodo de Suma dos Reales (calculoSumaDosReales).");
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

            //Creacion de Objeto que recibe el m閠odo calculoSumaDosEnteros
            Suma s = new Suma();
            resultado = s.calculoSumaDosEnteros(a, b);
            
          
            //Mostrar por la terminal.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Segundo metodo de Suma dos Enteros (calculoSumaDosEnteros).");
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
            		

            //Creacion de Objeto que recibe el m閠odo calculoSumaTresFloat
            Suma s = new Suma();
            resultado = s.calculoSumaTresFloat(a, b, c);
            
          
            //Mostrar por la terminal.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Tercer metodo de Suma tres Float (calculoTresFloat).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((double)resultado);
               
        }
        
        public static void sumaAcumulado (String SEPARADOR) {

        	//Variable que imprime el resultado
        	double resultado;
        	
        	//Creacion de Objeto que recibe el m閠odo getAcumuladoSuma
            Suma s = new Suma();
            resultado = s.getAcumuladoSuma();
            	
            
            //Mostrar por la terminal el valor acumulado.
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Valor Acumulado de las sumas (valorAcumulado).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((double) resultado);
               
        }
        
    /*
     * CLASE RESTA:
     */
        public double restaDosReales (String SEPARADOR) {
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
            System.out.println("Primer metodo de Resta dos Reales (restaDosReales).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((double)resultado);
        	}
        
    	public int restaDosEnteros (String SEPARADOR) {
    		int a, b, resultado;
            a=4;
            b=2;
            		
            //Creacion de objeto
            Resta r = new Resta();
            resultado = r.restaDosEnteros(a,b);
            
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Segundo metodo de Resta dos Enteros (restaDosEnteros).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((int)resultado);
        	}
    	
    	
    	public double restaUnoOtro (double a, double b, double c) {
    		int a, b, c,resultado;
            a=8;
            b=2;
            c=3;
            		
            //Creacion de objeto
            Resta r = new Resta();
            resultado = r.restaUnoOtro(a,b,c);
            
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Tercer metodo de Resta un n鷐ero y luego otro (restaUnoOtro).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((double)resultado);
        	}

    	public double restaValorAcumulado (double a) {
        	//Variable
        	double resultado;
        	
        	//Creacion de Objeto 
            Suma s = new Suma();
            resultado = s.getAcumuladoResta();
            	
            
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Valor Acumulado de las restas (restaValorAcumulado)");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((double) resultado);
               
        }
    /*
     * CLASE DIVISION:
     */

    	public double divisionDosReales (String SEPARADOR) throws ArithmeticException {
    		System.out.println(" ");
        	System.out.println("------------------------------DIVISION-----------------------------------");
            System.out.println(" ");
    		
    		//Variables
            double a, b, resultado;
            a=2.5;
            b=1.3;            		
    		
            //Creacion de objeto
            Division d = new Division();
            resultado = d.divisionDosReales();
    		
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Primer metodo de Division entre dos Reales (DivisionDosReales).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((double)resultado);
    	}
        
    	public int divisionDosEnteros (String SEPARADOR) throws ArithmeticException {
    		//Variables
            int a, b;
            double resultado;
            a=10;
            b=2;            		
    		
            //Creacion de objeto
            Division d = new Division();
            resultado = d.divisionDosEnteros();
    		
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Segundo metodo de Division entre dos enteros (DivisionDosEnteros).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((double)resultado);
    		}
    	
    	public int inverso (String SEPARADOR) {
    		//Variables
            int a;
            double resultado;
            a=10;            		
    		
            //Creacion de objeto
            Division d = new Division();
            resultado = d.inverso();
    		
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Tercer metodo de Inverso de un n鷐ero entero (inverso).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((double)resultado);
    		}
        
    	public double raiz (String SEPARADOR) {
    		//Variables
            int a;
            double resultado;
            a=9;            		
    		
            //Creacion de objeto
            Division d = new Division();
            resultado = d.raiz();
    		
            //Mostrar en pantalla
            System.out.println("\n");
            System.out.println(SEPARADOR);
            System.out.println("Cuarto metodo raiz cuadrada (raiz).");
            System.out.println(SEPARADOR);
            System.out.println("\n");
            System.out.println((double)resultado);
    		}	
  }
