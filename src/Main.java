public class Main{
    public static void main(String[] args){
        System.out.println("Aprendendo Est. De Dados em Java.");
        ListaEncadeada lista = new ListaEncadeada<Integer>();
        System.out.println(lista);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista);
        System.out.println("Tamanho da lista:" + lista.getSize());
        lista.clear();
        System.out.println(lista);
        System.out.println("Tamanho da lista:" + lista.getSize());
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        System.out.println(lista);
        System.out.println("Tamanho da lista:" + lista.getSize());
        // Visualmente isso seria algo mais ou menos assim: [1]->[2]->[3]->NULL
        // O sout da lista ja mostra isso.
        System.out.println("Buscando elemento 30 na lista acima");
        System.out.println("Ele se encontra no indice: " + lista.buscaElemento(30) + " (Caso -1, nao encontrou o indice)");
        System.out.println("Elemento na posicao 2: " + lista.buscaPosicao(2));
    }
}

