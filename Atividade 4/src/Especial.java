public class Especial extends Conta{
    private static double juros;
    public double limite;

    public Especial(String cpf, double limite) {
        super(cpf);
        this.limite = limite;
    }

    public static void jurosEspecial(double taxa){
        juros = taxa/100;
    }

    public void retirada(double valor){
        if((saldo+limite - valor) >= 0){
            saldo -= valor;
        }
        else if((saldo+limite - valor) < 0){
            double aux = valor - (saldo+limite);
            valor = valor - aux;
            saldo -= valor;
        }
    }

    @Override
    public String toString() {
        if(saldo < 0){
            return this.identificador + " " + (this.saldo+(saldo*juros));
        }
        return this.identificador + " " + this.saldo;
    }
}
