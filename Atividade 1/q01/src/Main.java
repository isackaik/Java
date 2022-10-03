import java.util.Scanner;
import java.lang.Integer;

public class Main {

    public static void main(String[] args) {
        // Declaracao de variaveis
        int n, i; // quantidade de linhas e indice do laço
        String linha; // linha errada do relatorio
        int n1, n2, n3, saida; // valores retirados da linha de erro e o resultado da soma

        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();

        for (i = n; i > 0; i--) {
            linha = teclado.nextLine();

            // substring -> dado um intervalo de caracteres, faz a quebra da string nesse
            // intervalo
            // parseInt -> transforma uma string em inteiro
            n1 = Integer.parseInt(linha.substring(2, 4));
            n2 = Integer.parseInt(linha.substring(5, 8));
            n3 = Integer.parseInt(linha.substring(11));
            saida = n1 + n2 + n3;
            System.out.println(saida);
        }
    }
}
