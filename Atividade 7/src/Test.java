public class Test {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        pilha.inserir(55);
        pilha.inserir(22);
        pilha.inserir(13);

        iteratorPilha<Integer> it = new iteratorPilha<>(pilha);

        while(it.hasNext()){
            System.out.println(it.next());
        }

        pilha.inserir(33);
        pilha.inserir(44);
        pilha.retirar();
        pilha.inserir(55);
        pilha.inserir(66);

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
