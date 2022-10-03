public class Main {

    public static void main(String[] args) {
        MyList<String> lista = new MyList<>();

        lista.addBegin("10");
        lista.addBegin("5");
        lista.addEnd("20");
        lista.addBegin("15");
        System.out.println(lista);
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Elemento: " + lista.get(0));

        for (String i : lista.toArray())
            System.out.println(i);
    }
}
