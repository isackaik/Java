import java.util.Random;

public class Veiculo {
    Random aleat = new Random();
    protected double velocidade, extensao;

    public double comprimento() {
        return extensao = (2 * aleat.nextDouble()) + 3;
    }

    public double tempoAtendimento() {
        return comprimento() / velocidade;
    }

}