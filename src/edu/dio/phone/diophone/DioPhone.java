package edu.dio.phone.diophone;

import edu.dio.phone.webbrowser.WebBrowser;
import edu.dio.phone.musicplayer.MusicPlayer;
import edu.dio.phone.telefone.Telefone;


public class DioPhone implements MusicPlayer, Telefone, WebBrowser {
    private boolean isPlaying = false;
    String modelo = "Myphone";

    @Override
    public void tocarMusica(String music) {
        if (isPlaying) {
            System.out.println("A musica " + music + " Já está tocando");
        } else {
            isPlaying = true;
            System.out.println("tocando musica " + music);
        }
    }

    @Override
    public void pararMusica() {
        if (!isPlaying){
            System.out.println("Nenhuma musica está tocando no momento");
        } else {
            isPlaying = false;
            System.out.println("A musica foi pausada");
        }
    }

    @Override
    public void musicList() {
        System.out.println("Lista de musicas disponiveis");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Efetuando ligação para o numero " + numero);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada");
    }

    @Override
    public void historicoChamadas() {
        System.out.println("Historico de chamadas");

        //método para acessar o historico de chamadas,
        // @return List<Chamadas>;

    }


    @Override
    public void carregarPagina(String url) {
        // métodos para efetuar todo o processamento dos pacotes https
        System.out.println("Pagina " +url+" carregada");

    }

    @Override
    public void historico() {
        // método para acessar o historico
        System.out.println("Sites visitados ...");
    }

    @Override
    public void downloads() {
        // método para acessar o diretório de downloads e listalos
        System.out.println("Downloads: ");
    }
}
