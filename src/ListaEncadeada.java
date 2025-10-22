public class ListaEncadeada<T> {

    private No<T> inicio; // Acesso do elemento inicial
    private No<T> ultimo; // Acesso do elemento final
    private int size;
    private final int NaoEncontrado = -1;

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

    public void clear(){
        for (No<T> atual = this.inicio; atual != null;){
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
            /* Limpa a lista, buscando todos os elementos enquanto a lista
            nao for vazia, nao tem motivo para deixar a incrementacao ou decrementacao pq de certa forma ja tem
            o controle do for por conta da condicao, ent o loop nn vai ser infinito */
        }

        this.inicio = null;
        this.ultimo = null;
        this.size = 0;
    }

    public int buscaElemento(T elemento){
        No<T> NoAtual = this.inicio;
        int posicao = 0;
        while(NoAtual != null){
            if (NoAtual.getElemento().equals(elemento)){
                return posicao;
            }
            posicao++;
            NoAtual = NoAtual.getProximo();
        }
        return NaoEncontrado;
    }

    private No<T> buscaNo(int posicao){
        if (!(posicao >= 0 && posicao < this.size)){
            throw new IllegalArgumentException("Posicao nao existe");
        }
        No<T> NoAtual = this.inicio;
        for (int i = 0; i <= posicao; i++){
            NoAtual = NoAtual.getProximo();
        }
        return NoAtual;
    }
    public T buscaPosicao(int posicao){
        return this.buscaNo(posicao).getElemento();
    }

    public int getSize() { // Retorna o tamanho da lista encadeada
        return this.size;
    }

    @Override
    public String toString() { // Retorna a lista
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