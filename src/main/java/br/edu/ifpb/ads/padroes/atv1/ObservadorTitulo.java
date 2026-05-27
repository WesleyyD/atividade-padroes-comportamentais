package br.edu.ifpb.ads.padroes.atv1;


public class ObservadorTitulo implements Observador {


    private final String titulo;
    private final CanalNotificacao canal;


    public ObservadorTitulo(String titulo, CanalNotificacao canal) {
        this.titulo = titulo;
        this.canal = canal;
    }


    @Override
    public void notificar(Disco disco) {
        if (disco.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
            canal.enviar("Novo disco adicionado: " + disco.getTitulo());
        }
    }
}
