package javafundamentos.matematica;

public class Matematica {

    public int somar(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public int subtrair(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public int dividir(int valor1, int valor2) {
        return valor1 / valor2;
    }

    public int potencia(int valor, int potencia) {
        int total = valor;
        for (int i = 0; i < potencia - 1; i ++) {
            total *= valor;
        }
        
        return total;
    }
}
