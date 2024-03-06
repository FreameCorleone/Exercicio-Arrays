import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        SomarNumeros somarNumeros = new SomarNumeros(numeros);
        int resultado = somarNumeros.calcularSoma();

        System.out.println("A soma dos números é: " + resultado);

        scanner.close();
    }
}