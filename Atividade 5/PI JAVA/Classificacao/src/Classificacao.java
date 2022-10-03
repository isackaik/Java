import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Classificacao {

    public static void main(String[] args) {

        ArrayList<Competidores> competidor = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        String input = leitor.nextLine();
        while (!input.equals("*")) {
            String[] linha = input.trim().split(",");
            int aux = 0;
            for (Competidores i : competidor) {
                if (i.getName().equals(linha[0])) {
                    switch (linha[1]) {
                        case "ouro" -> i.setOuro();
                        case "prata" -> i.setPrata();
                        case "bronze" -> i.setBronze();
                    }
                    aux++;
                }
            }
            if (aux == 0) {
                Competidores c = new Competidores(linha[0], linha[1]);
                competidor.add(c);
            }
            input = leitor.next();
        }
        Collections.sort(competidor);
        int posicao = 1;
        for (Competidores i : competidor) {
            System.out.println(posicao + ")" + i.toString());
            posicao++;
        }
        leitor.close();
    }
}
