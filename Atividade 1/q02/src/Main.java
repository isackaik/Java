import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // declaracao de variaveis
        int n, n1;
        String palavra1, palavra2, incompleta;
        // qtd de casos de teste
        Scanner teclado = new Scanner(System.in);
        n1 = teclado.nextInt();
        for (int j = 0; j < n1; j++) {
            int cont = 0;
            // palavras de comparacao e palavra incompleta
            palavra1 = teclado.nextLine();
            palavra2 = teclado.nextLine();
            incompleta = teclado.nextLine();

            /*
             * como faltam duas letras para completar a palavra, é possível afirmar a
             * correta
             * se o total de diferença entre elas for >= que duas letras
             */
            n = palavra1.length();
            for (int i = 0; i < n; i++) {
                if (palavra1.substring(i, i + 1).equals(palavra2.substring(i, i + 1))) {
                    cont += 0;
                } else
                    cont += 1;
            }

            if (cont > 1) {
                System.out.println("Y");
            } else
                System.out.println("N");
        }
        teclado.close();
    }
}
