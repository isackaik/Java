abstract public class Conta {

    protected double saldo;
    protected String identificador;

    public Conta(String cpf){
        this.identificador = cpf;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void retirada(double valor){
        this.saldo -= valor;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
