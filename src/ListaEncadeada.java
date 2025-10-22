public class ListaEncadeada<T> {

    private No<T> inicio; // Acesso do elemento inicial
    private No<T> ultimo; // Acesso do elemento final
    private int size;

    public void add(T elemento) { // Adiciona elemento na lista encadeada (NAO no final)
        No<T> celula = new No<T>(elemento);
        if (this.size == 0) {
            this.inicio = celula; // O inicio vai ser o elemento
        } else {
            this.ultimo.setProximo(celula); // O ultimo elemento sera o proximo elemento
        }
        this.size++; // Incrementa no construtor, pq para cada elemento add na instancia, o size aumenta +1
        this.ultimo = celula;
    }

    public int getSize() { // Retorna o tamanho da lista encadeada
        return this.size;
    }

    @Override
    public String toString() { // Retorna o elemento inicial da lista encadeada
        // "ListaEncadeada{" + "inicio= " + inicio + "}";
        if (this.size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        No<T> atual = this.inicio;
        builder.append(atual.getElemento()).append(",");

        for (int i = 0; i < this.size - 1; i++) {
            atual = atual.getProximo();
            builder.append(atual.getElemento()).append(",");
        }
        builder.append(atual.getProximo()).append("]");
        return builder.toString();
    }
}