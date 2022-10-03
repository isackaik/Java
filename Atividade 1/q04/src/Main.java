import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String rastro;
        int n, ciclos = 0, sequencia = 0;

        Scanner teclado = new Scanner(System.in);
        rastro = teclado.nextLine();
        rastro = rastro + "0"; // adicionado um 0 para nao dar erro no intervalo de substring
        n = teclado.nextInt(); // numero de processos

        for (int i = 0; i < rastro.length(); i++) {
            if (rastro.charAt(i) == 'W') { // analisando um indice por vez
                ciclos += 1;
            } else if (rastro.charAt(i) == 'R') { // analisando um indice por vez
                int j = i;
                while (rastro.charAt(j) == 'R') {
                    sequencia += 1;
                    j++;
                }
                i = j - 1; // trocado i por j e diminuído um depois, porque estava duplicando a
                           // incrementação.
            }
            if (sequencia % n == 0) { // calculando processos simultados de leitura
                ciclos += +sequencia / n;
            } else if (sequencia % n != 0) {
                ciclos += +sequencia / n + 1;
            }
            sequencia = 0;
        }
        System.out.println(ciclos);
        teclado.close();
    }
}
