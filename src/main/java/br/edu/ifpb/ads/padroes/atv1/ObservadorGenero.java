package br.edu.ifpb.ads.padroes.atv1;


public class ObservadorGenero implements Observador {


    private final String genero;
    private final CanalNotificacao canal;


    public ObservadorGenero(String genero, CanalNotificacao canal) {
        this.genero = genero;
        this.canal = canal;
    }


    @Override
    public void notificar(Disco disco) {
        if (disco.getGenero().toLowerCase().contains(genero.toLowerCase())) {
            canal.enviar("Novo disco do gênero: " + disco.getGenero());
        }
    }
}
