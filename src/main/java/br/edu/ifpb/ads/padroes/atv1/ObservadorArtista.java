package br.edu.ifpb.ads.padroes.atv1;


public class ObservadorArtista implements Observador {


    private final String artista;
    private final CanalNotificacao canal;


    public ObservadorArtista(String artista, CanalNotificacao canal) {
        this.artista = artista;
        this.canal = canal;
    }


    @Override
    public void notificar(Disco disco) {
        if (disco.getArtista().toLowerCase().contains(artista.toLowerCase())) {
            canal.enviar("Novo disco do artista: " + disco.getArtista());
        }
    }
}
