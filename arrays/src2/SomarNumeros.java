package arrays.src2;

public class SomarNumeros {
    private int[] numeros;

    public SomarNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}
