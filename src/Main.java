public class Main{
    public static void main(String[] args){
        System.out.println("Aprendendo Est. De Dados em Java.");
        ListaEncadeada lista = new ListaEncadeada<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(1);
        System.out.println(lista);
        System.out.println("Tamanho da lista:" + lista.getSize());
        // Visualmente isso seria algo mais ou menos assim: [1]->[2]->[1]->NULL
        // O sout da lista ja mostra isso.
    }
}

