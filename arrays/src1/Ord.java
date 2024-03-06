import java.util.Arrays;

public class Ord {
    public void executar(String [] nomesOrdenados) {
        Arrays.sort(nomesOrdenados);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomesOrdenados) {
            System.out.println(nome);
        }
    }
}