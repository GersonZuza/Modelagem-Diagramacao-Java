public class Main {
    public static void main(String[] args) {

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.setTocar("Tocar musica");
        reprodutorMusical.setPausar("Pausar musica");
        reprodutorMusical.setSelecionarMusica("Formas de amar");

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.setLigar("Ligar para Laina");
        aparelhoTelefonico.setAtender("Atender ligação");
        aparelhoTelefonico.setIniciarCorreioVoz("Entrou na caixa postal");

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.setExibirPagina("Https://www.uol.com.br");
        navegadorInternet.setAdicionarNovaAba("Adicionar nova aba");
        navegadorInternet.setAtualizarPagina("Atualizar página");


        System.out.println("Tocar musica " + reprodutorMusical.getTocar());
        System.out.println("Reprodutor pausado " + reprodutorMusical.getPausar());
        System.out.println("Selecionar musica " + reprodutorMusical.getSelecionarMusica());

        System.out.println("Ligar para Laina " + aparelhoTelefonico.getLigar());
        System.out.println("Atender ligação " + aparelhoTelefonico.getAtender());
        System.out.println("Entrou na caixa postal " + aparelhoTelefonico.getIniciarCorreioVoz());

        System.out.println("Https://www.uol.com.br " + navegadorInternet.getExibirPagina());
        System.out.println("Adicionar nova aba " + navegadorInternet.getAdicionarNovaAba());
        System.out.println("Atualizar página " + navegadorInternet.getAtualizarPagina());
    }
}