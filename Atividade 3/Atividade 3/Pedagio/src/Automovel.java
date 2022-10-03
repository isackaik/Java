public class Automovel extends Veiculo {

    public Automovel() {
        comprimento();
        velocidade = (2 * aleat.nextDouble()) + 3;
        tempoAtendimento();
    }
    
}
