import java.util.Random;

public class BalcaoPedagio {
    int cont = 0;
    private int qtdVeiculos;
    private double tempoAtendimento;

    public BalcaoPedagio() {

    }

    public void atenderVeiculo(Veiculo v) {
        Random aleatorio = new Random();
        double chegada = 2 * aleatorio.nextDouble();
        double aux = v.tempoAtendimento() + (4 / v.velocidade) + chegada;
        if ((tempoAtendimento + aux) <= 300) {
            qtdVeiculos++;
            tempoAtendimento = tempoAtendimento + aux;
        } else
            cont++;
    }

    public double tempoMedioAtendimento() {
        return tempoAtendimento / qtdVeiculos;
    }

}
