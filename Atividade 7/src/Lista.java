class No<T>{

    protected T elemento;
    protected No<T> proximo;

    public No(){
        elemento = null;
        proximo = null;
    }
}

public interface Lista<T> {

    void inserir(T item);
    T retirar();
    void limpar();
}

