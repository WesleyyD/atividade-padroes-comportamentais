package br.edu.ifpb.ads.padroes.atv1;


public class Main {


    public static void main(String[] args) {
        RepositorioDiscos repo = new RepositorioDiscos();


        repo.addObservador(new ObservadorTitulo("Abbey Road", new CanalEmail()));
        repo.addObservador(new ObservadorArtista("Beatles", new CanalSMS()));
        repo.addObservador(new ObservadorGenero("Rock", new CanalPush()));
        repo.addObservador(new ObservadorGenero("Rock", new CanalEmail()));


        System.out.println(">>> Adicionando: Abbey Road - Beatles - Rock <<<");
        repo.addDisco(new Disco("Beatles", "Abbey Road", "Rock", 1969));


        System.out.println("\n>>> Adicionando: Let It Be - Beatles - Pop <<<");
        repo.addDisco(new Disco("Beatles", "Let It Be", "Pop", 1970));


        System.out.println("\n>>> Adicionando: Nevermind - Nirvana - Rock <<<");
        repo.addDisco(new Disco("Nirvana", "Nevermind", "Rock", 1991));


        System.out.println("\n>>> Adicionando: Thriller - Michael Jackson - Pop <<<");
        repo.addDisco(new Disco("Michael Jackson", "Thriller", "Pop", 1982));
    }
}
