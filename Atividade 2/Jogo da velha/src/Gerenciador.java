import java.util.Scanner;

public class Gerenciador {

    public static void main(String[] args) {
        int l, c;
        String str;
        Scanner teclado = new Scanner(System.in);
        Tabuleiro t = new Tabuleiro();
        System.out.println("*****JOGO DA VELHA*****\n--IREMOS COMECAR--\n");

        // looping do jogo
        while ((t.existeVencedor() == false) && (t.jogoEmpate() == false)) {
            t.apresentarPecas();
            System.out.println("Proxima jogada");
            System.out.println("Simbolo: ");
            str = teclado.next().toUpperCase();
            t.obterSimbolo(str);
            System.out.println("Linha: ");
            l = teclado.nextInt();
            t.obterLinha(l);
            System.out.println("Coluna: ");
            c = teclado.nextInt();
            t.obterColuna(c);
            t.inserirPeca();
            t.existeVencedor();
            t.jogoEmpate();
        }
        t.fimJogo();
        t.apresentarPecas();
        teclado.close();
    }
}