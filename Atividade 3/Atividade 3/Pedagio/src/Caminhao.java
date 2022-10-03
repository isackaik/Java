public class Caminhao extends Veiculo {

    private double carroceria;

    public Caminhao() {
        carroceria = (5 * aleat.nextDouble()) + 10;
        velocidade = (1.5 * aleat.nextDouble()) + 2;
        tempoAtendimento();
    }

    public double comprimento() {
        if (aleat.nextBoolean() == true)
            return extensao = (aleat.nextDouble()) + 3 + carroceria;
        else
            return extensao = (aleat.nextDouble()) + 3;
    }

}
