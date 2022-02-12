import grupo7.producto.Producto;
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
            resultado = p.potencia(base, exponente);

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



    /*
     * CLASE DIVISI脫N:
     */

}
