public class JogadorHumano {

    private char simbolo;
    protected int linha, coluna;
    int i, j;

    public JogadorHumano(char getSimbolo, int obterLinha, int obterColuna) {

    }

    public char getSimbolo() {
        return this.simbolo;
    }

    public void obterSimbolo(String str) {
        this.simbolo = str.charAt(0);
    }

    public int obterLinha(int l) {
        this.linha = l - 1;
        return linha;
    }

    public int obterColuna(int c) {
        this.coluna = c - 1;
        return coluna;
    }
}
