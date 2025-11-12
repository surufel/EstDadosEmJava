public class NavegacaoWeb { //Essa classe vai ser utilizada para o entendimento de pilhas
    // Usando de base a segunda questão da lista de exercicios do prof. Dimmy Magalhães de Est. de Dados
    private Pilha voltar;
    private Pilha avancar;
    private String paginaAtual;

    public NavegacaoWeb(){
        voltar = new Pilha(10); // historicoVoltar
        avancar = new Pilha(10); //historicoAvancar
        paginaAtual = "Home";
    }
    public void retrocederPagina(){
        if(!voltar.isEmpty()){
            avancar.push(paginaAtual);
            paginaAtual = voltar.pop();
            System.out.println("Retrocedendo para a página:" + paginaAtual);
        }
        else{
            System.out.println("Nenhuma página para retornar..");
        }
    }
        public void avancarPagina(){
            if (!avancar.isEmpty()) {
                voltar.push(paginaAtual);
                paginaAtual = avancar.pop();
                System.out.println("Avançando para a página: " + paginaAtual);
            }
            else{
                System.out.println("Nenhuma página para avançar.");
            }
        }

        public void visitarPagina(String novaPagina){
                voltar.push(paginaAtual);
                paginaAtual = novaPagina;
                avancar.limpar();
                System.out.println("Página Atual: " + paginaAtual);
        }
}
