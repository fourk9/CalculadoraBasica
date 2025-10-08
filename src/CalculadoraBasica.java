
/**
 *
 * @author arath
 */
public class CalculadoraBasica {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public double dividir(double a, double b) {
        double resultado = 0;
        if (b != 0) {
            resultado = a / b;
        }
        return resultado;
    }

}
