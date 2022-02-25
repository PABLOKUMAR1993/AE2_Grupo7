package grupo7.producto;

/**
 *
 * La clase <b>PRODUCTO</b> está creada para resolver <u>todos los métodos que están relacionados con la multiplicación en una calculadora</u>.
 * <br>
 * <br>
 * El método <b>reales</b> recibe dos parámetros de entrada <b>REALES</b> <i>double</i>. Los parámetros recibidos serán
 * multiplicados (<b>a</b> por <b>b</b>) y se te devolverá el resultado cómo un número real
 * <br>
 * <br>
 * El método <b>enteros</b> recibe dos parámetros de entrada <b>ENTEROS</b> <i>int</i>. Los parámetros recibidos serán
 * multiplicados (<b>a</b> por <b>b</b>) y se te devolverá el resultado cómo un número entero
 * <br>
 * <br>
 * El método <b>realesDos</b> se ha creado para calcular tres dimensiones, cómo por ejemplo los metros cúbicos
 * de una habitación. Tienes que pasarle a este método 3 valores, <b>a</b> podría representar el ancho de una habitación,
 * <b>b</b> podría representar el largo y <b>c</b> podría ser la altura. El resultado de multiplicar <b>a</b> por <b>b</b>,
 * será multiplicado por <b>c</b>. Aunque esto es un ejemplo, la operación es (<b>a</b>*<b>b</b>)*<b>c</b>, puedes utilizarlo
 * para resolver otra consulta si lo necesitas.
 * <br>
 * <br>
 * El método <b>potencia</b> ha sido creado para calcular la potenciación de un número.
 * Este método recibe un primer parámetro que será la <b>base</b> y seguidamente recibirá él <b>exponente</b>.
 * Un ejemplo de cómo funciona, imagina que <b>base</b> es igual a 2 y que <b>exponente</b> es igual a 3:
 * la operación resultante sería <b>2*2*2</b>, con lo cual recibirías de vuelta <b>8</b>.
 *
 *
 * @version V1.01
 * @author Pavlo Dudnyk
 *
 */

public class Producto {

    /**
     *
     * El método <b>reales</b> recibe dos parámetros de entrada <b>REALES</b> <i>double</i>. Los parámetros recibidos serán
     * multiplicados (<b>a</b> por <b>b</b>) y se te devolverá el resultado cómo un número real
     * <i>(con decimales, si procede)</i>.
     *
     * @param a Primer número de entrada para la operación (solo acepta <b>double</b> de entrada).
     * @param b Segundo número de entrada para la operación (solo acepta <b>double</b> de entrada).
     * @return <b><i>Un número real (double)</i></b>, resultado de multiplicar <b>a</b> * <b>b</b>.
     *
     */

    public double reales(double a, double b) {
        double c;
        c = a*b;
        return c;
    }

    /**
     *
     * El método <b>enteros</b> recibe dos parámetros de entrada <b>ENTEROS</b> <i>int</i>. Los parámetros recibidos serán
     * multiplicados (<b>a</b> por <b>b</b>) y se te devolverá el resultado cómo un número entero
     * <i>(sin decimales)</i>.
     *
     * @param a Primer número de entrada para la operación (solo acepta <b>int</b> de entrada).
     * @param b Segundo número de entrada para la operación (solo acepta <b>int</b> de entrada).
     * @return <b><i>Un número entero (int)</i></b>, resultado de multiplicar <b>a</b> por <b>b</b>.
     *
     */

    public int enteros(int a, int b) {
        int c;
        c = a*b;
        return c;
    }

    /**
     *
     * El método <b>realesDos</b> se ha creado para calcular tres dimensiones, cómo por ejemplo los metros cúbicos
     * de una habitación. Tienes que pasarle a este método 3 valores, <b>a</b> podría representar el ancho de una habitación,
     * <b>b</b> podría representar el largo y <b>c</b> podría ser la altura. El resultado de multiplicar <b>a</b> por <b>b</b>,
     * será multiplicado por <b>c</b>. Aunque esto es un ejemplo, la operación es (<b>a</b>*<b>b</b>)*<b>c</b>, puedes utilizarlo
     * para resolver otra consulta si lo necesitas.
     * <br>
     * Solo acepta números <b>REALES <i>double</i></b> (acepta decimales).
     *
     * @param a ancho del cubo o primer parámetro de entrada <b><i>double</i></b>.
     * @param b largo del cubo o segundo parámetro de entrada <b><i>double</i></b>.
     * @param c alto de la habitación o tercer parámetro de entrada <b><i>double</i></b>. El resultado de multiplicar <b>a</b>*<b>b</b>
     *          será multiplicado por <b>c</b>.
     * @return Recibirás un número entero <b><i>double</i></b> resultado de la operación (<b>a</b>*<b>b</b>)*<b>c</b>
     *
     */

    public double realesDos(double a, double b, double c) {
        double d;
        d = a*b*c;
        return d;
    }

    /**
     *
     * El método <b>potencia</b> ha sido creado para calcular la potenciación de un número.
     * Este método recibe un primer parámetro que será la <b>base</b> y seguidamente recibirá él <b>exponente</b>.
     * Un ejemplo de cómo funciona, imagina que <b>base</b> es igual a 2 y que <b>exponente</b> es igual a 3:
     * la operación resultante sería <b>2*2*2</b>, con lo cual recibirías de vuelta <b>8</b>.
     * <br>
     * Solo acepta números enteros <b><i>int</i></b>.
     *
     * @param base será el número al que se le aplicará la potencia <b><i>int</i></b>.
     * @param exponente Será el valor de la potencia aplicada <b><i>int</i></b>. El número <b>base</b> será multiplicado por sí mismo
     *                  tantas veces cómo unidades tenga él <b>exponente</b>.
     * @return Un número entero <b><i>int</i></b> resultante de la operación del método.
     * @throws Exception El resultado de la operación no puede ser superior a 2.147.483.647 ni menor a -2.147.483.648.
     *
     */

    public int potencia(int base, int exponente) throws Exception {

        int resultado = base;

        for (int i = 0; i < exponente-1; i++) {
                resultado = resultado * base;
        };

        if (resultado >= 2147483647 || resultado <= -2147483648) {
            throw new Exception("Has introducido una combinación numérica demasiado grande," +
                    "el resultado no puede ser mayor que 2147483647 ni menor que -2147483648");
        } else {
            return resultado;
        }
    }

}
