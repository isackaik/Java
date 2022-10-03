import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try{
            FileInputStream arquivo = new FileInputStream("D://teste.txt");
            InputStreamReader leitor = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(leitor); //para ler linha a linha

            String linha;

            do{
                linha = br.readLine();
                if (linha != null) {
                    String[] coluna = linha.split(";");
                    if (coluna[1].equals("CA")) {
                        Agencia agencia = new Agencia(coluna[2]);
                        while(linha != null){
                            String[] c = linha.split(";");
                            agencia.criarConta(c);
                            linha = br.readLine();
                        }
                    }
                    else{
                        System.out.println("Não foi definida a agencia.");
                    }
                }
            }while (linha != null);
            arquivo.close();
        }
        catch (Exception e){
            System.out.println("Erro ao ler arquivo");
        }
    }
}
