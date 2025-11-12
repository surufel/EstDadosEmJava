public class Main{
    public static void main(String[] args){
        System.out.println("Aprendendo Est. de Dados em Java: Pilhas");
        NavegacaoWeb web = new NavegacaoWeb();
        web.visitarPagina("Youtube.com");
        web.visitarPagina("Instagram.com");
        web.visitarPagina("Spotify.com");
        web.retrocederPagina();
        web.retrocederPagina();
        web.avancarPagina();
        web.avancarPagina();

        // Forçar limite
        web.retrocederPagina();
        web.retrocederPagina();
        web.retrocederPagina();
        web.retrocederPagina();

        web.avancarPagina();
        web.avancarPagina();
        web.avancarPagina();
        web.avancarPagina();
        }
}



        /*System.out.println("Aprendendo Est. De Dados em Java.");
        ListaEncadeada lista = new ListaEncadeada<Integer>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        System.out.println(lista);
        System.out.println("Tamanho da lista:" + lista.getSize());
        System.out.println("Buscando elemento 30 na lista acima");
        System.out.println("Ele se encontra no indice: " + lista.buscaElemento(30) + " (Caso -1, nao encontrou o indice)");
        System.out.println("Elemento na posicao 2: " + lista.buscaPosicao(2));*/
