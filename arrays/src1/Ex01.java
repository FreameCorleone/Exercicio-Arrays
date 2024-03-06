import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        
        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < 10; i++) {
            nomes[i] = scanner.nextLine();
        }
        Ord orde = new Ord();
        orde.executar(nomes);
        scanner.close();
    }
}