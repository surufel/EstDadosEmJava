public class ListaEncadeada<T> {
    private No<T> inicio;
    private int size;
    public void add(T elemento){
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
        this.size++; // Incrementa no construtor, pq para cada elemento add na instancia, o size aumenta +1
    }

    public int getSize(){
        return this.size;
    }
    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}