import java.util.Iterator;

public class iteratorPilha<T> implements Iterator<T> {

    public Pilha<T> itPilha;

    public iteratorPilha(Pilha<T> p){
        itPilha = p;
    }

    @Override
    public boolean hasNext() {
        return itPilha.topo != null;
    }

    @Override
    public T next() {
        T saida = itPilha.topo.elemento;
        itPilha.retirar();
        return saida;

    }
}
