public class Iphone{
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();

        reprodutor.selecionarMusica(null);
        reprodutor.tocarMusica(null);
        reprodutor.pausarMusica();
        telefone.ligar();
        telefone.atenderChamada();
        telefone.iniciarCorreioDeVoz();
        navegador.exibirPagina(null);
        navegador.adicionarNovaAba(null);
        navegador.atualizarPagina();
    }
}

