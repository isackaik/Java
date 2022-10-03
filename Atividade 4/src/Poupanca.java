public class Poupanca extends Conta{
    private static double rend = 1;

    public Poupanca(String cpf) {
        super(cpf);
    }

    public static void rendimento(double taxa){
        rend = taxa/100;
    }

    @Override
    public String toString() {
        return this.identificador + " " + (this.saldo + (this.saldo*rend));
    }
}
