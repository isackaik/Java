class MyList<T> {

    private No<T> inicio = null;
    private int size = 0;

    public MyList() {

    }

    public void addBegin(T elemento) {
        No<T> celula = new No<>();
        celula.elemento = elemento;
        celula.proximo = inicio;
        inicio = celula;
        size++;
    }

    public void addEnd(T elemento) {
        No<T> celula = new No<>();
        celula.elemento = elemento;
        if (inicio == null) {
            celula.proximo = null;
            inicio = celula;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = celula;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (inicio == null)
            return null;
        else {
            No<T> atual = inicio;
            int posicao = 0;
            do {
                if (posicao != index) {
                    posicao++;
                    atual = atual.proximo;
                }
                return atual.elemento;
            } while (posicao != index);
        }
    }

    public String[] toArray() {
        String[] array = new String[size];
        No<T> atual = inicio;
        for (int i = 0; i < size; i++) {
            array[i] = atual.elemento.toString();
            atual = atual.proximo;
        }
        return array;
    }

}
