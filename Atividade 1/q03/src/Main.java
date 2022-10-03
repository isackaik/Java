import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaracao de variaveis
        String[] biblioteca = new String[1000];
        char c = 'S';
        int n;

        // Lendo codigos dos livros
        Scanner teclado = new Scanner(System.in);
        while (c == 'S') {
            n = teclado.nextInt();
            for (int i = 0; i <= n; i++)
                biblioteca[i] = teclado.nextLine();

            // Ordenando o array
            Arrays.sort(biblioteca, 0, n + 1);

            for (int i = 0; i <= n; i++)
                System.out.println(biblioteca[i]);

            System.out.println("Deseja continuar (S|N)?");
            c = teclado.nextLine().toUpperCase().charAt(0);
        }
        teclado.close();
    }
}
