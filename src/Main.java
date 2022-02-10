import grupo7.producto.Producto;

public class Main {

        public static void main(String[] args) throws Exception {

            final String SEPARADOR = "***************************************************";

            //Llamadas a procedimientos de la Clase Producto.
            productoReales(SEPARADOR);
            productoEnteros(SEPARADOR);
            productoRealesDos(SEPARADOR);
            productoPotencia(SEPARADOR);
        }

        /*
        * CLASE PRODUCTO:
        */

        public static void productoReales(String SEPARADOR) {

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

}
