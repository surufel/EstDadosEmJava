public class Pilha {
    private int top;
    private String[] elementos;

    public Pilha(int size) {
        this.top = -1; // Pilha vazia, quando adicionado algo, ele vai seguir o numero de indices
        this.elementos = new String[size];
    }

    public int peek() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public boolean isEmpty(){
        return (this.top == -1) ? true : false;
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("Pilha vazia");
        }
        elementos[top] = null;
        top--;
    }
    public void push(String valor){ // Coloca um elemento na pilha
        if (this.top == this.elementos.length - 1){ // Se o topo tiver igual ao tamanho da lista elemento
            System.out.println("A pilha está cheia");
        }
        top++;
        elementos[top] = valor;
    }
}