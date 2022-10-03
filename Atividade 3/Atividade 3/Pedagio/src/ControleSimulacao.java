import java.util.Random;

public class ControleSimulacao {

    public static void main(String[] args) {

        BalcaoPedagio balcao = new BalcaoPedagio();
        while (balcao.cont < 1) {
            Random aleatorio = new Random();
            Boolean veic = aleatorio.nextBoolean();
            if (veic == true) {
                Veiculo b = new Automovel();
                balcao.atenderVeiculo(b);
                System.out.println("\n");

            } else {
                Veiculo b = new Caminhao();
                balcao.atenderVeiculo(b);
                System.out.println("\n");
            }
        }
        System.out.println("Tempo médio de atendimento: " + balcao.tempoMedioAtendimento());
    }
}
