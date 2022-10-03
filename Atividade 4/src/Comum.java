public class Comum extends Conta{

    public Comum(String cpf) {
        super(cpf);
    }

    @Override
    public String toString() {
        return this.identificador + " " + this.saldo;
    }
}
