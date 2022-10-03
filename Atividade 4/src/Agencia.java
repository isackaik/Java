import java.util.ArrayList;
import java.util.Comparator;

public class Agencia {

    private String nome;
    private ArrayList<Conta> contas = new ArrayList<Conta>();

    public Agencia(String n){
        this.nome = n;
        System.out.println(n);
    }

    public void criarConta(String[] c){
        if(c[0].equals("365") && c[1].equals("RO")){
            relatorioContas();
        }
        else if (c[1].equals("CC")){
            Conta conta = new Comum(c[2]);
            contas.add(conta);
        }
        else if (c[1].equals("CP")){
            Conta conta = new Poupanca(c[2]);
            contas.add(conta);
        }
        else if(c[1].equals("CE")){
            Conta conta = new Especial(c[2], Double.parseDouble(c[3]));
            contas.add(conta);
        }
        else if(c[1].equals("D")){
            for(Conta i : contas){
                if(i.identificador.equals(c[2]))
                    i.deposito(Double.parseDouble(c[3]));
            }
        }
        else if(c[1].equals("R")){
            for(Conta i : contas){
                if(i.identificador.equals(c[2]))
                    i.retirada(Double.parseDouble(c[3]));
            }
        }
        else if(c[1].equals("VP")){
            Poupanca.rendimento(Double.parseDouble(c[2]));
        }
        else if(c[1].equals("VE")){
            Especial.jurosEspecial(Double.parseDouble(c[2]));
        }

    }

    public  void relatorioContas(){
        contas.sort(Comparator.comparing(Conta::toString)); //comparando objetos baseado no metodo toString e ordenando
        for (Conta i : contas)
            System.out.println(i);
    }
}

