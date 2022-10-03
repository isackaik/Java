public class Tabuleiro extends JogadorHumano {

    private char peca[][] = new char[3][3];

    public Tabuleiro() {
        super('x', 0, 0);

        // zerando indices do matriz
        for (int i = 0; i < peca.length; i++) {
            for (int j = 0; j < peca[i].length; j++) {
                peca[i][j] = '0';
            }
        }
    }

    // declarando jogada e verificando se é valida
    public int inserirPeca() {
        if (peca[linha][coluna] == '0') {
            peca[linha][coluna] = getSimbolo();
            return 1;
        } else {
            System.out.println("*****Jogada invalida*****");
            return -1;
        }
    }

    // metodo sinalizando o fim do looping
    public void fimJogo() {
        System.out.println("*****Fim de jogo!*****");
        if (existeVencedor() == true)
            System.out.println("--O vencedor e o jogador " + peca[linha][coluna] + ".--");
        else if (jogoEmpate() == true)
            System.out.println("--Deu empate.--");
    }

    // imprimindo a matriz
    public void apresentarPecas() {
        for (int i = 0; i < peca.length; i++) {
            for (int j = 0; j < peca[i].length; j++) {
                System.out.print(peca[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // verifica se há vencedor em alguma linha, coluna ou nas diagonais
    public boolean existeVencedor() {
        int cont = 0;
        for (int i = 0; i < peca.length; i++) {
            if ((peca[i][0] != '0') && (peca[i][0] == peca[i][1]) && (peca[i][0] == peca[i][2])) {
                cont += 1;
            }
        }
        for (int j = 0; j < peca[i].length; j++) {
            if ((peca[0][j] != '0') && (peca[0][j] == peca[1][j]) && (peca[0][j] == peca[2][j])) {
                cont += 1;
            }
        }
        if (cont > 0)
            return true;
        if ((peca[0][0] != '0') && (peca[0][0] == peca[1][1]) && (peca[0][0] == peca[2][2])) {
            return true;
        }
        if ((peca[2][0] != '0') && (peca[2][0] == peca[1][1]) && (peca[2][0] == peca[0][2])) {
            return true;
        } else
            return false;
    }

    // verifica empate. Obs.: Ainda não percebi uma forma de verificar sem analisar
    // todos os indices
    public boolean jogoEmpate() {
        int cont = 0;
        for (int i = 0; i < peca.length; i++) {
            for (int j = 0; j < peca[i].length; j++) {
                if (peca[i][j] != '0')
                    cont += 1;
            }
        }
        if (cont == 9) {
            return true;
        } else
            return false;
    }
}