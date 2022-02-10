import grupo7.producto.Producto;

public class Main {

        public static void main(String[] args) throws Exception {

            productoReales();
            productoEnteros();
            productoRealesDos();
            productoPotencia();

        }

        public static void productoReales() {

            double a, b;
            a = 10;
            b = 5;

            Producto p = new Producto();
            System.out.println(p.reales(a, b));

        }
        public static void productoEnteros() {

            int a, b;
            a = 10;
            b = 5;

            Producto p = new Producto();
            System.out.println(p.enteros(a, b));

        }
        public static void productoRealesDos() {

            double a, b, c;
            a = 3;
            b = 5;
            c = 7;

            Producto p = new Producto();
            System.out.println(p.realesDos(a, b, c));

        }
        public static void productoPotencia() {



        }

}
