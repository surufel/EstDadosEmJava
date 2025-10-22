public class ListaEncadeada<T> {

    private No<T> inicio;
    private int size;

    public void add(T elemento){ // Adiciona elemento na lista encadeada (NAO no final)
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
        this.size++; // Incrementa no construtor, pq para cada elemento add na instancia, o size aumenta +1
    }

    public int getSize(){ // Retorna o tamanho da lista encadeada
        return this.size;
    }

    @Override
    public String toString() { // Retorna o elemento inicial da lista encadeada
        return "ListaEncadeada{" + "inicio= " + inicio + "}";
    }

}