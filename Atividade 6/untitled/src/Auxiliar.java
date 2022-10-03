import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Integer;
import java.lang.Float;

public class Auxiliar {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Candidato> candidatos = new ArrayList<>();
        Map<String, Candidato> map = new TreeMap<>();
        Scanner input = new Scanner(System.in);
        Scanner leitor = new Scanner (new File("D://prova.txt"));

        try{
            StringBuilder linhas = new StringBuilder();
            while(leitor.hasNext()){ // transformando arquivo em uma so linha
                linhas.append(" ").append(leitor.nextLine());
            }
            String[] registro = linhas.toString().split("/");
            for (String s : registro) { // criacao e inclusao de candidatos na lista
                String[] info = s.split(",");
                Candidato c = new Candidato(info[0].trim(), info[1].trim(),
                                    Float.parseFloat(info[2].trim()), Integer.parseInt(info[3].trim()),
                                    Float.parseFloat(info[4].trim()), Integer.parseInt(info[5].trim()),
                                    Float.parseFloat(info[6].trim()));
                candidatos.add(c);
                map.put(info[1].trim().toUpperCase(), c);
            }
            Collections.sort(candidatos);
            System.out.println("Melhores candidatos: ");
            System.out.println(candidatos.get(0).resultado());
            System.out.println(candidatos.get(1).resultado());
            System.out.println(candidatos.get(2).resultado());
            System.out.println(candidatos.get(3).resultado());
            System.out.println(candidatos.get(4).resultado());

            String busca = "";
            while(! busca.equals("*")){
                System.out.println("\nCaso queira, pesquise por um candidato. Se nao, digite '*':");
                busca = input.nextLine();
                if(map.containsKey(busca.toUpperCase()))
                    System.out.println(map.get(busca.toUpperCase()));
                else System.out.println("Candidado inexistente.");
            }
        }
        catch (Exception f){
            System.out.println("Arquivo nao encontrado: " + leitor);
        }
        input.close();
    }
}
