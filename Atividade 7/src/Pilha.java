public class Pilha<T> implements Lista<T>{

    public No<T> topo = null;

    public void inserir(T item) {
        No<T> celula = new No<>();
        celula.elemento = item;
        if (topo == null) {
            celula.proximo = null;
        } else {
            celula.proximo = topo;
        }
        topo = celula;
    }

    public T retirar(){
        if(topo == null){
            System.out.println("Lista vazia");
            return null;
        }
        else{
            T saida = topo.elemento;
            topo = topo.proximo;
            return saida;
        }
    }

    public void limpar() {
        No<T> atual;

        do {
            retirar();
            atual = topo;
        } while(atual != null);
    }
}
