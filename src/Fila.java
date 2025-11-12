public class Fila {
    private int inicio;
    private int fim;
    private int total;
    private String[] elementos;

    public Fila(int size){
        inicio = 0;
        fim = 0;
        total = 0;
        elementos = new String[size];
    }

    public void enqueue(String valor){ // Inserir na fila
        if (total == elementos.length){ // Se tiver cheio
            System.out.println("Não é possível dar queue. A fila está cheia.");
        } else{
            elementos[fim] = valor;
            fim = (fim + 1) % elementos.length; // Valeu Prof. Isidro! (Youtube).
            total++;
        }
    }

    public String dequeue() {
        if (!isEmpty()){
            String valor = elementos[inicio];
            inicio = (inicio + 1) % elementos.length;
            total--;
            return valor;
        } else {
            System.out.println("Não é possível dar dequeue. A fila está vazia.");
            return null;
        }
    }

    public boolean isEmpty(){
        return total==0;
    }
}
