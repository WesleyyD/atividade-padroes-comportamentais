package br.edu.ifpb.ads.padroes.atv1;


import java.util.LinkedList;
import java.util.List;


public class RepositorioDiscos {


    private List<Disco> discos = new LinkedList<>();
    private List<Observador> observadores = new LinkedList<>();


    public List<Disco> buscarDiscos(String titulo) {
        return discos.stream().filter(d -> d.getTitulo().toLowerCase()
                .contains(titulo.toLowerCase())).toList();
    }


    public List<Disco> buscarDiscosPorArtista(String artista) {
        return discos.stream().filter(d -> d.getArtista().toLowerCase()
                .contains(artista.toLowerCase())).toList();
    }


    public List<Disco> buscarDiscosPorGenero(String genero) {
        return discos.stream().filter(d -> d.getGenero().toLowerCase()
                .contains(genero.toLowerCase())).toList();
    }


    public List<Disco> buscarDiscosPorAno(int ano) {
        return discos.stream().filter(d -> d.getAnoLancamento() == ano).toList();
    }


    public void addDisco(Disco disco) {
        discos.add(disco);
        notificarObservadores(disco);
    }


    public void removeDisco(Disco disco) {
        discos.remove(disco);
    }


    public void addObservador(Observador observador) {
        observadores.add(observador);
    }


    public void removeObservador(Observador observador) {
        observadores.remove(observador);
    }




    private void notificarObservadores(Disco disco) {
        observadores.forEach(obs -> obs.notificar(disco));
    }
}
