public class ListaEncadeada<T> {

    private No<T> inicio; // Acesso do elemento inicial
    private No<T> ultimo; // Acesso do elemento final
    private int size;

    public void add(T elemento){ // Adiciona elemento na lista encadeada (NAO no final)
        No<T> celula = new No<T>(elemento);
        if(this.size == 0){
          this.inicio = celula; // O inicio vai ser o elemento
        } else {
            this.ultimo.setProximo(celula); // O ultimo elemento sera o proximo elemento
        }
        this.size++; // Incrementa no construtor, pq para cada elemento add na instancia, o size aumenta +1
        this.ultimo = celula;
    }

    public int getSize(){ // Retorna o tamanho da lista encadeada
        return this.size;
    }

    public void percorrerLista(ListaEncadeada<T> lista){
        System.out.println("PRIMEIRO ELEMENTO DA LISTA:" + this.inicio);
        while(this.inicio != null){
            this.inicio = inicio.getProximo();
            System.out.println("PERCORRENDO . . . :" + this.inicio);
            if (this.inicio.getProximo() == null){
                System.out.println("NENHUM ELEMENTO ENCONTRADO, FIM DA LISTA");
            }
        }
    }

    @Override
    public String toString() { // Retorna o elemento inicial da lista encadeada
        return "ListaEncadeada{" + "inicio= " + inicio + "}";
    }

}